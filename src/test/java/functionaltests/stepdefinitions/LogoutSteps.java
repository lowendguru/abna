package functionaltests.stepdefinitions;

import functionaltests.pageobjects.HomePage;
import functionaltests.pageobjects.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class LogoutSteps {

    LoginPage loginPage;
    HomePage homePage;


    @When("I click the user menu button")
    public void i_click_the_user_menu_button() {
        homePage.header.userMenuButton.click();
    }

    @Then("^the Sign Out button (.*) displayed")
    public void the_sign_out_button_is_displayed(String value) {
        switch (value) {
            case "is":
                Assertions.assertThat(homePage.header.logoutButton.isVisible()).describedAs("Logout button is not displayed").isTrue();
                break;
            case "is not":
                Assertions.assertThat(homePage.header.logoutButton.isVisible()).describedAs("Logout button is displayed").isFalse();
                break;
        }
    }

    @When("I click on the Sign Out button")
    public void i_click_on_the_sign_out_button() {
        homePage.header.logoutButton.click();
    }

}
