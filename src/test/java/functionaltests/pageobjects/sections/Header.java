package functionaltests.pageobjects.sections;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class Header {

	@FindBy(id = "navigation")
	public WebElementFacade navigationHeader;

	@FindBy(css = ".home")
	public WebElementFacade homeButton;

	@FindBy(css = ".products")
	public WebElementFacade productsButton;
	
	@FindBy(css = ".contact")
	public WebElementFacade contactButton;
	
	@FindBy(id = "user")
	public WebElementFacade userMenuButton;
	
	@FindBy(id = "logout")
	public WebElementFacade logoutButton;
	
	
}
