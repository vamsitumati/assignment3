package task3;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class A1 extends Super {
	 private static void screenshotMethod(String filename) 
	  {
		  
	       try {
	    	   File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE); 
	    	   String timeStamp = new SimpleDateFormat("MM_dd_yyyy HH_mm_ss").format(Calendar.getInstance().getTime());
	           FileUtils.copyFile(src, new File(filename+timeStamp+".png")); 
	            } 
	       catch(IOException e){ 
	            e.printStackTrace(); 
	            }
	  }
	 
	@Test
	public static void screenShot() {
		try {
			getDriver().findElement(By.id("l")).click();
		   } 
		
		catch (Exception e){
			screenshotMethod("vamsi");
		
			}
	   }
}
