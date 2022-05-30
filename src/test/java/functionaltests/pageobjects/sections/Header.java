package functionaltests.pageobjects.sections;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class Header {

	@FindBy(id = "navigation")
	public WebElement navigationHeader;

	@FindBy(css = ".home")
	public WebElement homeButton;

	@FindBy(css = ".products")
	public WebElement productsButton;
	
	@FindBy(css = ".contact")
	public WebElement contactButton;
	
	@FindBy(id = "user")
	public WebElement userMenuButton;
	
	@FindBy(id = "logout")
	public WebElementFacade logoutButton;
	
	
}
