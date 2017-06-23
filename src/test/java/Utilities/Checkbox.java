package Utilities;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Checkbox extends Browsersettings {

	@Test
	//Count number of check boxes and click odd and even wise
	public void checkcount() throws InterruptedException {

		/*
		 * List<WebElement> boxes =
		 * driver.findElements(By.xpath("//*[@type='checkbox']")); int
		 * numberOfBoxes = boxes.size();
		 * 
		 * System.out.println(numberOfBoxes);
		 * 
		 * 
		 * 
		 * Thread.sleep(1000); for(int i=0;i<numberOfBoxes;i++) { i++;
		 * ((WebElement) boxes.get(i)).click(); Thread.sleep(1000); }
		 */

	}

	/*
	 @Test 
	 //Create a folder with in the project
	 public void floder() { 
		 
		 String path ="D:\\System\\T2system\\Screenshot"; 
	   File dir = new File(path); 
	   
	   boolean x= dir.mkdir(); 
	   System.out.println("path of dir ::" + x); 
	   }
	 
	
	  @Test 
	  //Change System formatt
	  public void Systemdate()
	 { 
		  DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		  Date date = new Date();
	  System.out.println(dateFormat.format(date)); 
	  }
	 
	@Test
	//Button border color change
	public void colorchange() throws InterruptedException {
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.xpath("//*[@alt='Flipkart'][@title='Flipkart']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		   for (int iCnt = 0; iCnt < 3; iCnt++) {
		 
		         js.executeScript("arguments[0].style.border='4px groove Red'", element);
		         Thread.sleep(1000);
		         js.executeScript("arguments[0].style.border=''", element);
		   }}
*/
@Test
	public void link() throws InterruptedException 
	{
	
	Thread.sleep(1000);
	 WebElement elems = (WebElement) driver.findElements(By.tagName("table"));
	 
	 List<WebElement> elems1 = ((WebElement) elems).findElements(By.tagName("tr"));
	 
	 System.out.println(elems1.size());
	
	 List<WebElement> elems2 = ((WebElement) elems1).findElements(By.tagName("td"));
	 

	// List<WebElement> elems3 = ((WebElement) elems2).findElements(By.tagName("a"));
	 
			System.out.println(elems2.size());
	
	}
	
	
	
	      
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
