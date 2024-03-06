package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterFormFill21 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// to launch web browser
		WebDriver obj = new ChromeDriver();

		// to maximize the window
		obj.manage().window().maximize();

		// to open web application
		obj.get("https://demowebshop.tricentis.com/");

		// to fetch web page title
		String n = obj.getTitle();
		System.out.println(n);

		// to identify the link and click on it
		obj.findElement(By.linkText("Register")).click();

		// to fetch web page title
		String k = obj.getTitle();
		System.out.println(k);
        
		//wait for 2 secs and throw InterruptedException
		Thread.sleep(2000);

		// to fill registration form
		// to select radio button
		obj.findElement(By.id("gender-female")).click();

		// to enter first name
		obj.findElement(By.name("FirstName")).sendKeys("Ashwini");

		// to enter last name
		obj.findElement(By.name("LastName")).sendKeys("Sonawane");

		// to enter email
		obj.findElement(By.name("Email")).sendKeys("ashwinisonawane2032@gmail.com");

		// to enter password
		obj.findElement(By.name("Password")).sendKeys("Ashwini@2024");

		// to enter confirm password
		obj.findElement(By.name("ConfirmPassword")).sendKeys("Ashwini@2024");

		// to click on register button
		obj.findElement(By.name("register-button")).click();

	}

}
