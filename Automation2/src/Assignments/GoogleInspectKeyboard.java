package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleInspectKeyboard {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		// launch browser
		WebDriver s = new ChromeDriver();
		// maximize
		s.manage().window().maximize();
		// implicit wait
		s.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open web application
		s.get("https://www.google.com/");
		// for right click use actions class
		Actions act = new Actions(s);
		// to perform right click use contextclick method with no argument
		act.contextClick().perform();
		// to click on inspect by using robot class
		// create object for robot class
		Robot r = new Robot();
		// pressing keys
		r.keyPress(KeyEvent.VK_DOWN);// 1
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);// 2
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);// 3
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);// 4
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);// 5
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);// 6
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);// 7
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);// 8
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);// 9
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);// 10
		//releasing keys
		r.keyRelease(KeyEvent.VK_DOWN);
		//pressing keys
		r.keyPress(KeyEvent.VK_ENTER);
		//releasing key
		r.keyRelease(KeyEvent.VK_ENTER);
	//	for (int i=0; i< r.keyPress(KeyEvent.VK_DOWN) ;i++)
		//{ 
			//if (i==10)
			//{
				//r.keyPress(KeyEvent.VK_ENTER);
			//}
		//}
	}
}
