package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class LoginPageTest extends TestBase {
	
	@Test
	public void verifyLoginFuctionality()
	{
		
		
		login.enterEmailAddress("khandelotevikas@gmail.com");
		login.enterPassword("Vikas55@");
		login.clickOnloginButton();
	}

}
