package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActiTimeCreateCustomer {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver g = new ChromeDriver();
		g.manage().window().maximize();
		g.get("http://127.0.0.1/login.do;jsessionid=1cawicbnit5vm");
		Thread.sleep(2000);
		g.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		g.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		g.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		g.findElement(By.xpath("//img[@class='sizer']")).click();
		Thread.sleep(2000);
		g.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		Thread.sleep(2000);
		g.findElement(By.xpath("//input[contains(@value,'Create New Customer')]")).click();
		Thread.sleep(2000);
	    g.findElement(By.xpath("//input[@name='name']")).sendKeys("Dish TV");
		Thread.sleep(2000);
		g.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		g.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		g.quit();
	}

}