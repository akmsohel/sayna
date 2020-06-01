package stepDefinition;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Browser;
import com.base.Utilities;

import Pages.ForumLoginPage;
import Pages.OsaHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeLogin {
	private static Logger log=Utilities.getLog(HomeLogin.class);
	ChromeDriver dr;
	OsaHomePage hp;
	ForumLoginPage flp;
	@Given("^I navigate to OSA forum page$")
	public void i_navigate_to_OSA_forum_page() {
		
		//Browser b = new Browser();
		  
			dr=Browser.openB();
		//dr= b.openB();
			log.info("Navigating to https://www.osaconsultingtech.com");
			dr.get("https://www.osaconsultingtech.com");
		    hp = new OsaHomePage(dr);
			hp.clickOnForumLogin();
	    
	}

	@Given("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_username_and_password(String user, String pass)  {
		
		    log.info("Entering username "+user+ " and entering password "+ pass);
		    flp =new ForumLoginPage(dr);     
		    flp.enterUsername(user);
		    flp.enterPassword(pass);
	   
	}

	@When("^I click on login button$")
	public void i_click_on_login_button()  {
		    log.info("clicking on login button");
		    flp.clickOnLoginButton();
	   
	}

	@Then("^I verify that the forum student page is displayed$")
	public void i_verify_that_the_forum_student_page_is_displayed()  {
		 //   Assert.assertEquals(1,2);
		    log.info("logging page appear");
		    System.out.println("I am verifying the student page");
		    log.info("close window");
		    System.out.println("window has closed");
		    dr.close();
		   // dr.quit();
	 
	}

}






