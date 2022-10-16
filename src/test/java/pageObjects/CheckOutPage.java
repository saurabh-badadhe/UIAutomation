package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {

	WebDriver driver;

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
	}

	private By productName = By.xpath("//p[@class='product-name']");
	private By applyButton = By.xpath("//button[@class='promoBtn']");
	private By placeOrder = By.xpath("//button[text()='Place Order']");

	public String getProductName() {

		return driver.findElement(productName).getText();

	}
	
	public WebElement applyButton() {

		return driver.findElement(applyButton);

	}
	
	public WebElement placeOrderButton() {

		return driver.findElement(placeOrder);

	}

}
