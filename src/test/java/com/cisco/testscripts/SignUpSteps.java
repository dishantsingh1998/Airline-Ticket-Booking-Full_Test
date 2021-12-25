package com.cisco.testscripts;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps extends Driver{

	@Given("a user is in the landing page of FlyAway application")
	public void a_user_is_in_the_landing_page_of_fly_away_application() {
		Assert.assertTrue(driver.getTitle().equals("Fly Away"));
	}

	@When("he clicks on Login\\/Signup link")
	public void he_clicks_on_login_signup_link() {
		landingPage.clickOnSignUp();
	}

	@When("he clicks on Not a member? Signup")
	public void he_clicks_on_not_a_member_signup() {
	   login.clickOnNotAMember();
	}

	@When("he filled up all desired inputs and clicks on signup button")
	public void he_filled_up_all_desired_inputs_and_clicks_on_signup_button() {
		registration.enterEmail();
		registration.enterPassword();
		registration.enterConfirmPassword();
		registration.enterName();
		registration.enterAddress();
		registration.enterCity();
		registration.clickOnSignUpBtn();
	}

	@Then("he could able to signup as user")
	public void he_could_able_to_signup_as_user() {
		Assert.assertTrue(driver.getTitle().equals("Fly Away - Registration Confirmation"));
	}	
}

