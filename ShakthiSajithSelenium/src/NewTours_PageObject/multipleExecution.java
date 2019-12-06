package NewTours_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multipleExecution 
{

	
	@Test
	public void TestOne()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
	}
	
	
	@Test
	public void TestTwo()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com");
	}
	
	
	@Test
	public void TestThree()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");	
	}
	
}
