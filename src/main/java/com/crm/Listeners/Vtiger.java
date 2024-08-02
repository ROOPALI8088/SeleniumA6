package com.crm.Listeners;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseClass.VtigerBaseClass;

public class Vtiger extends VtigerBaseClass implements ITestListener {
	private static final ITestResult True = null;
	ExtentSparkReporter spark;
	ExtentReports report;
	ExtentTest test ;

	@Override
	public void onTestStart(ITestResult result) {
		String t_name = result.getMethod().getMethodName();
		Reporter.log(t_name);
		test = report.createTest(t_name);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String t_name=result.getMethod().getMethodName();
	    Reporter.log(t_name);
	    test.log(Status.PASS,"t_mame is passed ");
		
	    
	}

	@Override
	public void onTestFailure(ITestResult result) {
	 TakesScreenshot ts= (TakesScreenshot)driver;
	 String screenshot = ts.getScreenshotAs(OutputType.BASE64);
	 test.addScreenCaptureFromBase64String(screenshot);
	 test.log(Status.FAIL,"t_mame is failed");
		
	 
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String t_name = result.getMethod().getMethodName();
		Reporter.log(t_name);
		test.log(Status.SKIP,"t_mame is skipped ");
		
	}

	@Override
	public void onStart(ITestContext context) {
		//create spark reporter
	     spark = new ExtentSparkReporter("./ExtentReport/createOrganzation.html");
	    //configure the spark reporter
		spark.config().setDocumentTitle("SampleReport");
		spark.config().setReportName("Roopali");
		spark.config().setTheme(Theme.DARK);
		//create the extent report
		 report = new ExtentReports();
		//configure extent report
		report.setSystemInfo("Os", "Windows-10");
		 report.setSystemInfo("Browser", "Chrome-100");
		 //attach the spark report to the extent report
		report.attachReporter(spark);
		 
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
	

}
