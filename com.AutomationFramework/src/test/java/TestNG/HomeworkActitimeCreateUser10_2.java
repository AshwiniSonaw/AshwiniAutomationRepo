package TestNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class HomeworkActitimeCreateUser10_2 {

	WebDriver driver;

	@Test(priority = 1)
	public void OpenApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=6jjdik50yd69");
	}

	@Test(priority = 2)
	public void loginOperation() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Reporter.log("login successfull",true);
	}

	@Test(dependsOnMethods = "loginOperation")
	public void CreateUser() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Iron");
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("Iron1");
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("Iron1");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ironman");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Marvel");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
		Reporter.log("User Created successfull",true);
	}

	@Test(priority = 3)
	public void logoutOperation() {
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Reporter.log("Logout successfull",true);
	}

}
