package com.qa.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class ListenersSetup extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		logger.info("Started Test case Execution");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		logger.info("TestCase Sucxessfully paased ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//System.out.println("TestCase failed");
		logger.info("TestCase failed ");
		
		UtilClass.getsScreenshot(result.getName());
		
		//System.out.println("Screenshot Taken");
		logger.info("Screenshot Taken");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
