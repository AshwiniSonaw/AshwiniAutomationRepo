package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraMoveToElementMethod {

	public static void main(String[] args) {
		//to launch browser
		WebDriver k = new ChromeDriver();
		//to maximize
		k.manage().window().maximize();
		//implicit wait
		k.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//open web application
		k.get("https://www.myntra.com/");
		//to store webelement
		WebElement MEN = k.findElement(By.xpath("//a[@data-group='men']"));
		//to preform mousehovering use movetoelement for that create object of actions class
		Actions act = new Actions(k);
		//use movetoelement method
		act.moveToElement(MEN).perform();
		

	}

}
