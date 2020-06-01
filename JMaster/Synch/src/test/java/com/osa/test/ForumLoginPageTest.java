package com.osa.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import osa.com.pages.ForumLoginPage;
import osa.com.pages.HomePage;
import osa.com.utility.AssertM;
import osa.com.utility.Browser;
import osa.com.utility.LogUtility;

public class ForumLoginPageTest extends Browser {
	Logger log=LogUtility.getLog(ForumLoginPageTest.class);

	public void forumLoginTittleVerify() {
		driver.get("https://www.osaconsultingtech.com");
		log.info("Navigating to OSA homepage");
		HomePage.forumLogin().click();
		log.info("Click on ForumLogin Button");
		
		AssertM.tittleMatch(driver.getTitle(), "Forum Login");
		log.info("Verifing  ForumLogin Page tittle");

		}
	public void headerVerify() {
		driver.get("https://www.osaconsultingtech.com/Forum/logins/forum_login.html");
		log.info("Navigating to Forum Login page");
		String a=ForumLoginPage.header().getText();
		log.info("Getting header text");
		AssertM.textMatch(a, "OSA Consulting Tech");
		log.info("Verifing header text");

		}
	public void subHeaderVerify() {
		driver.get("https://www.osaconsultingtech.com/Forum/logins/forum_login.html");
		log.info("Navigating to Forum Login page");
		String a=ForumLoginPage.subHeader().getText();
		log.info("Getting Sub header text");

		AssertM.textMatch(a, "Forum Login");
		log.info("Verifing subheader text");

		}
	public void emailVerify() {
		driver.get("https://www.osaconsultingtech.com/Forum/logins/forum_login.html");
		log.info("Navigating to Forum Login page");
		String a=ForumLoginPage.email().getText();
		log.info("Getting email placeholder text");

		AssertM.textMatch(a, "Email");
		log.info("Verifing email text");

		}
	public void passVerify() {
		driver.get("https://www.osaconsultingtech.com/Forum/logins/forum_login.html");
		log.info("Navigating to Forum Login page");
		String a=ForumLoginPage.password().getText();
		log.info("Getting password placeholder text");

		AssertM.textMatch(a, "Password");
		log.info("Verifing password text");

		}
	public void loginButtonVerify() {
		driver.get("https://www.osaconsultingtech.com/Forum/logins/forum_login.html");
		log.info("Navigating to Forum Login page");
		String a=ForumLoginPage.login().getText();
		log.info("Getting login button text");

		AssertM.textMatch(a, "Login");
		log.info("Verifing login button text");

		}
	
	public void addressVerify() {
		driver.get("https://www.osaconsultingtech.com/Forum/logins/forum_login.html");
		log.info("Navigating to Forum Login page");
		String a=ForumLoginPage.address().getText();
		log.info("Getting Adreess text");

		String b=a.replace("\n"," ");
	    log.info("Replacing line brake with a space");  
		AssertM.textMatch(b, "OSA Consulting Tech New York, USA");
		log.info("Verifing adress text");
		}
   
}
