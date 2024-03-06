package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.asm.Advice.Enter;

public class YatraHotelBooking {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// handle notfication popup
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		// launch browser
		WebDriver f = new ChromeDriver(opt);
		// maximize
		f.manage().window().maximize();
		// implicit wait
		f.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open web application
		f.get("https://www.yatra.com/");
		// click on hotel tab
		f.findElement(By.id("booking_engine_hotels")).click();
		Thread.sleep(2000);
		// click on select city
		f.findElement(By.xpath("//input[@name='BE_hotel_destination']")).click();
		Thread.sleep(2000);
		// to select pune by descendant xpath
		f.findElement(By.xpath("//div[@class='viewport']/descendant::li[5]")).click();
		// f.findElement(By.xpath("(//div[@class='viewport']/descendant::li[text()='P'])[1]")).click();
		// to select check in date
		f.findElement(By.xpath("//input[@id='BE_hotel_checkin_date']")).click();
		f.findElement(By.id("21/01/2024")).click();
		// to select check-out date
		f.findElement(By.xpath("//input[@id='BE_hotel_checkout_date']")).click();
		f.findElement(By.id("24/01/2024")).click();
		// to select traveller
		f.findElement(By.xpath("//label[text()='Traveller and Hotel']")).click();
		// to increase the count of adult
		for (int i =2; i < 6; i++) {
			f.findElement(By.xpath("(//span[@class='ddSpinnerPlus'])[1]")).click();
			Thread.sleep(2000);
		}
		// to increase the count of child
		for (int i = 0; i < 3; i++) {
			f.findElement(By.xpath("(//span[@class='ddSpinnerPlus'])[2]")).click();
			Thread.sleep(2000);
		}
		//select child age
		
		//click on search hotel button
		f.findElement(By.id("BE_hotel_htsearch_btn")).click();

	}
}