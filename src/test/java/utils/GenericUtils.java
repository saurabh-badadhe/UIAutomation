package utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {

	WebDriver driver;

	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToChildWindow(String parentWindow) {
		Set<String> windows = driver.getWindowHandles();

		for (String s : windows) {
			if (!s.equals(parentWindow)) {
				driver.switchTo().window(s);
				break;
			}
		}
	}

	public String getParentWindow() {
		return driver.getWindowHandle();
	}

	public void getUrl(String url) {
		driver.get(url);
	}

	public String getPageUrl() {
		return driver.getCurrentUrl().toString();
	}
}
