package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatorEx {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		
		//id
		By locatorid = By.id("username");
		WebElement userid = driver.findElement(locatorid);
		System.out.println("User " + userid.getLocation());
		
		//name
		By locatorname = By.name("session_password");
		WebElement pass = driver.findElement(locatorname);
		System.out.println("Pass " + pass.getLocation());
		
		//class
		By locatorClass = By.className("button__password-visibility");
		WebElement show = driver.findElement(locatorClass);
		System.out.println("show" + show.getLocation());
		
		//linkedText
		By locatorLink = By.linkText("Forgot password?");
		WebElement forgotPass = driver.findElement(locatorLink);
		System.out.println("forgot" + forgotPass.getLocation());
		
		//Partial link Text
		By partialLink = By.partialLinkText("Join");
		WebElement partial = driver.findElement(partialLink);
		System.out.println("partial " + partial.getLocation());
		
		//Tagname
		By tag = By.tagName("h1");
		WebElement header = driver.findElement(tag);
		System.out.println("Header " + header.getLocation());
		
		//csspath
		By cssex = By.cssSelector("body.system-fonts:nth-child(2) main.app__content:nth-child(2) div:nth-child(1) div.footer-app-content-actions div:nth-child(1) > a.btn__tertiary--medium.action__btn");
		WebElement forgottwo = driver.findElement(cssex);
		System.out.println(forgottwo.getLocation());
		
		//Xpath
		By xpathex = By.xpath("//a[contains(text(),'User Agreement')]");
		WebElement useragree = driver.findElement(xpathex);
		System.out.println(useragree.getLocation());
		
		By xpath2 = By.xpath("//input[@id='password' and @name='session_password']");
		driver.findElement(xpath2).sendKeys("hello");
		
	}

}
