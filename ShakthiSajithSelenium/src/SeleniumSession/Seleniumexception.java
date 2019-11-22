package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumexception {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/");
		
		try
		{
		WebElement test = driver.findElement(By.name("test"));
		}
		catch(NoSuchElementException n)
		{
			System.out.println(n.getMessage());
		}
		
		try
		{
		Alert a = driver.switchTo().alert();
		a.accept();
		}
		catch(NoAlertPresentException n)
		{
			System.out.println(n.getMessage());
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("alert('Hello this is JS alert');");
				
		driver.switchTo().alert().accept();
		//System.out.println("Title from JS " + str);
		
		String str = js.executeScript("return document.title;").toString();
		System.out.println("Title from JS " + str);
		
		System.out.print(driver.getTitle());
		
	}

}
