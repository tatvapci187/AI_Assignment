package AutomationTestFunctions;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.searchPageObjects;
import Utilities.utilities;

public class TC_OpenURL extends utilities {

	
	//Open Browser with URL
	@BeforeTest
	public void preCondition() {
		setUp();
	}

	//Search test scenario
	@Test
	public void OpenURL() {
		
		driver.get(prop.getProperty("baseurl"));
		//Open google
		Assert.assertTrue(driver.getTitle().equals("Google"));
		
	}


}
