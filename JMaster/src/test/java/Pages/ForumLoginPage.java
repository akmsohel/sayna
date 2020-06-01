package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.Utilities;



public class ForumLoginPage {

	private static Logger log=Utilities.getLog(ForumLoginPage.class);
	WebDriver dr = null;
	public ForumLoginPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr,this );
				
	}

	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath="//*[@id=\"login_button\"]")
	WebElement loginButton;
	
	public void enterUsername(String  user) {
		log.info("Entering username "+ user);
		username.sendKeys(user);
		}
	public void enterPassword(String pass) {
		log.info("Entering password "+ pass);
		password.sendKeys(pass);
		}
	public void clickOnLoginButton() {
		log.info("Clicking on Login button");
		loginButton.click();
	}
}
