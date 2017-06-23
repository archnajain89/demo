package Utilities;

import java.awt.Paint;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FetchDetails extends Browsersettings {

	@Test
	public void Test1() throws InterruptedException, IOException
	{
		
	Thread.sleep(10000);

	
	Actions action = new Actions(driver);
	WebElement we = driver.findElement(By.xpath("//*[@title='Men']"));
	action.moveToElement(we).build().perform();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@title='Shirts']")).click();
	Thread.sleep(5000);


	List<WebElement> lst=driver.findElements(By.tagName("img"));
	
	for(WebElement imageFromList:lst){
		
	     String ImageUrl=imageFromList.getAttribute("src");

	     System.out.println(ImageUrl);
	     
	     
	}
         
    
}
}
