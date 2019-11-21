package SeleniumSession;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class actionsClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
		
		driver.manage().window().maximize();
		
		WebElement slider = driver.findElement(By.xpath("//div[@class='layered_price']//a[1]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000);");
		
		Actions act = new Actions(driver);
		
		act.build();
		act.moveToElement(slider).dragAndDropBy(slider, 80,0).perform();
		
		
		// capture the screenshot using getscreenshotas method
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Selenium
		
		// copy the file object to preferred location
		FileUtils.copyFile(f, new File("D://Test//sakthiImage1.jpg"));	 // Apache POI commons-io-2.6

	}

}
