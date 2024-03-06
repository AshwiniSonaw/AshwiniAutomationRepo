package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		WebDriver k = new ChromeDriver();
		
		//to maximize window
		k.manage().window().maximize();
		
		//to open web application
		k.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//for synchronization
		Thread.sleep(2000);
		
		//to identify username with cssSelctor
		k.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
	}

}
