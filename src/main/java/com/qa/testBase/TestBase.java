 package com.qa.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.pageLayer.DashboardPage;
import com.qa.pageLayer.ExchangePage;
import com.qa.pageLayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	// Here we declared object of all classes 
	public LoginPage login;
	public DashboardPage dash;
	public ExchangePage exchange;
	
	
	
	@BeforeClass
	public void start()
	{
		 logger=Logger.getLogger("dalaStreet");  // here we create object of Logger class with method gitLogger(String name):org.apache.log4j.Logger
		PropertyConfigurator.configure("log4j.properties"); // declared PropertyConfigurator Class use with configure() method inside signature we pass name of (log4j.properties) file name
		
		logger.info("My Frame Work Execution is Started");
		
	}
	
	@AfterClass
	public void stop()
	{
		logger.info("My Frame Work Execution is Stopped");
	}
	

	
	@Parameters("browser")
	@BeforeMethod
	public void setUp()
	{
		String br="chrome";
		
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=(WebDriver) new ChromeDriver();
			logger.info("Chrome Launches");
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Enter the valid Browser Name");
		}
		
		
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		logger.info("maximize and delete all cookies with some time");
		
		
		login=new LoginPage();
		dash=new DashboardPage();
		exchange=new ExchangePage();
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		logger.info("Browser closed"); // Note: log is nothing but check point 
	}
	
	

}
