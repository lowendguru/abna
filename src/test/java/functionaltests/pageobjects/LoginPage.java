package functionaltests.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("page:login.page")
public class LoginPage extends BasePage {

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(css = ".btn-login")
    public WebElementFacade loginButton;

    @FindBy(css = ".login h1")
    public WebElementFacade loginWelcomeText;
}
