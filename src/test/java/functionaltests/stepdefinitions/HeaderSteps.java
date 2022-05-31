package functionaltests.stepdefinitions;

import functionaltests.pageobjects.sections.Header;
import io.cucumber.java.en.And;

public class HeaderSteps {

    Header header;

    @And("^I click on the (.*) button of the header navigation$")
    public void i_click_button_header_navigation(String buttonName) {
        switch (buttonName) {
            case "Products":
                header.productsButton.click();
                break;
            case "Contact":
                header.contactButton.click();
                break;
            case "Home":
                header.homeButton.click();
                break;
        }

    }
}
