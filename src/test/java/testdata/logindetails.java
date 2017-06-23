package testdata;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Locators.LoginPageObject;
import Utilities.Browsersettings;
import Utilities.GetScreenshot;
import pagehelper.DriverHelper;



public class logindetails extends Browsersettings{


	GetScreenshot screen;
	DriverHelper dh =new DriverHelper();


@Test(priority=0)
	public void login() throws InterruptedException {
	/*
	try{ 
	
		LoginPageObject lpo = new LoginPageObject(driver);
	//	System.out.println("Username" + username);
		lpo.usernameTextbox.clear();
		lpo.usernameTextbox.sendKeys("ramanareddybolla9");
		lpo.clicknextbutton.click();
		//System.out.println("Username" + password);
		Thread.sleep(10000);
	WebElement e=	lpo.googlemouse;
		dh.mouseOver(e);
		
			 lpo.passwordtext.clear();
			 lpo.passwordtext.sendKeys("789653");
		Thread.sleep(1000);
				lpo.okbutton.click();
		      
		   }catch(ArithmeticException e){System.out.println(e);}  
		   System.out.println("rest of the code...");  
		   screen= new GetScreenshot();
		   screen.captureScreenshot();
		}  */
}
@Test
public void PopWindows() throws InterruptedException{
	

    
    /*driver.findElement(By.xpath("//button[@onclick='newMsgWin()']")).click();
    
    Set handles = driver.getWindowHandles();

    for (String handle1 : driver.getWindowHandles()) {

    	driver.switchTo().window(handle1);

    	}
    Thread.sleep(1000);
driver.close();*/
         }
@Test
public void Test1() throws InterruptedException, AWTException
{
	Thread.sleep(10000);
	WebElement e=driver.findElement(By.xpath("//*[@id='gb']/descendant::a[1]"));
	
	Actions action = new Actions(driver);
	action.moveToElement(e).contextClick().build().perform();


	Robot r=new Robot();
	r.delay(200);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

}


	 }


