package osa.com.utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class ScreenShoot {		
		
	
	public static void takeChobi(WebDriver driver, ITestResult result) {
		try {		
			File sourceFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File out = new File("./ScreenShoot/"+result.getName()+".jpeg");
			
			FileUtils.copyFile(sourceFile, out);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		 

					
	}

}
