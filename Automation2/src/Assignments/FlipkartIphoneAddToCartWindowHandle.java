package Assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphoneAddToCartWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver =new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//open web application
		driver.get("https://www.flipkart.com/");
		//click on search textfield
		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.click();
		search.sendKeys("iphone", Keys.ENTER);
		//click on first iphone
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		//to get window id of parent and child window
		Set<String> all_id = driver.getWindowHandles();
		
		//for each loop to get windowid one by one but by default the focus will be on parent window
		
		for(String id : all_id) {
			
			driver.switchTo().window(id);
			
			//if condition to get focus on child window
			if (driver.getTitle().equals("Apple iPhone 15 (Blue, 128 GB)"))
			{
				break;
			}
		}
		
		//to click on add to cart button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
	}
}