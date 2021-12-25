package com.cisco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Not a member? Signup")
	private WebElement NotAMember;
	public void clickOnNotAMember() {
		NotAMember.click();
	}
	
	@FindBy(name="email_id")
	private WebElement emailidTxtBox;
	public void enterEmailid() {
		emailidTxtBox.sendKeys("Ironman234@gmail.com");
	}
	
	@FindBy(name="pwd")
	private WebElement paswdTxtBox;
	public void enterPswd() {
		paswdTxtBox.sendKeys("Ironman@234");
	}
	
	@FindBy(css="body > form > table > tbody > tr:nth-child(3) > td > button")
	private WebElement logInBtn;
	public void clickOnLogInBtn() {
		logInBtn.click();
	}
	
	@FindBy(linkText="Home")
	private WebElement homeTab;
	public void clickHomeTab() {
		homeTab.click();;
	}
	
	@FindBy(linkText="Your Bookings")
	private WebElement BookingTab;
	public void clickBookingTab() {
		BookingTab.click();;
	}
}


