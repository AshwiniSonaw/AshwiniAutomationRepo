package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class NetflixWebElementSS {

	public static void main(String[] args) throws IOException {
		//launch browser- screenshot by 4th way upcasting into remotewebdriver
         WebDriver r = new ChromeDriver();
		//maximize
		r.manage().window().maximize();
		//implicit wait
		r.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//open web application
		r.get("https://www.netflix.com/in/");
		//to click on signin
		r.findElement(By.xpath("//a[@id='signIn']")).click();
		//take screenshot of webelement of sigin button
		WebElement button = r.findElement(By.xpath("//button[@type='submit']"));
		File src = button.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/netflixSignInButton.png");
		Files.copy(src, dest);
	}
}