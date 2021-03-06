package com.qa.wdcmds;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.qa.config.StartBrowser;

public class ActionDriver {
	
	WebDriver driver;
	
	public ActionDriver()//constructor
	{
		driver=StartBrowser.driver;
	}
	/**
	 * This is to navigate to a specific URL
	 * @param url EX. www.costco.com
	 * @throws Exception 
	 */
	public void launchApplication(String url) throws Exception
	{   
		try{
		driver.get(url);
		StartBrowser.childTest.pass("Launched application successfully :"+url);
		}catch(Exception e){
			StartBrowser.childTest.fail("Unable to Launch application"+url ,
            MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
            StartBrowser.childTest.info(e);
            throw e;
		}
	}
	/**
	 * used to perform click operation on radio buttons,links, check box and buttons 
	 * @param locator get it from object repository
	 * @throws Exception 
	 */
	public void click(By locator,String eleName ) throws Exception
	{
		try {
			driver.findElement(locator).click();
			StartBrowser.childTest.pass("Performed click on :"+eleName);
		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable to Perfor click on :"+eleName, 
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}

	}
	/**
	 * used to perform send keys in text box or text area
	 * @param locator --get it from Object repository
	 * @param text --your test data
	 * @throws Exception 
	 */

	public void type(By locator, String text,String eleName) throws Exception
	{

		try {
			driver.findElement(locator).sendKeys(text);
			StartBrowser.childTest.pass("Performed type action in :"+eleName + "with data "+text);
		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable to Perform type action in :"+eleName + "with data "+
		text, MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}

	}
	
	private String screenShot() {
		
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	}
	/**
	  * used to perform mouse hover on element
	  * @param locator --get it from OR
	  * @param eleName  --on which you are performing mouse action
	  * @throws Exception
	  */
	 public void mouseHover(By locator, String eleName) throws Exception
	 {
	  try {
	   WebElement mo=driver.findElement(locator);
	   Actions a = new Actions(driver);
	   a.moveToElement(mo).build().perform();
	   StartBrowser.childTest.pass("Performed mousehover action on :"+eleName);
	  } catch (Exception e) {
	   StartBrowser.childTest.fail("Unable to Perform mousehover action on :"+eleName, 
		  MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
	   throw e;
	  }
	 }


}
