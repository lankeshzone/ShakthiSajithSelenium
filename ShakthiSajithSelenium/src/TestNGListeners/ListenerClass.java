package TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener
{
	
	
	public void onTestStart(ITestResult result) 
	{
		System.out.println("This is onTestStart Method  " + result.getName());
		
	}
	
	

	public void onTestSuccess(ITestResult result)
	{
		System.out.println("The test has successfully passed   " + result.getName());
		System.out.println("Test status " + result.getStatus());
		System.out.println("Test Name" + result.getTestName());
		System.out.println("SUccess or failure " +result.isSuccess());
		System.out.println("class name " + result.getClass());
		
	}

	public void onTestFailure(ITestResult result)
	{
		System.out.println("The test has failed   " + result.getName());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
		System.out.println("The test has started   " + context.getName());

	}

	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("all tests have been run    " + context.getName());

		
	}
}
