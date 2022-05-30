package functionaltests.pageobjects;

import java.lang.invoke.MethodHandles;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {
	final static Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	WebDriver driver;

	public void clickByScript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].click();", element);
	}



	public boolean waitForJStoLoad() {
		return waitForJStoLoad(30);
	}

	public boolean waitForJStoLoad(int timeoutSeconds) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeoutSeconds));
		// wait for jQuery to load
		ExpectedCondition<Boolean> jQueryLoad = driver -> {
			try {
				return ((Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active") == 0);
			} catch (Exception e) {
				return true;
			}
		};
		// wait for Javascript to load
		ExpectedCondition<Boolean> jsLoad = driver -> ((JavascriptExecutor) driver)
				.executeScript("return document.readyState").toString().equals("complete");
		return wait.until(jQueryLoad) && wait.until(jsLoad);
	}

}