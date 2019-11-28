package NewTours_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage
{
	static WebDriver driver;
	PageObjectLibrary pol = new PageObjectLibrary();
	static WebElement firstname, lastName, phone, email;
	static WebElement address1, address2, city, state, postal, country;
	static WebElement userName, password, confirmPassword, submit;

	
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
	
	
	public void address1_text()
	{
		address1 = driver.findElement(pol.locator("name", "address1"));
	}
	
	public void address2_text()
	{
		address2 = driver.findElement(pol.locator("name", "address2"));
	}
	
	public void city_text()
	{
		city = driver.findElement(pol.locator("name", "city"));
	}
	
	public void state_text()
	{
		state = driver.findElement(pol.locator("name", "state"));
	}
	
	public void postal_text()
	{
		postal = driver.findElement(pol.locator("name", "postal"));
	}
	
	public void country_text()
	{
		country = driver.findElement(pol.locator("name", "country"));
	}
	
	
	
	public void userName_text()
	{
		userName = driver.findElement(pol.locator("id", "email"));
	}
	
	public void password_text()
	{
		password = driver.findElement(pol.locator("name", "password"));
	}
	
	public void confirmPassword_text()
	{
		confirmPassword = driver.findElement(pol.locator("name", "confirmPassword"));
	}
	
	public void submit_button()
	{
		submit = driver.findElement(pol.locator("name", "register"));
	}
	
}
