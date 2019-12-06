package NewTours_PageObject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.oracle.tools.packager.Platform;

public class RWD {

	public static void main(String[] args) throws MalformedURLException
	{
	
		URL ur = new URL("http://172.20.10.4:4444/wd/hub");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName("chrome");
		
		//cap.setPlatform(Platform.WINDOWS);
		
		WebDriver rd = new RemoteWebDriver(ur,cap);
		
		rd.get("https://www.google.co.in");
		
	}

}
