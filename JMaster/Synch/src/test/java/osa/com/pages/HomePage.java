package osa.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends osa.com.utility.Browser {
	//public static WebDriver dr= driver;
	
	public static WebElement home() {
		//driver.get("https://www.osaconsultingtech.com");
		WebElement h =  driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/nav/ul/li[1]/a")) ;
		return h;
	}
	public static WebElement about() {
		//driver.get("https://www.osaconsultingtech.com");
		WebElement h =  driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/nav/ul/li[2]/a")) ;
		return h;
	}
	public static WebElement courses() {
		//driver.get("https://www.osaconsultingtech.com");
		WebElement h =  
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/nav/ul/li[3]/a")) ;
		return h;
	}
	public static WebElement blog() {
		//driver.get("https://www.osaconsultingtech.com");
		WebElement h =  
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/nav/ul/li[4]/a")) ;
		return h;
	}
	public static WebElement page() {
		//driver.get("https://www.osaconsultingtech.com");
		WebElement h =  
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/nav/ul/li[5]/a")) ;
		return h;
	}
	public static WebElement contact() {
		//driver.get("https://www.osaconsultingtech.com");
		WebElement h =  
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/nav/ul/li[6]/a")) ;
		return h;
	}
	public static WebElement forumLogin() {
		//driver.get("https://www.osaconsultingtech.com");
		WebElement h =  
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div/div/div/div/div/a")) ;
		return h;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
	
	
	
		

	}
/*
 * public HomePageE(WebDriver dr) { PageFactory.initElements(dr, this); }
 * 
 * @FindBy(xpath="//a[text()='Forum Login']") public WebElement
 * forumLoginButton;
 * 
 * @FindBy(xpath="(//a[text()='Courses'])[1]") public WebElement coursesButton;
 * 
 * public void clickOnForumLoginButton() { forumLoginButton.click();
 * 
 * } public void clickOnCoursesButton() { coursesButton.click();
 * 
 * }
 */
