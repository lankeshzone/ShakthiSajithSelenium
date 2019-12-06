package NewTours_PageObject;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
import Utilities.screenshots;
import Utilities.waits;

@Listeners(TestNGListeners.ListenerClass.class)
public class resgistrationModule_Test
{
	
	static WebDriver driver;
	static RegistrationPage rpo;
	static HomePage hpo;
	static Driver d;
	static screenshots screen;
	static waits wait;
	
	@BeforeTest
	public void beforetest()
	{
		d = new Driver();
		screen = new screenshots(driver);
		wait = new waits(driver);
	}
	

	
	@Test (priority=0)
	public void sampleTestOne() throws IOException, InterruptedException
	{
		driver = d.setupBrowser("firefox", "http://newtours.demoaut.com/mercurywelcome.php");
		
		System.out.print(d.checkTitle("Demo automation website", driver));
		
		rpo = new RegistrationPage(driver);
		hpo = new HomePage(driver);
		wait.sleep(5000);
		//hpo.register_Link("linktext", "REGISTER"); // identify the register ink on the page
		
		hpo.register_click();
		
		wait.implicitWait(15, "seconds");
		
	/*	TakesScreenshot screen = (TakesScreenshot)driver;
		
		File f = screen.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("D://Test//TestNGscreenshot.png"));
		*/
		screen.capturescreen(driver);
		
		
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
