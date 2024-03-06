package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireflinkLogin {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		WebDriver k = new ChromeDriver();
		// maximize
		k.manage().window().maximize();
		// implicit wait
		k.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open web application
		k.get("https://www.fireflink.com/");
		//to accept cookies
		k.findElement(By.className("accept_btn")).click();
		Thread.sleep(2000);
		// click on signin button
		k.findElement(By.xpath("//a[text()='Sign In']")).click();
		Thread.sleep(2000);
		// enter emailid in email textfield
		k.findElement(By.xpath("//input[@name='emailId']")).sendKeys("ashwinisonawane2032@gmail.com");
		Thread.sleep(2000);
		// enter password in password textfield
		k.findElement(By.xpath("//input[@type='password']")).sendKeys("Password@123");
		Thread.sleep(2000);
		//click on signin button
		k.findElement(By.xpath("//button[text()='Sign in']")).click();
	}
}