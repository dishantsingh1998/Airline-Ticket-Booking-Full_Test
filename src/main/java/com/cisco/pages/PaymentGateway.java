package com.cisco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentGateway {
	
	public PaymentGateway(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Click to complete booking")
	private WebElement completeBookingLink;
	public void clickOnCompleteBookingLink() {
		completeBookingLink.click();
	}
}

