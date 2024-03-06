package Robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraInspectByKeyPressAndRelease {

	public static void main(String[] args) throws AWTException {
		// launch browser
		WebDriver driver = new ChromeDriver();
		// maximize window
		driver.manage().window().maximize();
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// to open web app
		driver.get("https://www.zomato.com/");
		//create object for robot class
		Robot r = new Robot();
		//preesing keys
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_I);
		//releease keys
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_I);

	}

}
