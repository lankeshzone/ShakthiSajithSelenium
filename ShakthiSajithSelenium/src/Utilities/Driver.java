package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver
{

	// choose between the types of browsers
	public WebDriver setupBrowser(String browser, String url)
	{
		WebDriver driver = null;
		
		switch (browser)
		{
		case "ie":
			driver = new InternetExplorerDriver();
			driver.get(url);
		break;
		case "firefox":
			driver = new FirefoxDriver();
			driver.get(url);
		break;
		
		
		}
		
		return driver;
	}
	
	
	// get some attributes of browser
	public String[] getURLTitle(WebDriver driver)
	{
		String[] str = new String[2];
		str[0]= driver.getCurrentUrl();
		str[1] = driver.getTitle();
		
		return str;
		
	}
	
	
	// browser conditions
	public boolean checkTitle(String ExpectedTitle, WebDriver driver)
	{
		String actualTitle = driver.getTitle();
		if(ExpectedTitle.equals(actualTitle))
			return true;
		else
			return false;
			
	}
	
	
	
	public void shutBrowser(WebDriver driver)
	{
		driver.quit();
	}
}
