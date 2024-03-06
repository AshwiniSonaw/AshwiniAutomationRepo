package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLoginPage21 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// to launch web browser
		WebDriver obj = new ChromeDriver();

		// to maximize the window
		obj.manage().window().maximize();

		// to open web application
		obj.get("https://demowebshop.tricentis.com/");

		// to fetch web page title
		String a = obj.getTitle();
		System.out.println(a);

		// to click on login link
		obj.findElement(By.linkText("Log in")).click();

		// to fetch web page title
		String n = obj.getTitle();
		System.out.println(n);

		// to enter email
		obj.findElement(By.name("Email")).sendKeys("ashwinisonawane2032@gmail.com");

		// to enter password
		obj.findElement(By.name("Password")).sendKeys("Ashwini@2024");

		Thread.sleep(2000);

		// to click on Login button
		obj.findElement(By.className("login-button")).click();

		// to click on logout link
		obj.findElement(By.linkText("Log out")).click();
	}

}
