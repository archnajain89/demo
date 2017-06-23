package testscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Locators.LoginPageObject;
import Utilities.Browsersettings;
import Utilities.GetData;

import testdata.logindetails;

public class LoginTest extends Browsersettings {

	@Test(dataProvider = "Authentication")
	public void login(String username, String password) {
		//System.out.println("sTARST");
		System.out.println("user:" + username + ":Pass:" + password);
		// logindetails ld = new logindetails(Browsersettings.driver);
		// ld.login(username,password);
		//System.out.println("sTARST");

	}

	/*@Test(dataProvider = "tion")
	public void login1(String username, String password) {
		System.out.println("sTARST");
		System.out.println("user:" + username + ":Pass:" + password);
		// logindetails ld = new logindetails(Browsersettings.driver);
		// ld.login(username,password);
		System.out.println("sTARST");

	}
*/
/*	@DataProvider
	public Object [][] Authentication(){		
		return TestUtil.getData("Sheet1");
	}
	
	@DataProvider
	public Object [][] tion(){		
		return TestUtil.getData("Sheet2");
	}
	*/
	
	
	
}
