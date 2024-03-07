package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase {

	public  LoginPage() // Constructor 
	{
		
		PageFactory.initElements(driver, this);
	}

	// Email
	@FindBy(xpath = "//input[@name=\"email\"]")
	private WebElement email_box;

	public void enterEmailAddress(String emailID) {
		email_box.sendKeys(emailID);
	}

	// Password
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement password_box;

	public void enterPassword(String pass) {
		password_box.sendKeys(pass);
	}

	// LoginButton
	@FindBy(xpath = "//button[@class=\"btn btn-outline-dark btn-block\"]")
	private WebElement login_btn;

	public void clickOnloginButton() {
		login_btn.click();
	}

}
