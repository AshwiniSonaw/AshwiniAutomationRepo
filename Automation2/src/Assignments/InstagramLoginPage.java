package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// to launch the browser
		WebDriver g = new ChromeDriver();

		// to maximize window
		g.manage().window().maximize();

		// to open the web application
		g.get("https://www.instagram.com/");

		// to fetch title
		String a = g.getTitle();
		System.out.println(a);
		
		//wait for page to load for 3 sec and we need to throw an exception of InterruptEception in main method
		Thread.sleep(2000);

		// to identify Phone Number, Email and Username textfield and enter the username
		g.findElement(By.name("username")).sendKeys("ashu17so");

		// to identify Password textfield and enter the password
		g.findElement(By.name("password")).sendKeys("Ashwini@2023");
		
		//to click on login button
		g.findElement(By.className("_acap")).click();
		
		//to fetch title of login page
		String f = g.getTitle();
		System.out.println(f);
		
		Thread.sleep(5000);
		
		//to close the parent application window
		g.close();

	}

}
