package NewTours_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

import Utilities.PageObjectLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// created this page class for adding objects of home page
public class HomePage 
{

	//WebElement xyz = driver.findElement(By.id("rdjgjdl"));
	//1) driver ==> is nothing but the browser which will have the element xyz..
	//	2) locator type ==> String coming from Test case
	//	2) locator value ==> string coming from Test Case

	static WebDriver driver;
	static PageObjectLibrary pol = new PageObjectLibrary();
	
	public HomePage(WebDriver d)
	{
		driver = d;
	}
	
	static WebElement register;
	//= driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
	
	public static void register_Link(String locatorType, String locatorValue)
	{
		By locator = pol.locator(locatorType,locatorValue);
		register = driver.findElement(locator);
		
	}
	
	
	public void register_click()
	{
		register_Link("link", "REGISTER");
		register.click();
	}
	
}
