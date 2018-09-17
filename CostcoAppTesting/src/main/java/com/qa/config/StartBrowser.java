package com.qa.config;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class StartBrowser {

	public static WebDriver driver;

	// variables for reporting
	ExtentHtmlReporter htmlreporter;
	public static ExtentReports extent;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;

	@BeforeTest
	public void report() {
		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Reports/MyReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
	}

	@BeforeMethod
	public void method(Method method)
	{
		parentTest = extent.createTest(method.getName());
	}

	@BeforeClass
	public void beforeClass() 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\Way2Automation\\Selenium_prerequisites\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public void afterClass() {
		//driver.quit();
		extent.flush();

	}

}
