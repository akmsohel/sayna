package osa.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import osa.com.utility.Browser;

public class ForumLoginPage extends Browser {
	public static WebElement header() {
		 //WebElement h = driver.findElement(By.xpath("/html/body/div/h1"));
		  return driver.findElement(By.xpath("/html/body/div/h1")) ;
		}
		public static WebElement subHeader() {
			
			WebElement h =driver.findElement(By.xpath("/html/body/center/div[1]/div/b"));
			  return h ;
			}

	public static WebElement email() {
		  WebElement h = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		  return h ;
		}
	public static WebElement password() {
			  WebElement h = driver.findElement(By.xpath("//*[@id=\"password\"]"));
			  return h ;
			}
	public static WebElement login() {
		
				  WebElement h = driver.findElement(By.xpath("//*[@id=\"login_button\"]"));
				  return h ;
	}
	public static WebElement address() {
		  WebElement h = driver.findElement(By.xpath("/html/body/center/div[2]"));
		  return h ;
	}

}
