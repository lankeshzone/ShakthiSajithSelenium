package Utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver
{

	// choose between the types of browsers
	public WebDriver setupBrowser(String browser, String url) throws MalformedURLException
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
		
		case "rwd":
			URL ur = new URL("http://172.20.10.4:4444/wd/hub");
			
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setBrowserName("chrome");
			
			//cap.setPlatform(Platform.WINDOWS);
			
			driver = new RemoteWebDriver(ur,cap);
		
			
		
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
