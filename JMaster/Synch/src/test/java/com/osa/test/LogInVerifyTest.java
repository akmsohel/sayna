package com.osa.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import osa.com.pages.ForumLoginPage;
import osa.com.utility.AssertM;
import osa.com.utility.Browser;
import osa.com.utility.LogUtility;
import osa.com.utility.TestData;

public class LogInVerifyTest extends Browser{
	private static Logger log=LogUtility.getLog(LogInVerifyTest.class);

	
	  @Test(dataProvider = "logInInfo", dataProviderClass = TestData.class) public
	  void logIn(String email,String pass) {
	  driver.get("https://www.osaconsultingtech.com/Forum/logins/forum_login.html");
		log.info("Nvigating to OSA Consulting Tech Forum Login page");

	  ForumLoginPage.email().sendKeys(email);
	  log.info("Sending email data");
	  ForumLoginPage.password().sendKeys(pass); 
	  log.info("Sending password");
	  ForumLoginPage.login().click();
	  log.info("Clicking login button");
	  
	  log.info("verifying student login page");
	  AssertM.tittleMatch(driver.getTitle(), "Student Login Page");
	  }
	 
	
	
}
