package NewTours_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage
{
	static WebDriver driver;
	PageObjectLibrary pol = new PageObjectLibrary();
	static WebElement firstname, lastName, phone, email;
	
	public RegistrationPage(WebDriver d)
	{
		driver = d;
	}
	
	public void firstname_Text(String locatorType, String locatorValue)
	{
		firstname = driver.findElement(pol.locator(locatorType, locatorValue));
	}
	
	public void lastname_Text(String locatorType, String locatorValue)
	{
		lastName = driver.findElement(pol.locator(locatorType, locatorValue));
	}
	
	public void email_Text(String locatorType, String locatorValue)
	{
		email = driver.findElement(pol.locator(locatorType, locatorValue));
	}
	
	public void phone_Text(String locatorType, String locatorValue)
	{
		phone = driver.findElement(pol.locator(locatorType, locatorValue));
	}
	
}
