package MouseHandlingActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWitMoveToElement {

	public static void main(String[] args) throws InterruptedException {
		//to launch browser
		WebDriver driver = new ChromeDriver();
		//to maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		//open web application
		driver.get("https://www.flipkart.com/");
		//to store location of fashion webelement
		 WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		 //create object for action class
		 Actions act = new Actions(driver);
		 Thread.sleep(2000);
		 //use mmovetoelement method
		 act.moveToElement(fashion).perform();	
	}
}
