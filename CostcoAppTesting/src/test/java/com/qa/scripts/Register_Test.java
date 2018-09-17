package com.qa.scripts;

import org.testng.annotations.Test;

import com.qa.config.StartBrowser;
import com.qa.reuse.BusinessFunctions;

public class Register_Test extends StartBrowser{
  @Test
  public void testRegister_test() throws Exception {
	  BusinessFunctions bf = new BusinessFunctions();
	  bf.navigateToCostco();
	  bf.register();
  }
}
