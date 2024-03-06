package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FireflinkRegistration {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		WebDriver k = new ChromeDriver();
		// maximize
		k.manage().window().maximize();
		// implicit wait
		k.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open web application
		k.get("https://www.fireflink.com/");
		// to accept cookies
		k.findElement(By.className("accept_btn")).click();
		Thread.sleep(2000);
		// click on signin button
		k.findElement(By.xpath("//a[text()='Sign In']")).click();
		// click on create new account button
		k.findElement(By.xpath("//a[@class='fontPoppinsMediumMd']")).click();
		// enter name
		k.findElement(By.xpath("//input[@name='name']")).sendKeys("David Ford");
		// enter phone number
		k.findElement(By.xpath("//input[@placeholder='Enter phone number']")).sendKeys("992210456851");
		// enter email
		k.findElement(By.name("emailId")).sendKeys("davidford@gmail.com");
		// enter organization name
		k.findElement(By.name("organisationName")).sendKeys("Qspider");
		// enter password
		k.findElement(By.xpath("//input[@name='password']")).sendKeys("David@123");
		// enter confirm password
		k.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("David@123");
		// select dropdown= create object off select class
		WebElement dropdown = k.findElement(By.xpath("//label[text()='Job Title']"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Analyst");
		//we cannot automate capcha
		//click on register button
		k.findElement(By.xpath("//button[text()='Register']")).click();

	}

}
