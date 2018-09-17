package com.qa.or;

import org.openqa.selenium.By;

public class LoginPage {
	public static By txtEmail = By.id("logonId");
	public static By txtPassword = By.name("logonPassword");
	public static By chkRememberMe= By.xpath("//label[@ title='Remember Me']");
	public static By lnkForgotPassword=By.linkText("Forgot Password?");
	public static By btnSignIn = By.xpath("//input[@class='primary' and @type='submit']");
	public static By btnCreateAccount = By.linkText("Create Account");
	
}
