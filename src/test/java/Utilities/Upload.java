package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Upload {
	
	WebDriver driver;
	@Test
	public void UploadFile() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\System\\T2system\\browsers jar\\chromedriver.exe");
		driver = new ChromeDriver();
        
		
		driver.get("http://www.tinyupload.com/");
		Thread.sleep(5000);
		WebElement element= driver.findElement(By.name("uploaded_file"));
		element.sendKeys("C:\\Users\\rreddy\\Desktop\\rama\\Tulips.jpg");
		
		driver.findElement(By.xpath("//*[@alt='Upload']")).click();
		
		
		
	}

}
