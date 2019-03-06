package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class searchPageObjects 
{
	@FindBy(how = How.XPATH, using = "//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]")
	public WebElement searchList ;
	
	@FindBy(how = How.NAME, using = "q")
	public WebElement searchTextbox ;
	
	
	
}
