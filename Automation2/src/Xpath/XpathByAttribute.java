package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// to launch browser
		WebDriver u = new ChromeDriver();

		// to maximize window
		u.manage().window().maximize();

		// to open the web application
		u.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// wait 2 sec
		Thread.sleep(2000);
		// identify username textfield by using xpath by attribute
		u.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		// identify password textfield by using xpath by attribute
		u.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");

		// identify login button by using xpath by attribute
		u.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
