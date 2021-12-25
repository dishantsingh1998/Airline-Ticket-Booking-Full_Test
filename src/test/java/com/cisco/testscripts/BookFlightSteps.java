package com.cisco.testscripts;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookFlightSteps extends Driver{

	@Given("a user is on the home page of FlyAway ticket booking application")
	public void a_user_is_on_the_home_page_of_fly_away_ticket_booking_application() {
		 Assert.assertTrue(driver.getTitle().equals("Fly Away")); 
	}

	@When("he login to the portal by providing userid and password")
	public void he_login_to_the_portal_by_providing_userid_and_password() {
		landingPage.clickOnSignUp();
		login.enterEmailid();
		login.enterPswd();
		login.clickOnLogInBtn();
	}

	@When("he clicks on home tab")
	public void he_clicks_on_home_tab() {
		login.clickHomeTab();
	}

	@When("he select from and destination from those dropdowns")
	public void he_select_from_and_destination_from_those_dropdowns() {
	  landingPage.selectFrom();
	  landingPage.selectTo();
	}

	@When("he clicks on the Submit button")
	public void he_clicks_on_the_submit_button() {
	    landingPage.clickOnSubmit();
	}

	@When("he clicks on Book Flight link")
	public void he_clicks_on_book_flight_link() {
	    landingPage.clickOnBookFlightLink();
	}

	@When("he reviews the details and clicks on the Click to complete booking")
	public void he_reviews_the_details_and_clicks_on_the_click_to_complete_booking() {
		paymentGateway.clickOnCompleteBookingLink();
	}

	@Then("he could able to Book flight as user")
	public void he_could_able_to_book_flight_as_user() {
		 Assert.assertTrue(driver.getTitle().equals("Fly Away - Booking Confirmation")); 
	}
}

