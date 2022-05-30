package functionaltests.pageobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;


public class HomePage extends BasePage {

	@FindBy(css = ".div-container")
	WebElement mainText;

}
