package com.qa.reuse;

import org.openqa.selenium.WebDriver;

import com.qa.config.StartBrowser;
import com.qa.or.HomePage;
import com.qa.or.LoginPage;
import com.qa.wdcmds.ActionDriver;

public class BusinessFunctions {

	WebDriver driver;
	ActionDriver aDriver;

	public BusinessFunctions() {
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
	}

	public void login() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to Application");

		aDriver.click(HomePage.lnkSignIn, "SignIn button");
		aDriver.type(LoginPage.txtEmail, "dnr5dnr@gmail.com", "Email");
		aDriver.type(LoginPage.txtPassword, "selenium123", "Password");
		aDriver.click(LoginPage.btnSignIn, "Login Button");

	}

	public void navigateToCostco() throws Exception {
		aDriver.launchApplication("https://www.costco.com/");
	}

	public void findAwareHouse() throws Exception {
		aDriver.mouseHover(HomePage.lnkWareHouse, "lnkWareHouse ");
		aDriver.type(HomePage.txtZip, "03062", "zipcode");
		Thread.sleep(1000);
		aDriver.click(HomePage.chkGas, "checkbox");
		aDriver.click(HomePage.btnFindWareHouse, "Button");
	}

	public void getEmailOffers() throws Exception {
		aDriver.mouseHover(HomePage.lnkGetEmailOffers, "lnkGetEmailOffers");
		aDriver.type(HomePage.txtEmail, "pratixabenp@gmail.com", "txtEmail");
		aDriver.click(HomePage.btnGo, "Button");

	}

	public void us() throws Exception {
		aDriver.mouseHover(HomePage.lnkUS, "US");
	}

}