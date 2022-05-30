package functionaltests.pageobjects;

import functionaltests.pageobjects.sections.Header;
import lombok.Getter;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;

public class HomePage extends BasePage {

    public Header header;

    @FindBy(css = ".div-container")
    public WebElementFacade mainText;

}
