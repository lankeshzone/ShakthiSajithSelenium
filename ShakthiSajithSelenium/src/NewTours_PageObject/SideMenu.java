package NewTours_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.PageObjectLibrary;



public class SideMenu 
{
static WebDriver driver;
	
	static PageObjectLibrary pageUtility = new PageObjectLibrary();
	
	static WebElement home, flights, car, cruises, destination, vacation;
	
	public SideMenu(WebDriver d)
	{
		driver = d;
	}
	
	public static void home_link()
	{
		home = driver.findElement(pageUtility.locator("linktext", "Home"));
	}
	
	public static void flights_link()
	{
		flights = driver.findElement(pageUtility.locator("linktext", "Flights"));
	}
	
	public static void car_link()
	{
		car = driver.findElement(pageUtility.locator("linktext", "Car Rentals"));
	}
	
	public static void cruises_link()
	{
		cruises = driver.findElement(pageUtility.locator("linktext", "Cruises"));
	}
	
	public static void destination_link()
	{
		destination = driver.findElement(pageUtility.locator("linktext", "Destinations"));
	}
	
	
	public static void vacation_link()
	{
		vacation = driver.findElement(pageUtility.locator("linktext", "Vacations"));
	}

}
