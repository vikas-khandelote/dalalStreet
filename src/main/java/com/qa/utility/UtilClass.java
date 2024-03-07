package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class UtilClass extends TestBase{
	
	public UtilClass()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	// ScreenShot logic 
	
	public static  void getsScreenshot(String nameOfScreenshot)
	{
		String path="F:\\Eclipse1\\workspace\\dalalStreet\\screenshot\\";
		TakesScreenshot ts=(TakesScreenshot)driver; 
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		
		File des=new File(path+nameOfScreenshot+System.currentTimeMillis()+".png"); //create object of file class
		
		try {
			FileHandler.copy(src, des);
		} catch (IOException e) {
			System.out.println("File not Found");
			
		}
		

	}
	

}
