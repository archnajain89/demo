package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class FirefoxProfile {
	
	
	
	WebDriver driver;
	
	@Test
	public void setupprofile() throws InterruptedException
	{
		
		System.setProperty("webdriver.firefox.marionette", "D:\\System\\T2system\\browsers jar\\geckodriver.exe");
		//ProfilesIni profile = new ProfilesIni();


		//org.openqa.selenium.firefox.FirefoxProfile myprofile = profile.getProfile("C:\\Users\\rreddy\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\apph8whf.default");

		 driver = new FirefoxDriver();
		
		 
		 driver.manage().window().maximize();
		 
		 driver.get("http://www.firstcry.com/");
		 
		 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		 
		 driver.close();
		 
		 
		 
		
	}

	
	
	
	
	
	
	
}
