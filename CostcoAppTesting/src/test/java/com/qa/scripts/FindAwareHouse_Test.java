package com.qa.scripts;

import org.testng.annotations.Test;

import com.qa.config.StartBrowser;
import com.qa.reuse.BusinessFunctions;

public class FindAwareHouse_Test extends StartBrowser{
  @Test
  public void testFindAwareHouse_Test() throws Exception {
	  BusinessFunctions bf = new BusinessFunctions();
	  bf.navigateToCostco();
	  bf.findAwareHouse();
  }
}
