package functionaltests.stepdefinitions;


import functionaltests.pageobjects.LoginPage;
import io.cucumber.java.en.Given;

public class CommonSteps {

	LoginPage loginPage;


	@Given("hello")
	public void openPage() {
		loginPage.open();
		
	}
}
