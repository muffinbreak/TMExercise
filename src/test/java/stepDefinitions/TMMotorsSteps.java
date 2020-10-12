package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page;
import pages.TMMotors;
import pages.TMUsedCars;
import pages.TMUsedCarsListing;

public class TMMotorsSteps {


	@Given("user has navigated to the Cars for sale page")
	public void user_has_navigated_to_the_Cars_for_sale_page() {
		
		TMMotors.navigateToTabUsedCars();
	}

	
	@When("user clicks on the more link")
	public void user_clicks_on_the_more_link() {
		
		TMUsedCars.navigateToMore();
	}

	@Then("user sees at least {string} listing in the used cars category")
	public void user_sees_at_least_listing_in_the_used_cars_category(String listing) {
		
		String nb = TMUsedCarsListing.getListingNumber();
		Assert.assertEquals(nb, listing);
	}

}
