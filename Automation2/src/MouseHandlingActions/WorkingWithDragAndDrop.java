package MouseHandlingActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDragAndDrop {

	public static void main(String[] args) {
		// to launch browser
		WebDriver driver = new ChromeDriver();
		// to maximize
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open web application
		driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
		
		// drag webelement
		WebElement drag = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		
		// drop webelement
		WebElement drop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		// create object for action class
		Actions act = new Actions(driver);
		// use drag and drop method
		act.dragAndDrop(drag, drop).perform();
	}

}
