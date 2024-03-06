package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIdLocator {
	
	public static void main(String[] args) {
		
		WebDriver obj = new ChromeDriver();
		
		obj.manage().window().maximize();
		
		obj.get("https://www.facebook.com/");
		
		//to identify the username textfelid and perform any action with id and password
		obj.findElement(By.id("email")).sendKeys("ashwinisonawane917@gmail.com");
	}

}
