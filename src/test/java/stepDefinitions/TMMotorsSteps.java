package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BaseTest;
import pages.Page;
import pages.TMHomePage;
import pages.TMMotors;
import pages.TMUsedCars;
import pages.TMUsedCarsListing;

public class TMMotorsSteps extends Page {


	@Given("user has navigated to the Cars for sale page")
	public void user_has_navigated_to_the_Cars_for_sale_page() {
		
		TMMotors.navigateToTabUsedCars();
	}

	
	@When("user clicks on the more link")
	public void user_clicks_on_the_more_link() {
		
		TMUsedCars.navigateToMore();
	}

	@Then("user sees more then {string} listing in the used cars category")
	public void user_sees_more_then_listing_in_the_used_cars_category(String listing) {
		
		TMUsedCarsListing.getListingNumber(driver);
		int i = TMUsedCarsListing.listUsedCarNumber();
		Assert.assertEquals(i, listing);
	}

}
