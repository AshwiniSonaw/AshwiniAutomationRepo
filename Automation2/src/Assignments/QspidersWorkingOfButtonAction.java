package Assignments;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QspidersWorkingOfButtonAction {

	public static void main(String[] args) {
		// launch browser
		WebDriver g = new ChromeDriver();
		// to maximize
		g.manage().window().maximize();
		// implicit wait
		g.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open web application
		g.get("https://demoapps.qspiders.com/button/buttonRightClick?sublist=1");

		// store webelelment
		WebElement button1 = g.findElement(By.xpath("//button[@id='btn30']"));
		// create object for action class and passing control of driver
		Actions act1 = new Actions(g);
		// use contextclick method to click on button
		act1.contextClick(button1).perform();
		// to click on yes option
		g.findElement(By.xpath("//div[text()='Yes']")).click();

		// store webelelment
		WebElement button2 = g.findElement(By.xpath("//button[@id='btn31']"));
		// create object for action class and passing control of driver
		Actions act2 = new Actions(g);
		// use contextclick method to click on button
		act2.contextClick(button2).perform();
		// to click on yes option
		g.findElement(By.xpath("//div[text()='Yes']")).click();

		// store webelelment
		WebElement button3 = g.findElement(By.xpath("//button[@id='btn32']"));
		// create object for action class and passing control of driver
		Actions act3 = new Actions(g);
		// use contextclick method to click on button
		act3.contextClick(button3).perform();
		// to click on yes option
		g.findElement(By.xpath("//div[text()='4']")).click();

	}

}
