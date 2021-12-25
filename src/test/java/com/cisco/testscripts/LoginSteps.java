package com.cisco.testscripts;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Driver{
	
	  @Given("a user is in the home page of FlyAway application") public void
	  a_user_is_in_the_home_home_of_fly_away_application() {
	 Assert.assertTrue(driver.getTitle().equals("Fly Away")); 
	  }
	 	
	@When("he clicks on the Login\\/Signup link")
	public void he_clicks_on_the_login_signup_link() {
		landingPage.clickOnSignUp();
	}
	
	@When("he filled up valid email and password")
	public void he_filled_up_valid_email_and_password(){
		login.enterEmailid();
		login.enterPswd();
	}

	@When("he clicks on Login button")
	public void he_clicks_on_login_button() {
	 login.clickOnLogInBtn(); 	 
	}

	@Then("he could able to Login as user")
	public void he_could_able_to_login_as_user() {
		Assert.assertTrue(driver.getTitle().equals("Fly Away - Dashboard"));
	}
}

