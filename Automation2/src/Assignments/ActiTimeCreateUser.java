package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActiTimeCreateUser {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		WebDriver k = new ChromeDriver();
		// maximize
		k.manage().window().maximize();
		// implicit wait
		k.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open web application
		k.get("http://127.0.0.1/login.do;jsessionid=8ht75sct9isn2");
		// enter username
		k.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		// enter password
		k.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		k.findElement(By.id("loginButton")).click();
		// click on user icon
		k.findElement(By.xpath("//a[@class='content users']")).click();
		// click on create u=new user
		k.findElement(By.xpath("//input[@value='Create New User']")).click();
		// enter Username as manager
		k.findElement(By.name("username")).sendKeys("Neel");
		// enter password as manager
		k.findElement(By.name("passwordText")).sendKeys("M@1");
		// re-enter password as manager
		k.findElement(By.name("passwordTextRetype")).sendKeys("M@1");
		// access dropdown
		WebElement dropdown1 = k.findElement(By.name("active"));
		// create object for select
		Select s1 = new Select(dropdown1);
		// use selectbyvalue method
		s1.selectByValue("false");
		// enter first name
		k.findElement(By.name("firstName")).sendKeys("Neel");
		// enter last name
		k.findElement(By.name("lastName")).sendKeys("Mukesh");
		// timezone dropdown
		WebElement dropdown2 = k.findElement(By.xpath("//select[@name='timeZoneId']"));
		// create object for select
		Select s2 = new Select(dropdown2);
		// use selelctbyvisibletext method
		s2.selectByVisibleText("(GMT-10:00) Hawaii");
		// click on checkbox
		k.findElement(By.id("overtimeTracking_Enable")).click();
		// radio button
		k.findElement(By.id("overtimeTrackingLevel_Trusted")).click();
		//click on calender
		k.findElement(By.id("releaseDateId")).sendKeys("Sep 09, 2025");
		//k.findElement(By.xpath("(//em[@unselectable='on'])[1]")).click();
		//k.findElement(By.xpath("//a[text()='2025']")).click();
		//k.findElement(By.xpath("//a[text()='Sep']")).click();
		//k.findElement(By.xpath("//button[@id='ext-gen124']")).click();
		//k.findElement(By.xpath("//span[text()='9']")).click();
		//click on create user button
		k.findElement(By.xpath("//input[@value='   Create User   ']")).click();
		//to print username
		WebElement ManagerName = k.findElement(By.xpath("//a[contains(text(),'Mukesh')]"));
		 String name = ManagerName.getText();
		 System.out.println(name);
		
		
	}

}
