package NewTours_PageObject;

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
import org.testng.annotations.Test;

public class resgistrationModule_Test
{
// 11 different annotations...
	
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Iam before suite");
	}
	
	@BeforeGroups
	public void beforegroup()
	{
		System.out.println("Iam before groups");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Iam before class");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Iam before test");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Iam before method");
	}
	
	@Test (priority=0)
	public void sampleTestOne()
	{
		//automation code here...
		String expected = "Lankesh";
		
		String actual = "Shakthi";
		
		//Assert.assertEquals(expected, actual);
		
		System.out.println("Iam in test case from first testng file ------------- ");
	}
	
	
	@Test (priority=1)
	public void sampleTestTwo()
	{
		//automation code here...
		String expected = "Lankesh";
		
		String actual = "Shakthi";
		
		//Assert.assertEquals(expected, actual);
		
		System.out.println("Iam in test case from Second testng file ------------- ");
	}
	
	@Test (priority=2, enabled = true)
	public void sampleTestThree()
	{
		//automation code here...
		String expected = "Lankesh";
		
		String actual = "Shakthi";
		
		//Assert.assertEquals(expected, actual);
		
		System.out.println("Iam in test case from Thrird testng file ------------- ");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Iam after method");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("Iam after test");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("Iam after class");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Iam after Suite");
	}
	
	@AfterGroups
	public void aftergroups()
	{
		System.out.println("Iam after groups");
	}
	
	
	
	
	
	
	
}
