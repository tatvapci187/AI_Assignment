package Utilities;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class utilities 
{
	public static WebDriver driver =null;
	public Properties prop= getPropertiesInstance();
	
	public void setUp()
	{
		if (prop.getProperty("Browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else
		{
			System.out.println("Please enter Chrome browser in config file.");
		}
		
	}
	public Properties getPropertiesInstance() {
		try
		{
			if(prop == null) {
				
				prop =  new Properties();
				prop.load(utilities.class.getClassLoader().getResourceAsStream("Testconf.properties"));			
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return prop;
	}
	
	public void shutDown()
	{
		driver.quit();
	}

}
