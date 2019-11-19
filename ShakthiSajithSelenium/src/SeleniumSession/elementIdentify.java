package SeleniumSession;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class elementIdentify {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		//case- valid identification
		WebElement password;
		
		password = driver.findElement(By.id("password"));
		
		System.out.println(password.getLocation());
		
		//case - invalid identification
		WebElement test;
		try
		{
		test = driver.findElement(By.name("test"));
		}
		catch(NoSuchElementException n)
		{
			System.out.println("Exception occured");
		}
		
		
		List<WebElement> ele;
		
		ele = driver.findElements(By.xpath("//input"));
		
		Iterator it = ele.iterator(); // to loop through all the elements that is found
		
		while(it.hasNext())
			{
			WebElement e=(WebElement) it.next();
			
			System.out.println("Elements " + e.getLocation()  );
		
			}
		
		List<WebElement> ele2 = driver.findElements(By.xpath("dfgkdkgh"));
		
		System.out.println("size of dummy xpath" + ele2.size());
		
		// object of BY ==  return type of static method(By object)
		By locatorID = By.id("");
		By locatorName = By.name("");
		By locatorClass = By.className("");
		By locatorXpath = By.xpath("");
		By locatorCSS = By.cssSelector("");
		By locatorTag = By.tagName("");
		By locatorlink = By.linkText("");
		By locatorPartial = By.partialLinkText("");
		
		
	}

}
