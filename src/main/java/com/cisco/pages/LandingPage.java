package com.cisco.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	private Actions actions;
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	@FindBy(linkText="Login/Signup")
	private WebElement signUp;
	public void clickOnSignUp() {
		signUp.click();
	}
	
	@FindBy(xpath="//select[contains(@name,'source')]")
	private WebElement fromDropDown;
	public void selectFrom() {
		fromDropDown.click();
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
	@FindBy(xpath="//select[contains(@name,'destination')]")
	private WebElement toDropDown;
	public void selectTo() {
		toDropDown.click();
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
	@FindBy(css="body > form > table > tbody > tr > td:nth-child(3) > button")
	private WebElement submitBtn;
	public void clickOnSubmit() {
		submitBtn.click();
	}
	
	@FindBy(linkText="Book Flight")
	private WebElement bookFlightLink;
	public String getTheTextFromLink() {
		return bookFlightLink.getText();
	}
	
	public void clickOnBookFlightLink() {
		bookFlightLink.click();
	}
}
