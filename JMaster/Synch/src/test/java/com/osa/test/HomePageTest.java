package com.osa.test;



import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import osa.com.pages.HomePage;
import osa.com.utility.AssertM;
import osa.com.utility.Browser;
import osa.com.utility.LogUtility;

public class HomePageTest extends Browser {
	private static Logger log=LogUtility.getLog(HomePageTest.class);

	
	public void homeTittleVerify() {
		driver.get("https://www.osaconsultingtech.com");
		log.info("Navigating to OSA home page");
		HomePage.home().click();
		log.info("Click on Home Button");
		AssertM.tittleMatch(driver.getTitle(), "OSA Consulting Tech");
		log.info("Verifying home button tittle");
	}
	@Test
	public void aboutTittleVerify() {
		driver.get("https://www.osaconsultingtech.com");
		log.info("Navigating to OSA home page");
		HomePage.about().click();
		log.info("Click on About Button");

		AssertM.tittleMatch(driver.getTitle(), "About");
		log.info("Verifying About button tittle");
		}
	@Test
	public void coursesTittleVerify() {
		driver.get("https://www.osaconsultingtech.com");
		log.info("Navigating to OSA home page");
		HomePage.courses().click();
		log.info("Click on Courses Button");

		AssertM.tittleMatch(driver.getTitle(), "Courses");
		log.info("Verifying Courses button tittle");
		}
	@Test
	public void blogTittleVerify() {
		driver.get("https://www.osaconsultingtech.com");
		log.info("Navigating to OSA home page");
		//boolean a = HomePage.blog().isEnabled();
	
		/*
		 * String b= HomePage.blog().getText(); if() {
		 * System.out.println(b+" is not enabled"); }
		 */
		HomePage.blog().click();
		log.info("Click on Blog Button");

		AssertM.tittleMatch(driver.getTitle(), "blog");
		log.info("Verifying Blog button tittle");
		}
	@Test
	public void pageTittleVerify() {
		driver.get("https://www.osaconsultingtech.com");
		log.info("Navigating to OSA home page");

		HomePage.page().click();
		log.info("Click on Page Button");

		AssertM.tittleMatch(driver.getTitle(), "page");
		log.info("Verifying Page button tittle");
		}
	@Test
	public void contactTittleVerify() {
		driver.get("https://www.osaconsultingtech.com");
		log.info("Navigating to OSA home page");

		HomePage.contact().click();
		log.info("Click on Contact Button");

		AssertM.tittleMatch(driver.getTitle(), "Contact");
		log.info("Verifying Contact button tittle");
		}
	@Test
	public void forumLoginTittleVerify() {
		driver.get("https://www.osaconsultingtech.com");
		log.info("Navigating to OSA home page");

		HomePage.forumLogin().click();
		log.info("Click on ForumLogin Button");

		AssertM.tittleMatch(driver.getTitle(), "Forum Login");
		log.info("Verifying ForumLogin button tittle");
		}
	
	
	

}
