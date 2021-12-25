package com.cisco.testscripts;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFlightSteps extends Driver{

	@Given("a user is in home page of FlyAway application")
	public void a_user_is_in_home_page_of_fly_away_application() {
		 Assert.assertTrue(driver.getTitle().equals("Fly Away")); 
	}

	@When("he select from and to in the dropdown")
	public void he_select_from_and_to_in_the_dropdown() {
		landingPage.selectFrom();
		landingPage.selectTo();
	}

	@When("he clicks on Submit button")
	public void he_clicks_on_submit_button() {
	   landingPage.clickOnSubmit();
	}

	@Then("he could able to search flight as user")
	public void he_could_able_to_search_flight_as_user() {
	   String actText=landingPage.getTheTextFromLink();
	   String expText="Book Flight";
	   Assert.assertEquals(actText, expText);
	}
}

