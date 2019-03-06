package AutomationTestFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.searchPageObjects;
import Utilities.utilities;

public class TC_GoogleSearch extends utilities {

	private searchPageObjects PageObj = new searchPageObjects();

	
	//Search test scenario
	@Test
	public void GoogleSearchText() {
		PageObj = PageFactory.initElements(driver, searchPageObjects.class);
		String expectedSearchValue = prop.getProperty("SearchKey");
		for (int i = 0; i < expectedSearchValue.length(); i++) {
			char c = expectedSearchValue.charAt(i);
			String s = new StringBuilder().append(c).toString();
			PageObj.searchTextbox.sendKeys(s);
		}
		
		//Verify that auto-suggestion list is coming
		Assert.assertTrue(PageObj.searchList.isDisplayed());

	}

	
}
