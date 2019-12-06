package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits 
{

	static WebDriver driver;
	static PageObjectLibrary pol;
	
	// Thread, implicit wait, explicit wait...
	
	public waits(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//implicit wait
	public void implicitWait(int duration, String units)
	{
		if (units.equals("Seconds"))
			driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
		
		if(units.equals("milliseconds"))
			driver.manage().timeouts().implicitlyWait(duration, TimeUnit.MILLISECONDS);
		
		if(units.equals("hours"))
			driver.manage().timeouts().implicitlyWait(duration, TimeUnit.HOURS);
		
		if(units.equals("microseconds"))
			driver.manage().timeouts().implicitlyWait(duration, TimeUnit.MICROSECONDS);
	}
	
	//explicit Wait
	public void explicitWait(int duration, String condition, String LocatorType, String LocatorValue)
	{
		WebDriverWait wait = new WebDriverWait(driver, duration);
		
		if(condition.equals("elementavailable"))
			wait.until(ExpectedConditions.presenceOfElementLocated(pol.locator(LocatorType, LocatorValue)));
		
		if(condition.equals("alertpresent"))
			wait.until(ExpectedConditions.alertIsPresent());
		
		if(condition.equals("elementclick"))
			wait.until(ExpectedConditions.elementToBeClickable(pol.locator(LocatorType, LocatorValue)));
		
	}
	
	public void sleep(int duration) throws InterruptedException
	{
		Thread.sleep(duration);
	}
}
