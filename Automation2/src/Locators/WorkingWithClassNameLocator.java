package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassNameLocator {
	public static void main(String[] args) {
		
		WebDriver obj = new ChromeDriver();
		
		obj.manage().window().maximize();
		
		obj.get("https://www.google.com/");
		
		//for active element
		obj.switchTo().activeElement().sendKeys("phoebe buffay",Keys.ENTER);
		
		//identify the guitar
		obj.findElement(By.className("lNPNe")).click();
	}


}
