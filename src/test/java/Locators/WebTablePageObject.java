package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePageObject {
	
	public WebTablePageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(tagName = WebTableLocator.Table)
	public WebElement Table;

	
	@FindBy(xpath = WebTableLocator.row)
	public WebElement row;
	
	@FindBy(xpath = WebTableLocator.column)
	public WebElement column;
}
