package Assignments;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspidersDemoPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		//launch browser
		WebDriver d = new ChromeDriver();
		//maximize
		d.manage().window().maximize();
		//implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//open web application
		d.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		//click on login button
		//d.findElement(By.xpath("//a[text()='Login']")).click();
		//to enter username and password in popup by using robot	 class
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_A);
		//r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_A);
		//r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_D);
		//r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_D);
		//r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_M);
		//r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_M);
		//r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_I);
		//r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_I);
		//r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_N);
		//r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_A);
		//r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_A);
		//r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_D);
		//r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_D);
		//r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_M);
		//r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_M);
		//r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_I);
		//r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_I);
		//r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_N);
		//r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
	}
}	
