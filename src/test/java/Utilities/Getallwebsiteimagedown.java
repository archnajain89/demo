package Utilities;


	
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;  

	 public class Getallwebsiteimagedown {  
	   static WebDriver driver;  
	   static List<WebElement> imageurls, links;  
	   public static void main(String[] a) throws InterruptedException, MalformedURLException, IOException {  
			System.setProperty("webdriver.chrome.driver","D:\\System\\T2system\\browsers jar\\chromedriver.exe");
			driver = new ChromeDriver();
	     //Maximize browser window   
	     driver.manage().window().maximize();  
	     String websiteaddress = "https://www.flipkart.com/mens-shirts-store?otracker=nmenu_sub_Men_0_Shirts";  
	     //Go to website   
	     driver.get(websiteaddress);  
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	     //get all url of page  
	   /*  links = driver.findElements(By.tagName("a"));  
	     for (int k = 0; k < links.size(); k++) {  
	       // check url not null, empty and only current website   
	       if (!(links.get(k).getAttribute("href") == null) && !(links.get(k).getAttribute("href").equals("")) && (links.get(k).getAttribute("href").contains("flickr.com")) && !(links.get(k).getAttribute("href").contains("@"))) {  
	         // Open new tab  
	 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");  
	         driver.get(links.get(k).getAttribute("href"));  
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  */
	         // get all images  
	         imageurls = driver.findElements(By.tagName("img"));  
	         System.err.println("Page URL =: " + driver.getCurrentUrl());  
	         //get all images url  
	         for (int m = 0; m < imageurls.size(); m++) {  
	           if (!(imageurls.get(m).getAttribute("src").equals("")) && !(imageurls.get(m).getAttribute("src") == null)) {  
	 String[] imagename = imageurls.get(m).getAttribute("src").trim().split("\\/");  
	 System.out.println(imageurls.get(m).getAttribute("src") + "  " + imagename[imagename.length - 1]);  
	             //download image  
	 URL url = new URL(imageurls.get(m).getAttribute("src").trim());  
	 System.err.println("url---------------" + url);
	 InputStream in = new BufferedInputStream(url.openStream());  
	 OutputStream out = new BufferedOutputStream(new FileOutputStream("image/" + imagename[imagename.length - 1]));  
	             for (int i; (i = in.read()) != -1;) {  
	               out.write(i);  
	             }  
	             in.close();  
	             out.close();  
	           }  
	         }  
	         // close open tab  
	/* driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");  
	 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");  
	         driver.switchTo().defaultContent();  
	         Thread.sleep(7000);  */
	       }  
	    // }  

	   }  
	// }  



