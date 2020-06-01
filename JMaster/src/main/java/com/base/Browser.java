package com.base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
 WebDriver dr = null;
	public  static Logger log =Utilities.getLog(Browser.class);
	
public static  ChromeDriver openB() {
	   log.info("Opening a blank browser");
	System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
	//dr.manage().window().maximize();
	//dr.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	return new ChromeDriver();
	
}

public  void closeB() {
	dr.quit();
}
}
