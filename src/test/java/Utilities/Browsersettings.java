package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;

public class Browsersettings {
	
	enum DriverType {
		Firefox, IE, Chrome
	}

	public static WebDriver driver;
//	public static Xls_Reader excel = null;
	
	
	@BeforeSuite
	public static void setUp() {
		

		//excel = new Xls_Reader(System.getProperty("user.dir") + "//data.xlsx");

		propertyreader p = new propertyreader();

		String driverType = p.readApplicationFile("BROWSER");
	
		System.out.println(driverType);

		if (DriverType.Firefox.toString().equals(driverType)) {
			System.setProperty("webdriver.firefox.marionette", "D:\\System\\T2system\\browsers jar\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (DriverType.IE.toString().equals(driverType)) {
			System.setProperty("webdriver.ie.driver","D:\\System\\T2system\\browsers jar\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
			
		} else if (DriverType.Chrome.toString().equals(driverType)) {
			System.setProperty("webdriver.chrome.driver","D:\\System\\T2system\\browsers jar\\chromedriver.exe");
			driver = new ChromeDriver();

		} else {
			//driver = new FirefoxDriver();
		}


		// maxmize window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// open url
//http://money.rediff.com/gainers/bse/daily/groupa
		//http://toolsqa.wpengine.com/automation-practice-switch-windows/
		//https://www.google.co.in/
		//https://www.flipkart.com/
		//https://www.gmail.com/
		//http://www.tizag.com/htmlT/htmlcheckboxes.php
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		
		
			 
	}
	
	
	/*@AfterSuite
	public void close() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.close();
	}*/
}