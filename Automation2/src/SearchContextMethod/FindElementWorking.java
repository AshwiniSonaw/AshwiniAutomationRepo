package SearchContextMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementWorking {
	
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
		
		//to search any product
		u.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone",Keys.ENTER);
       		
        //to click on any product
		u.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		
}
}
