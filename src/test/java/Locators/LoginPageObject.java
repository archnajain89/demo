package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

	public LoginPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = commonlocators.username)
	public WebElement usernameTextbox;
	
	@FindBy(id = commonlocators.Next)
	public WebElement clicknextbutton;
	
	@FindBy(name = commonlocators.password)
	public  WebElement passwordtext;
	
	@FindBy(id = commonlocators.ok)
	public WebElement okbutton;
	
	@FindBy(id = commonlocators.google)
	public WebElement googlemouse;
	
}

