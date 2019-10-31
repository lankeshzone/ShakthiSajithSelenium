package JavaSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selExceptionEx {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com");
		
		WebElement Test;
		try
		{
			
		
		Test = driver.findElement(By.name("Test123"));
		
		}
		catch (NoSuchElementException n)
		{
			System.out.print("Element not found");
		}
		
	}

}
