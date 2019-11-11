package SeleniumSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class webDriverlaunch {

	public static void main(String[] args) throws MalformedURLException 
	{
		//create an instance of the browser
		//option-1 use the implemented class directly (Remotewebdriver (remoteenvironment) or use ChromeDriver or FirefoxDriver)
		//option-2 use the webdriver interface type casted by individual browser or remotebrowser
		
		//option-1 using RemoteWebDriver
		//URL and capabilities
		URL url = new URL("test"); // the remote nHub URL
		DesiredCapabilities cap = new DesiredCapabilities();
		
		// will engage a connection with GRID to load a node with specified browser config
		
		RemoteWebDriver driverremote = new RemoteWebDriver(url, cap); 
		
		//Option-1 using local browser
		// will load a browser on the machine where script is loaded
		FirefoxDriver ffdriver = new FirefoxDriver();
		
		ChromeDriver chdriver = new ChromeDriver();
		
		//option-2 is using the WebDriver interface and typecastin
		
		// create an instance of RWD(Grid) with Webdriver as a ni dealized browser
		WebDriver rwdriver = new RemoteWebDriver(url,cap);
		
		WebDriver ffDriver2 = new FirefoxDriver();
		
		ffDriver2 = new ChromeDriver();

	}

}
