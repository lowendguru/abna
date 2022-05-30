package functionaltests.stepdefinitions;


import functionaltests.pageobjects.LoginPage;
import io.cucumber.java.en.Given;

public class CommonSteps {

    LoginPage loginPage;

    @Given("I go to the Login page")
    public void i_go_to_the_login_page() {
        loginPage.open();
    }


}
