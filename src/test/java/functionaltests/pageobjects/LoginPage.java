package functionaltests.pageobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:login.page")
public class LoginPage extends BasePage {

	@FindBy(id = "email")
	public WebElement emailField;

	@FindBy(id = "password")
	public WebElement passwordField;

	@FindBy(id = "login")
	public WebElement loginButton;
	
	@FindBy(css = ".login h1")
	public WebElement loginWelcomeText;
}
