package com.qa.or;

import org.openqa.selenium.By;

public class RegisterPage {
	
	public static By txtEmail = By.id("register_email1");
	public static By txtPassword = By.id("logonPassword");
	public static By txtVerifyPassword = By.id("logonPasswordVerify");
	public static By txtMembershipNumber = By.id("register_userField2");
	public static By txtLastNameOnMembership = By.id("register_lastNameOnMembership");
	public static By btnCreateAccount = By.xpath("//input[@ class='primary' and @ type='submit']");


}
