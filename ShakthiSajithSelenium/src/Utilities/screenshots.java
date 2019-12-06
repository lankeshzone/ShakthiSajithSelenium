package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshots 
{
	
	static WebDriver driver;
	
	public screenshots(WebDriver d)
	{
		//driver = d;
	}
	
	public void capturescreen(WebDriver driver) throws IOException
	{
		//this.driver = driver;
		TakesScreenshot screen = (TakesScreenshot)driver;
		
		File f = screen.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("D://Test//TestNGscreenshot.png"));
		
		// Test NG Class/Suite/Test case name + timestamp
	}

}
