package stepDefinations;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import utils.ContextSetup;

public class OfferPageStepDefination {
	ContextSetup context;
	LandingPage landingPage;
	OfferPage offerPage;

	public OfferPageStepDefination(ContextSetup context) {
		this.context = context;
		landingPage = context.pageObejctManager.getLandingPageObject();
		offerPage = context.pageObejctManager.getOfferPageObeject();
	}

	@Then("^user searched for same shortname (.+) in the offers page to check if product exist$")
	public void user_searched_for_same_shortname_in_the_offers_page_to_check_if_product_exist(String name) {		

		landingPage.topDealsLink();
		context.genericUtils.switchToChildWindow(context.genericUtils.getParentWindow());

		offerPage.searchItem(name);
		Assert.assertEquals(offerPage.getOfferProduct(), context.productName);

	}
}
