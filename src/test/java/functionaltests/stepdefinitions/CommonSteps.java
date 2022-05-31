package functionaltests.stepdefinitions;


import functionaltests.pageobjects.BasePage;
import functionaltests.pageobjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.EnvironmentVariables;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class CommonSteps {
    final static Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private static EnvironmentVariables environmentVariables;

    @Managed
    WebDriver driver;

    BasePage basePage;
    LoginPage loginPage;

    @Given("I go to the Login page")
    public void i_go_to_the_login_page() {
        loginPage.open();
    }

    @Given("I login with valid credentials")
    public void i_login_with_valid_credentials() {
        loginPage.emailField.sendKeys(getProperty("validUsername"));
        loginPage.passwordField.sendKeys(getProperty("validPassword"));
        loginPage.loginButton.click();
    }

    @After(order = 1)
    public void tearDown() {
        logger.info("Closing webdriver...");
        driver.close();
        driver.quit();
        System.gc();
    }

    public static String getProperty(String propertyName) {
        return EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty(propertyName);
    }

    @Then("^the title of the page contains the word '(.*)'")
    public void theTitleOfThePageContainsTheWordProducts(String expectedText) {
        Assertions.assertThat(driver.getTitle()).describedAs("Title does not contain expected text").contains(expectedText);
    }

    @When("I open a new browser tab")
    public void i_open_a_new_browser_tab() {
        driver.switchTo().newWindow(WindowType.TAB);
    }

    @When("I go to the base url")
    public void i_go_to_the_base_url() {
        basePage.open();
    }

}
