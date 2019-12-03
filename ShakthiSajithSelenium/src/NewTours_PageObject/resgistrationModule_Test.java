package NewTours_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.Driver;

@Listeners(TestNGListeners.ListenerClass.class)
public class resgistrationModule_Test
{
	
	static WebDriver driver;
	static RegistrationPage rpo;
	static HomePage hpo;
	static Driver d;
	
	@BeforeTest
	public void beforetest()
	{
		d = new Driver();
	}
	

	
	@Test (priority=0)
	public void sampleTestOne()
	{
		driver = d.setupBrowser("firefox", "http://newtours.demoaut.com/mercurywelcome.php");
		
		System.out.print(d.checkTitle("Demo automation website", driver));
		
		rpo = new RegistrationPage(driver);
		hpo = new HomePage(driver);
		//hpo.register_Link("linktext", "REGISTER"); // identify the register ink on the page
		
		hpo.register_click();
		
		
	}
	
	
	@Test (priority=1, enabled=false)
	public void sampleTestTwo()
	{
		//automation code here...
		String expected = "Lankesh";
		
		String actual = "Shakthi";
		
		//Assert.assertEquals(expected, actual);
		
		System.out.println("Iam in test case from Second testng file ------------- ");
	}
	
	@Test (priority=2, enabled = false)
	public void sampleTestThree()
	{
		//automation code here...
		String expected = "Lankesh";
		
		String actual = "Shakthi";
		
		//Assert.assertEquals(expected, actual);
		
		System.out.println("Iam in test case from Thrird testng file ------------- ");
	}
	
	
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("Iam after test");
	}
	
	
	
	
	
	
	
	
}
