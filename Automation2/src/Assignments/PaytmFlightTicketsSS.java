package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmFlightTicketsSS {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		WebDriver a = new ChromeDriver();
		// maximize window
		a.manage().window().maximize();
		// implicit wait
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		// open web application
		a.get("https://paytm.com/");
		// to scroll down
		WebElement scrollTill = a.findElement(By.xpath("(//div[@class='_2EGQY'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) a;
		js.executeScript("arguments[0].scrollIntoView(false)", scrollTill);
		scrollTill.click();
		// to fill details in from textfield
		a.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(2000);
		a.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		Thread.sleep(2000);
		a.findElement(By.xpath("//input[@id='text-box']")).sendKeys("PNQ");
		Thread.sleep(4000);
		a.findElement(By.xpath("//span[text()='Pune, Maharashtra']")).click();
		// to fill details in to textfield
		a.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(2000);
		a.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		Thread.sleep(2000);
		a.findElement(By.xpath("//input[@id='text-box']")).sendKeys("AYJ");
		Thread.sleep(2000);
		a.findElement(By.xpath("//span[text()='Ayodhya, Uttar Pradesh']")).click();
	}

}
	