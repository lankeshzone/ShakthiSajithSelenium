package NewTours_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopMenu 
{
	// static variable for capturing the web browser provided by calling attribute
		static WebDriver driver;
		
		static WebElement signIN, register, support, contact;
		
		static PageObjectLibrary pageUtility = new PageObjectLibrary();
		
		public static void signIN_Link()
		{
			signIN = driver.findElement(pageUtility.locator("linktext","SIGN-ON"));
		}
		
		
		public static void register_Link()
		{
			register = driver.findElement(pageUtility.locator("linktext","SIGN-ON"));
		}
		
		public static void support_Link()
		{
			support = driver.findElement(pageUtility.locator("linktext","SIGN-ON"));
		}
		
		public static void contact_Link()
		{
			contact = driver.findElement(pageUtility.locator("linktext","SIGN-ON"));
		}
		
		
		// constructor to initialize the WebBrowser which is required to identify elements
		public TopMenu(WebDriver d)
		{
			driver = d;
		}

}
