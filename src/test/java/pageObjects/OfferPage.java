package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

	WebDriver driver;

	public OfferPage(WebDriver driver) {
		this.driver = driver;
	}

	private By search = By.id("search-field");
	private By OfferProduct = By.xpath("//table[@class=\"table table-bordered\"]/tbody/tr/td");

	public void searchItem(String name) {

		driver.findElement(search).sendKeys(name);
	}

	public String getOfferProduct() {

		return driver.findElement(OfferProduct).getText();
	}
}
