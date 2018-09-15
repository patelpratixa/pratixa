package com.qa.or;

import org.openqa.selenium.By;

public class HomePage {
	/*public static By lnkSignIn = By.id("header_sign_in");
	public static By lnkViewWarehouseSavings=By.id("warehouse-savings");
	public static By lnkCustomService=By.id("customer-service-link");
	public static By dnFindaWarehouse = By.id("warehouse-locations-dropdown");*/
	
	public static By lnkSignIn = By.id("header_sign_in");
	public static By lnkWareHouse = By.id("warehouse-locations-dropdown");
    public static By txtZip=By.id("warehouse-search-field-desktop");
    public static By chkGas=By.xpath("//label[@title='Gas Station']");
    public static By btnFindWareHouse = By.xpath("(//input[@value='Find a Warehouse'])[1]");
	public static By lnkGetEmailOffers = By.id("email-signup-dropdown");
	public static By txtEmail=By.id("header_emailSignUpEmail");
	public static By btnGo=By.xpath("//button[@type='submit'and @ class='btn btn-secondary']");
	public static By lnkUS=By.xpath("//span[text()='US']");
	
	
	/*
	 * 
	 Select dropdown = new Select(driver.findElement(By.id("warehouse-locations-dropdown")));
	 dropdown.selectByIndex(2);
	 */
	/*what I am supposed to do to test logo*/
	
	public static By searchbox=By.id("search-field");
	 public static By dnAll= By.id("search-dropdown-select");
	 public static By lnkCart = By.id("cart-d");

}
