package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageOfQspiders22 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// to launch browser 
		WebDriver f = new ChromeDriver();

		// to maximize window
		f.manage().window().maximize();

		// to open web application
		f.get("https://demoapps.qspiders.com/?scenario=1");

		// wait for 2 sec and throw an exception interruptedexception
		Thread.sleep(2000);

		// to click on login link
		f.findElement(By.linkText("Login Now")).click();
		
		Thread.sleep(2000);

		// to enter email textfield
		f.findElement(By.id("email")).sendKeys("ashwin@gmail.com");

		// to enter password
		f.findElement(By.id("password")).sendKeys("Ashwin@2022");

		// to click on login button
		f.findElement(By.className("bg-orange-500")).click();

	}
}
