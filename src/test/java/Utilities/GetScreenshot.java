package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class GetScreenshot {
	
	public static String mailscreenshotpath;
	public static WebDriver driver;
	
	public static void captureScreenshot(){
		
		driver=Browsersettings.driver;
		
		 Calendar cal = new GregorianCalendar();
		  int month = cal.get(Calendar.MONTH); //4
		  int year = cal.get(Calendar.YEAR); //
		  int sec =cal.get(Calendar.SECOND);
		  int min =cal.get(Calendar.MINUTE);
		  int date = cal.get(Calendar.DATE);
		  int day =cal.get(Calendar.HOUR_OF_DAY);
		
		

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   try {
	   	mailscreenshotpath = System.getProperty("user.dir")+"\\screenshots\\screenshots\\"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg";
			FileUtils.copyFile(scrFile, new File(mailscreenshotpath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	    
	   
	    	      
	}

}
