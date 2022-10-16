package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.ContextSetup;

public class LandingPageStepDefinations {	
	String productName;
	ContextSetup context;
	LandingPage landingPage;

	public LandingPageStepDefinations(ContextSetup context) {
		this.context = context;
		landingPage = context.pageObejctManager.getLandingPageObject();

	}

	@Given("user is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
//		System.out.println(context.prop.getProperty("qaUrl"));
//		Assert.assertEquals(context.genericUtils.getPageUrl(), context.prop.getProperty("qaUrl"));
	}

	@When("^user searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String name)
			throws InterruptedException {

		landingPage.searchItem(name);

		Thread.sleep(1000);
		context.productName = landingPage.getProductName().split("-")[0].trim();
		//System.out.println(context.productName);

	}

	@When("user added {int} quantity of product")
	public void user_added_quantity_of_product(Integer quantity) {

		landingPage.incrementProductQuantity(quantity);
	}
	
	@When("user added product to cart")
	public void user_added_product_to_cart() {

		landingPage.addToCart();
	}
	
	@Then("goes to the checkout page")
	public void goes_to_the_checkout_page() {
	    landingPage.clickonCart();
	    landingPage.clickOnProceedToCart();
	}
}
