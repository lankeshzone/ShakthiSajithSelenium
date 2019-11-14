package SeleniumSession;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriverMethods {

	public static void main(String[] args) 
	{

		 WebDriver driver = new FirefoxDriver();
		 
		 //launching the url
		 driver.get("https://www.google.co.in");
		 
		 //current page title of the active window
		 System.out.println(driver.getTitle());
		 
		//CUrrent page url
		 System.out.println(driver.getCurrentUrl());
		 
		 //System.out.println(driver.getPageSource());
		 
		 System.out.println(driver.getWindowHandle());
		 
		 Set<String> s = driver.getWindowHandles();
		 
		 System.out.println(s);
		 
		 
		 WebElement googleSearch_button = driver.findElement(By.name("btnK"));
		 
		 List<WebElement> l =driver.findElements(By.xpath("//input"));
		 
		 System.out.println(l.size());
		 
		 googleSearch_button.submit();
		 
		 System.out.println(googleSearch_button.getSize());
		 
		 driver.navigate().to("https://www.facebook.com");
		 
		 driver.navigate().back();
		 
		 driver.navigate().forward();
		 
		 driver.navigate().refresh();
		 
		 // set is a type of collection
		 Set<Cookie> cook = driver.manage().getCookies();
		
		 System.out.println(cook);
		 
		 //close and quit methods
//		 driver.quit();
		 
		 
		 //target locator methods...
		 
		
		 
		// driver.findElement(By.className("btn-danger")).click();
		 
		 //introduce that xyz external script 
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 js.executeScript("alert('Iam JS alert box');");
		 
		 //alert interface...
		 Alert a = driver.switchTo().alert();
		 
		 System.out.println(a.getText());
		 a.accept();
		// a.dismiss();
		
		 
		 
		 driver.switchTo().activeElement();
		 
		 driver.get("http://demo.automationtesting.in/Frames.html");
		 
		 String currentwindow = driver.getWindowHandle();
		 
		 System.out.println(currentwindow);
		 // switching to single frame in thw app
		 driver.switchTo().frame("singleframe");
		 
		 // identifying the textbox inside the frame and then entering the value
		 driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("Hello");
		
		 driver.switchTo().window(currentwindow);
		 driver.switchTo().parentFrame();
		 
		 driver.findElement(By.linkText("WebTable")).click();
		
		 driver.quit();
		 
		 
	}

}
