package functionaltests.stepdefinitions;


import functionaltests.pageobjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class CommonSteps {
    final static Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Managed
    WebDriver driver;

    LoginPage loginPage;

    @Given("I go to the Login page")
    public void i_go_to_the_login_page() {
        loginPage.open();
    }


    @After(order = 1)
    public void tearDown() {
        logger.info("Closing webdriver...");
        driver.close();
        driver.quit();
        System.gc();
    }

}
