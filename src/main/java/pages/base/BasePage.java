package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static constants.Constants.TimoutVeriables.EXPLICIT_WAIT;

public class BasePage {
	public WebDriver driver;
	protected WebDriverWait explicitWait = new WebDriverWait(driver, EXPLICIT_WAIT);

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
}