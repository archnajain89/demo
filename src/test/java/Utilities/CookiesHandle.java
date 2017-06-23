package Utilities;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;


public class CookiesHandle extends Browsersettings{
	
	
	@Test
	public void handlecooies() throws IOException
	{
	 
		Path cookiesFile = Paths.get("D:\\hello.txt");

		// save the cookies to a file for the current domain
		try (PrintWriter file = new PrintWriter(cookiesFile.toFile(), "UTF-8")) {
		    for (Cookie c : driver.manage().getCookies()) {
		        file.println(c.toString().split(";", 10)); 
		    
		    }
		    
		}
		
		}
	
}
