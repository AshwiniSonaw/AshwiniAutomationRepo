package Robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws AWTException {
		// launch browser
		WebDriver driver = new ChromeDriver();
		// maximize window
		driver.manage().window().maximize();
		// implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// to open web app
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		// create object for robot class
		Robot r = new Robot();
		// pressing keys
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		// releasing keys
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		// pressing keys
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		// releasing keys
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		// pressing keys
		r.keyPress(KeyEvent.VK_TAB);
		// releasing keys
		r.keyRelease(KeyEvent.VK_TAB);
		// pressing keys
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		// releasing keys
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
}
