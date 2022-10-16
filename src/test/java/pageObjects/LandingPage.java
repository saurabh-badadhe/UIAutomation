package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	private By search = By.cssSelector("input.search-keyword");
	private By product = By.xpath("//h4[@class='product-name']");
	private By topDeals = By.linkText("Top Deals");
	private By incrementProduct = By.xpath("//a[@class='increment']");
	private By addToCart= By.xpath("//button[text()='ADD TO CART']");
	private By cartImage= By.cssSelector("img[alt='Cart']");
	private By proceedToCheckout= By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");

	public void searchItem(String name) {

		driver.findElement(search).sendKeys(name);
	}

	public String getProductName() {

		return driver.findElement(product).getText();
	}

	public void topDealsLink() {

		driver.findElement(topDeals).click();
	}

	public void incrementProductQuantity(Integer quantity) {
		for (int i = 1; i < quantity; i++) {
			driver.findElement(incrementProduct).click();
		}

	}
	
	public void addToCart() {

		driver.findElement(addToCart).click();
	}
	
	public void clickonCart() {

		driver.findElement(cartImage).click();
	}
	
	public void clickOnProceedToCart() {

		driver.findElement(proceedToCheckout).click();
	}
}
