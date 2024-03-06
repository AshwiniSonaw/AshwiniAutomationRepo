package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithNameLocator {

		public static void main(String[] args) {
			
			WebDriver obj = new ChromeDriver();
			
			obj.manage().window().maximize();
			
			obj.get("http://127.0.0.1/login.do;jsessionid=3lqjgcstofwi2");
			
			//to identify the username and perform any action with id and to enter value use send keys
			obj.findElement(By.name("username")).sendKeys("admin");
			
			//to identify the pwd and perform action with password and to enter value use send keys
			obj.findElement(By.name("pwd")).sendKeys("manager");
			
			//to identify login button and perform any action with id locator & to click on button use click method
			obj.findElement(By.id("loginButton")).click();
		}

	}
