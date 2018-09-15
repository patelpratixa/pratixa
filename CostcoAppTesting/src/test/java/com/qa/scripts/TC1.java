package com.qa.scripts;

import org.testng.annotations.Test;

import com.qa.config.StartBrowser;
import com.qa.wdcmds.ActionDriver;

public class TC1 extends StartBrowser {
  @Test
  public void testTC1() throws Exception 
  {
	  ActionDriver aDriver = new ActionDriver();
	  aDriver.launchApplication("https://www.costco.com/");
	  
  }
}
