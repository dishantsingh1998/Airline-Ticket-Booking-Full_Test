package com.cisco.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;
import com.cisco.pages.*;

public class Driver extends Tools{
	
	protected static LandingPage landingPage;
	protected static Login login;
	protected static Registration registration;
	protected static PaymentGateway paymentGateway;

	public static void init()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver= new ChromeDriver();
		landingPage=new LandingPage(driver);
		login=new Login(driver);
		registration=new Registration(driver);
		paymentGateway=new PaymentGateway(driver);
	}
}

