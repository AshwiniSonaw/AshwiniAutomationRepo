package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class BlueStoneScreenshotByExplicitTypcasting {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		//launch browser
		WebDriver s = new ChromeDriver();
		//maximize window
		s.manage().window().maximize();
		//implicit wait
		s.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//open web application
		s.get("https://www.bluestone.com/");
		//to click on not now button
		s.findElement(By.xpath("//span[@id='denyBtn']")).click();
		//for mousehovering action- Create object of actions class
		Actions act = new Actions(s);
		 //to mouserhovering on coins as web element use movetoelement method
		Thread.sleep(2000);
		act.moveToElement(s.findElement(By.xpath("//a[@title='Coins']"))).perform();
		//to perfrom click action on coins by design
		s.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		//to press down key 3 time use for loop create object of robot class
		Robot r = new Robot();
		for (int i=0;i<3;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		//explicit typecasting
		TakesScreenshot ts = (TakesScreenshot) s;
		//to take a screenshot use getscreenshotas method
		File src = ts.getScreenshotAs(OutputType.FILE);
        //to store the screenshot we have to create new file and provide path 
		File dest = new File("./Screenshot/coins.png");
		//to copy the screenshot from src (source) to dest (destination)
		Files.copy(src, dest);
	}
}
