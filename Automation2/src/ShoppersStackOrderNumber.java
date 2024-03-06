import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStackOrderNumber {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		WebDriver driver = new ChromeDriver();
		// maximize window or browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		// open web application
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		// click on login button
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(2000);
		// enter emailid
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ashwinisonawane2032@gmail.com");
		// enter password
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password@123");
		// click on login button
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		//click on search textfield
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Tshirts");
		Thread.sleep(2000);
		//click on search icon
		driver.findElement(By.id("searchBtn")).click();
		

	}

}
