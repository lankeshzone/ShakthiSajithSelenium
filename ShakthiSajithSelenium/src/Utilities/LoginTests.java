package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.ErrorPage;
import PageObjects.LandingPage;
import PageObjects.LoginPage;

public class LoginTests {

	public static void main(String[] args)
	{
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com");
		
		//step-1 click on signin from landing page
		LandingPage lpo = new LandingPage(driver);
		lpo.signIN_Click("class", "nav__button-secondary");
		
		//step-2 enter userID
		LoginPage loginPage = new LoginPage(driver);
		loginPage.userName_EnterText("id", "username", "lankeshzone@gmail.com");
		
		loginPage.password_EnterText("name", "session_password", "lankesh123");
		
		loginPage.login_click("class", "btn__primary--large");
		
		//Verify the error message
		ErrorPage epo = new ErrorPage(driver);
		String actualMessage = epo.error_message("id", "error-for-password");
		
		String ExpectedMessage = "Invalid Login";
		
		if (actualMessage.equals(ExpectedMessage))
			System.out.println("Message matches " + ExpectedMessage);
		else
			System.out.println("Message does not match " + ExpectedMessage);
	}

}
