package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoScrollDown {

	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//open web application
		driver.get("https://www.zomato.com/india");
		//explicit typecasting
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//to scrooldown pass +ve pixel values
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");
	}
}
