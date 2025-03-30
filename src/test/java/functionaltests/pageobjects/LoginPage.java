package functionaltests.pageobjects;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("page:login.page")
public class LoginPage extends BasePage {

    @FindBy(id = "email")
    public WebElementFacade emailField;

    @FindBy(id = "password")
    public WebElementFacade passwordField;

    @FindBy(css = ".btn-login")
    public WebElementFacade loginButton;

    @FindBy(css = ".login h1")
    public WebElementFacade loginWelcomeText;
}
