package com.cisco.testscripts;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewBookingSteps extends Driver{

	@Given("a user is on the home page of FlyAway application")
	public void a_user_is_on_the_home_page_of_fly_away_application() {
		Assert.assertTrue(driver.getTitle().equals("Fly Away"));
	}

	@When("he login to the portal by providing UserId and Password")
	public void he_login_to_the_portal_by_providing_user_id_and_password() {
		landingPage.clickOnSignUp();
		login.enterEmailid();
		login.enterPswd();
		login.clickOnLogInBtn();
	}

	@When("he clicks on Your Bookings tab")
	public void he_clicks_on_your_bookings_tab() {
	    login.clickBookingTab();
	}

	@Then("he could able to see the flights that has been booked")
	public void he_could_able_to_see_the_flights_that_has_been_booked() {
		Assert.assertTrue(driver.getTitle().equals("Fly Away - Your Bookings"));
	}
}
