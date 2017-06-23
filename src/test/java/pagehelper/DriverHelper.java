package pagehelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Browsersettings;

public class DriverHelper {
	
	
	public static WebDriver driver;
	public void mouseOver(WebElement locator)
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(locator).perform();
		//builder.moveToElement(element).click().perform();
	}
	
	
	

}
