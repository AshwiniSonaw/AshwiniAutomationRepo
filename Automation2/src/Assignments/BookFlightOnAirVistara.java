package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookFlightOnAirVistara {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//to launch web browser
	WebDriver e = new ChromeDriver();
	//to maximize window
	e.manage().window().maximize();
	//to open web application
	e.get("https://www.airvistara.com/in/en");
	//to click on accept all cookies
	e.findElement(By.id("acceptAllBtn")).click();
	//to select origin
	e.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("PNQ");
	//to select destination
	e.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("BOM");
	//to select depart travel date
	e.findElement(By.id("departCalendar")).click();
	Thread.sleep(2000);
	e.findElement(By.xpath("//a[@data-date='3']")).click();
	Thread.sleep(2000);
	e.findElement(By.xpath("//a[@data-date='5']")).click();
    e.findElement(By.xpath("//button[@id='book-flight-widget']")).click();
    
	}

}
