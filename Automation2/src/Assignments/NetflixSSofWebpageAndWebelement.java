package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class NetflixSSofWebpageAndWebelement {

	public static void main(String[] args) throws IOException, AWTException {
		// launch browser- screenshot by 4th way upcasting into remotewebdriver
		RemoteWebDriver r = new ChromeDriver();
		// maximize
		r.manage().window().maximize();
		// implicit wait
		r.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open web application
		r.get("https://www.netflix.com/in/");
		// to click on signin
		r.findElement(By.xpath("//a[@id='signIn']")).click();
		// keyboard handling by robot class]
		Robot o = new Robot();
		o.keyPress(KeyEvent.VK_TAB);
		o.keyRelease(KeyEvent.VK_TAB);
		o.keyPress(KeyEvent.VK_TAB);
		o.keyRelease(KeyEvent.VK_TAB);
		o.keyPress(KeyEvent.VK_SPACE);
		o.keyRelease(KeyEvent.VK_SPACE);
		o.keyPress(KeyEvent.VK_SPACE);
		o.keyRelease(KeyEvent.VK_SPACE);
		o.keyPress(KeyEvent.VK_TAB);
		o.keyRelease(KeyEvent.VK_TAB);
		o.keyPress(KeyEvent.VK_SPACE);
		o.keyRelease(KeyEvent.VK_SPACE);
		o.keyPress(KeyEvent.VK_SPACE);
		o.keyRelease(KeyEvent.VK_SPACE);
		o.keyPress(KeyEvent.VK_TAB);
		o.keyRelease(KeyEvent.VK_TAB);
		o.keyPress(KeyEvent.VK_TAB);
		o.keyRelease(KeyEvent.VK_TAB);
		o.keyPress(KeyEvent.VK_ENTER);
		o.keyRelease(KeyEvent.VK_ENTER);
		// to take screenshot by 4th way
		File src = r.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/netflixwepage1.png");
		Files.copy(src, dest);
		// take screenshot of webelement of sigin button
		WebElement button = r.findElement(By.xpath("//button[@type='submit']"));
		File src1 = button.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./Screenshot/netflixSignInButton1.png");
		Files.copy(src1, dest1);
	}
}
