package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Locators.WebTablePageObject;


public class WebTable extends Browsersettings{
	
	//public static WebDriver driver;
	@Test
	public void DynamicTableTest()
	{
		
		WebTablePageObject web = new WebTablePageObject(driver);
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		 System.out.println("Start");
	 WebElement baseTable =web.Table;
	
	 WebElement tableRow = web.row;
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	 WebElement tableRowText = web.column;
	
	 String rowtext = tableRow.getText();
	 String rowtext1=tableRowText.getText();
	 System.out.println("3 row details :"+rowtext+     "4th column details :"+rowtext1);
	}

}
