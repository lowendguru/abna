package functionaltests.pageobjects;

import functionaltests.pageobjects.sections.Header;
import lombok.Getter;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;

public class HomePage extends BasePage {

    public Header header;

    @FindBy(css = ".div-container")
    public WebElement mainText;

}
