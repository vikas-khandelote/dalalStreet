package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class ExchangePage extends TestBase {
	
	public ExchangePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	// scenario for buy 
	@FindBy(xpath="//a[@class=\"active nav-link\"]")
	private WebElement buy;
	
	public void clickOnBuy()
	{
		buy.click();
	}
	
	
	// Scenario for Quantity box
	@FindBy(xpath="(//input[@class=\"form-control\"])[3]")
	private WebElement quantity_box;
	
	public void enterQuantityOfShare()
	{
		quantity_box.sendKeys("1");
	}
	
	// Scenario for click on buy buttton 
	
	@FindBy(xpath="//button[@class=\"w-md btn btn-success\"]")
	private WebElement buy_btn;
	
	public void clickOnBuyButton()
	{
		buy_btn.click();
	}
	
	// Scenario for check status 
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement status;
	
	public String getStatus()
	{
		String st=status.getText();
		return st;
	}


}
