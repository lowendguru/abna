package functionaltests.pageobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:login.page")
public class LoginPage extends BasePage {

	@FindBy(id = "email")
	WebElement emailField;

	@FindBy(id = "password")
	WebElement passwordField;

	@FindBy(id = "login")
	WebElement loginButton;
	
	@FindBy(css = ".login h1")
	WebElement loginWelcomeText;
}
