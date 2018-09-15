package com.qa.scripts;

import org.testng.annotations.Test;

import com.qa.config.StartBrowser;
import com.qa.reuse.BusinessFunctions;

public class Login_Logout extends StartBrowser {
  @Test
  public void testLogin_Logout() throws Exception {
	  BusinessFunctions fn = new BusinessFunctions();
	  fn.navigateToCostco();
	  fn.login();
	  System.out.println("This is Login_Logout Test");
  }
}
