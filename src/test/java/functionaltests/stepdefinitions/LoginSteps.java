package functionaltests.stepdefinitions;

import functionaltests.pageobjects.LoginPage;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;

public class LoginSteps {

    LoginPage loginPage;

    @Then("all elements of the Login page are displayed")
    public void all_elements_of_the_login_page_are_displayed() {
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
}
