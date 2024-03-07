package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class DashboardPage extends TestBase {
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Enter company name in search box
	@FindBy(xpath="//input[@type='text']")
	private WebElement search_box;
	
	public void enterCompanyName(String companyName)
	{
		search_box.sendKeys(companyName);
	}
	
	// 
	@FindBy(linkText="WIPRO")
	private WebElement companyName;
	
	public void clickOnCampanyName()
	{
		Actions act=new Actions(driver);
		act.moveToElement(companyName).click().build().perform();
	}

}
