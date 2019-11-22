package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkedinLaunchTest
{

	public static void main(String[] args) 
	{
		// launch the browser
		WebDriver driver = new FirefoxDriver();
		
		//launch the URl
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		//verify the title
		String expectedResult = "Linkedin Home";
		String actualResult = driver.getTitle();
		
		if(expectedResult.equals(actualResult))
			System.out.println("Title matches " + actualResult);
		else
			System.out.println("Title does not match " + actualResult);
		
		//entering the userID
		WebElement userId = driver.findElement(By.id("username"));
		userId.sendKeys("lankeshzone@gmail.com");
		
		//enter the password
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("lankesh123");
		
		//Click on SignIN
		WebElement signIN = driver.findElement(By.className("btn__primary--large"));
		signIN.click();
		
		//verify the result
		expectedResult = "Error in password";
		actualResult = driver.findElement(By.id("error-for-password")).getText();
		
		if(expectedResult.equals(actualResult))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		
		
	}

}
