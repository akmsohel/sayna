package osa.com.utility;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Browser {
	Logger log=LogUtility.getLog(Browser.class);
	public static WebDriver driver;
	String dir= System.getProperty("user.dir")	;
	
	@BeforeTest
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",dir+
	    "\\Resources\\Drivers\\chromedriver.exe");
		log.info("Setting the webdriver path for chromedriver");
		driver= new ChromeDriver();	
		log.info("Openning chrome Browser");
		driver.manage().window().maximize();
		log.info("Maximizing window");			
	}
	
	public void rifat() {
		System.setProperty("webdriver.gecko.driver",
				dir+
			    "\\Resources\\Drivers\\geckodriver.exe");
		log.info("Setting the webdriver path for firefoxdriver");
					driver= new FirefoxDriver();
					log.info("Openning Firefox Browser");

	  }
	@AfterTest
	public void closeB() {
		driver.close();
		log.info("Closing the browser");
	}
}
