package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class TradingTest extends TestBase {
	
	@Test
	public void verifyBuyShear() throws InterruptedException
	{
		
		// Login 
		login.enterEmailAddress("tasareayush08@gmail.com");
		login.enterPassword("Ayush@1908");
		Thread.sleep(2000);
		login.clickOnloginButton();
		
//********Dashboard Page**********************************************
		dash.enterCompanyName("Wipro");
		Thread.sleep(2000);
		dash.clickOnCampanyName();
		
// *******Exchange page*************************************************
		Thread.sleep(2000);
		exchange.clickOnBuy();
		Thread.sleep(2000);
		exchange.enterQuantityOfShare();
		Thread.sleep(2000);
		exchange.clickOnBuyButton();
		
//*******Assert for Status*************************************************
		Thread.sleep(2000);
		String exp_res="Order Created successfully";
		Assert.assertEquals(exchange.getStatus(), exp_res);
		
	}

}
