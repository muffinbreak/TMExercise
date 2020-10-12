package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BaseTest;
import pages.TMHomePage;

public class TMHomePageSteps {
	
	
	@Given("user has navigated to the {string}")
	public void user_has_navigated_to_the(String string) {

		BaseTest.launchApplication();
	}

	@When("user clicks on the {string} link")
	public void user_clicks_on_the_link(String string) {
		
		TMHomePage.navigateToTabMotors();
	}

	@Then("user is navigated to the motors page")
	public void user_is_navigated_to_the_motors_page() {
		
		TMHomePage.checkCarForSaleIsDisplayed();
	}
}
