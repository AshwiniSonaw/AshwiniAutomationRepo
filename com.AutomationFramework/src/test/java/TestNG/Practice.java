package TestNG;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {
	WebDriver a;
    @Test
	public void login() {
		a = new ChromeDriver();
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		a.get("http://127.0.0.1/login.do;jsessionid=1wjdqavyrxn8b");
		a.findElement(By.name("username")).sendKeys("admin");
		a.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	}
    
    @Test
    public void logout() {
	
		a.findElement(By.xpath("//a[text()='Logout']")).click();
	}
  
}
