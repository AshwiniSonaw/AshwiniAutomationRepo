package MouseHandlingActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WokringWithDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// to launch browser
		WebDriver driver = new ChromeDriver();
		// to maximize
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open web application
		driver.navigate().to("https://demoapps.qspiders.com/button/buttonDoubleClick?sublist=2");
		// to store location of fashion webelement
		WebElement button = driver.findElement(By.id("btn20"));
		// create object for action class
		Actions act = new Actions(driver);
        //use doubleclick method
		act.doubleClick(button).perform();
		Thread.sleep(3000);	
}}
