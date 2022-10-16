package stepDefinations;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CheckOutPage;
import utils.ContextSetup;

public class CheckOutPageStepDefination {

	ContextSetup context;
	CheckOutPage checkOutPage;
	
	public CheckOutPageStepDefination(ContextSetup context){
		this.context = context;
		checkOutPage= context.pageObejctManager.getCheckOutPageObeject();
	}
	
	@Then("check the product is present in the checkOut page")
	public void check_the_product_is_present_in_the_checkOut_page() {
		System.out.println("coming from context.productName : "+ context.productName);
		
		Assert.assertTrue(checkOutPage.getProductName().split("-")[0].trim().equals(context.productName));
	}
	@Then("Apply and Placeorder button are present")
	public void apply_and_placeorder_button_are_present() {
		Assert.assertTrue(checkOutPage.applyButton().isDisplayed());
		Assert.assertTrue(checkOutPage.placeOrderButton().isDisplayed());
	}
}
