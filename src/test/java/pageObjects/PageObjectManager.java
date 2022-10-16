package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	LandingPage landingPage;
	OfferPage offerPage;
	CheckOutPage checkOutPage;
	WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LandingPage getLandingPageObject() {
		if (landingPage == null) {
			landingPage = new LandingPage(driver);
		}
		return landingPage;
	}

	public OfferPage getOfferPageObeject() {
		if (offerPage == null) {
			offerPage = new OfferPage(driver);
		}
		return offerPage;
	}
	
	public CheckOutPage getCheckOutPageObeject() {
		if (checkOutPage == null) {
			checkOutPage = new CheckOutPage(driver);
		}
		return checkOutPage;
	}

}
