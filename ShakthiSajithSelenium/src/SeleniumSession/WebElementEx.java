package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementEx {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		WebElement userID_TextBox;
		
		userID_TextBox = driver.findElement(By.id("username"));
		
		System.out.println(userID_TextBox.getAttribute("type"));
		
		System.out.println(userID_TextBox.getTagName());
		System.out.println(userID_TextBox.getLocation());
		System.out.println(userID_TextBox.getSize());
		
		//status of the webelement
		System.out.println(userID_TextBox.isDisplayed());
		System.out.println(userID_TextBox.isEnabled());
		
		userID_TextBox.click();
		userID_TextBox.sendKeys("lankeshzone@gmail.com");
		Thread.sleep(5000);
		userID_TextBox.clear();
		
		WebElement signIN = driver.findElement(By.className("btn__primary--large"));
		signIN.submit();
		
		
	}

}
