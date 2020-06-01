package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OsaHomePage {

	WebDriver dr = null;
	public OsaHomePage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}

//you have to find out all elements in the page
	//and create under findby anootation to use
	//your relative method
	
	  @FindBy(xpath=
	  "/html/body/div[2]/header/div[2]/div/div/div/div/nav/ul/li[1]/a") WebElement
	  homeLink;
	
	  @FindBy(xpath="//a[text()=\"Forum Login\"]") 
	  WebElement forumLoginLink;
	
	  public void clickOnHomeLink() { 
		  homeLink.click(); 
	  }
	  public void  clickOnForumLogin() {
		  forumLoginLink.click();
		  
	  }
}
