package Locators;

import Utilities.Browsersettings;

public class commonfunctionality {
	
	public static  LoginPageObject HomePageRetail() {
		LoginPageObject homePageRetail = new LoginPageObject(Browsersettings.driver);
		return homePageRetail;
	}

}
