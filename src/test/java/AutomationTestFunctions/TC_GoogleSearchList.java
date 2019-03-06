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


public class TC_GoogleSearchList extends utilities {

	private searchPageObjects PageObj = new searchPageObjects();


	//Verify Search list contain the keyword which was used during the search
	@Test
	public void GoogleSearchList() {
		PageObj = PageFactory.initElements(driver, searchPageObjects.class);
		String expectedSearchValue = prop.getProperty("SearchKey");
		
		PageObj.searchList.findElements(By.tagName("li"));
		List<WebElement> lstSearch = PageObj.searchList.findElements(By.tagName("li"));

		for (int i = 0; i < lstSearch.size() - 1; i++)
		{
			WebElement liElement = lstSearch.get(i);
			String actualValue = liElement.getText();			
			Assert.assertTrue(actualValue.contains(expectedSearchValue));			
		}

	}

	//Close Browser
	@AfterTest
	public void postCondition() {
		shutDown();
	}

}
