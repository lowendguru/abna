package functionaltests.pageobjects.sections;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class Header {

	@FindBy(id = "navigation")
	WebElement navigationHeader;

	@FindBy(css = ".home")
	WebElement homeButton;

	@FindBy(css = ".products")
	WebElement productsButton;
	
	@FindBy(css = ".contact")
	WebElement contactButton;
	
	@FindBy(id = "user")
	WebElement userMenuButton;
	
	@FindBy(id = "logout")
	WebElementFacade logoutButton;
	
	
}
