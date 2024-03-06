package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ActiTimeDeleteUserSS {

	public static void main(String[] args) throws InterruptedException, IOException {
		// launch browser
		WebDriver x = new ChromeDriver();
		// maximize
		x.manage().window().maximize();
		// implicit wait
		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		// open web application
		x.get("http://127.0.0.1/login.do;jsessionid=1rgidp2msqdd6");
		// enter username password and click on login button
		x.findElement(By.name("username")).sendKeys("admin");
		x.findElement(By.name("pwd")).sendKeys("manager");
		x.findElement(By.id("loginButton")).click();
		// click on user tab
		Thread.sleep(2000);
		x.findElement(By.xpath("//a[@class='content users']")).click();
		// click on create user button
		x.findElement(By.xpath("//input[@value='Create New User']")).click();
		// enter username
		x.findElement(By.xpath("//input[@name='username']")).sendKeys("T11");
		// enter password and confirm password
		x.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("T11@123");
		x.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("T11@123");
		// enter fist and last name
		x.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Akshay");
		x.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");
		// click on create user button
		x.findElement(By.xpath("//input[@value='   Create User   ']")).click();
		Thread.sleep(2000);
		// click on username in usesrlist
		x.findElement(By.xpath("//a[text()='Kumar, Akshay (T11)']")).click();
		// click on delete user
		Thread.sleep(2000);
		x.findElement(By.xpath("//input[@value='Delete This User']")).click();
		// to take screenshot of popup do explicit typecasting
		// TakesScreenshot ts = (TakesScreenshot)x;
		// File src = ts.getScreenshotAs(OutputType.FILE);
		// File dest = new File("./Screenshot/DeleteUserSS.png");
		// Files.copy(src, dest);

		// to handle the popup
		Alert alt = x.switchTo().alert();
		// to click on OK button of popup
		alt.accept();

		// to take screenshot of popup do explicit typecasting
		TakesScreenshot ts = (TakesScreenshot)x;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/DeleteUserSS.png");
		Files.copy(src, dest);
	}
}