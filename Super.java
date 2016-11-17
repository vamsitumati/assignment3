package task3;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Super {

	private static WebDriver driver = null;
	private static final String dragAndDrop = "http://html5demos.com/drag";
	private static final String w3URL = "http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
	private static final String URL = "https://facebook.com/";
	private static final String expedia = "https://www.expedia.com/";
	private static final String yahoo = "https://www.yahoo.com";
	private static final String dhtxl = "https://dhtmlx.com/";

	public static WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		Super.driver = driver;

	}

	@BeforeClass
	public void beforeClass() {
		
		 /* System.setProperty("webdriver.ie.driver", "C://Selenium//IEDriverServer.exe"); 
		  driver = new InternetExplorerDriver();*/
		 
		/*
		  System.setProperty("webdriver.gecko.driver","C://Selenium//geckodriver.exe"); 
		  driver = new FirefoxDriver();*/
		 

		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// driver.get(yahoo);
		// driver.get(dragAndDrop);
		// driver.get(URL);
		//driver.get(expedia);
		  driver.get(dhtxl);

	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}


	public static void switchToWindow(int index) {
		List<String> list = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(list.get(index));
	}

	public static void switchToRootCloseCurrent() {
		List<String> list = new ArrayList<String>(getDriver().getWindowHandles());
		for (int i = 1; i < list.size(); i++) {
			getDriver().switchTo().window(list.get(i));
			getDriver().close();
		}
		getDriver().switchTo().window(list.get(0));
	}

}
