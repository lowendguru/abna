package functionaltests.stepdefinitions;

import functionaltests.pageobjects.HomePage;
import functionaltests.pageobjects.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;

public class LoginSteps {

    LoginPage loginPage;
    HomePage homePage;


    @Then("all elements of the Login page are displayed")
    public void all_elements_of_the_login_page_are_displayed() {
        loginPage.waitForJStoLoad(10);
        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(loginPage.emailField.isDisplayed()).describedAs("Email Field is not displayed").isTrue();
            softly.assertThat(loginPage.passwordField.isDisplayed()).describedAs("Password Field is not displayed").isTrue();
            softly.assertThat(loginPage.loginButton.isDisplayed()).describedAs("Login button is not displayed").isTrue();
        });
    }

    @Then("^the welcome message of the Login page is '(.*)'")
    public void the_welcome_message_of_the_login_page_is(String expectedText) {
        Assertions.assertThat(loginPage.loginWelcomeText.getText()).describedAs("Login screen welcome text does not match expected").isEqualTo(expectedText);
    }

    @When("^I enter username (.*) in the login form")
    public void i_enter_username_in_the_login_form(String username) {
        loginPage.emailField.sendKeys(username);
    }

    @When("^I enter password (.*) in the login form")
    public void i_enter_password_in_the_login_form(String password) {
        loginPage.passwordField.sendKeys(password);
    }

    @When("I click the Login button of the login form")
    public void i_click_the_login_button_of_the_login_form() {
        loginPage.loginButton.click();
    }

    @Then("^the Home page main text (.*) displayed")
    public void the_home_page_displayed(String value) {
        switch (value) {
            case "is":
                Assertions.assertThat(homePage.mainText.isDisplayed()).describedAs("Home page text is not displayed").isTrue();
                break;
            case "is not":
                Assertions.assertThat(homePage.mainText.isVisible()).describedAs("Home page text is displayed").isFalse();
                break;
        }
    }

    @Then("the Header elements are displayed")
    public void the_header_elements_are_displayed() {
        homePage.waitForJStoLoad();
        Assertions.assertThat(homePage.header.navigationHeader.isDisplayed()).describedAs("Navigation header is not displayed").isTrue();
        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(homePage.header.homeButton.isDisplayed()).describedAs("Home button is not displayed").isTrue();
            softly.assertThat(homePage.header.productsButton.isDisplayed()).describedAs("Products button is not displayed").isTrue();
            softly.assertThat(homePage.header.contactButton.isDisplayed()).describedAs("Contact button is not displayed").isTrue();
            softly.assertThat(homePage.header.userMenuButton.isDisplayed()).describedAs("User menu button is not displayed").isTrue();
        });
    }
}
