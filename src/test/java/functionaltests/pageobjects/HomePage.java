package functionaltests.pageobjects;

import functionaltests.pageobjects.sections.Header;
import lombok.Getter;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;

@Getter
public class HomePage extends BasePage {

    Header header;

    @FindBy(css = ".div-container")
    public WebElement mainText;

}
