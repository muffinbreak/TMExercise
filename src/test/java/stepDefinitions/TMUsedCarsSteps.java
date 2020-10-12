package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TMUsedCars;

public class TMUsedCarsSteps {
	

	@When("user scans through the brands")
	public void user_scans_through_the_brands() {
		
		TMUsedCars.getUsedCarsBrand();
	}

	@Then("user confirms {string} brand exists")
	public void user_confirms_kia_brand_exists(String brand) {
		
		TMUsedCars.isBrandAvailable(brand);	
	}
}
