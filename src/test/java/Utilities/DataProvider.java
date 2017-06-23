package Utilities;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DataProvider extends Browsersettings {
	
	
	

	  @Test(dataProvider = "Authentication")
	 
	  public void f(String sUserName, String sPassword) {
	 
		    driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
		    driver.findElement(By.id("log")).sendKeys(sUserName);
	 
			System.out.println(sUserName);
	 
		    driver.findElement(By.id("pwd")).sendKeys(sPassword);
	 
			System.out.println(sPassword);
	 
		    driver.findElement(By.id("login")).click();
	 
		    System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	 
		    driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	 
	  }
	
	

}
