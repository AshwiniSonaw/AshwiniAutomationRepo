package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// to launch browser
		WebDriver u = new ChromeDriver();

		// to maximize window
		u.manage().window().maximize();

		// to open the web application
		u.get("https://www.flipkart.com/");

		// to close the login window using xpath by visible text
		u.findElement(By.xpath("//span[text()='✕']")).click();
		
		//to identify partial visible text of search textfield using contains function
		u.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("iphone",Keys.ENTER);

	}

}
