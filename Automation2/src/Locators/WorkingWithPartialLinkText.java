package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to launch the browser
		WebDriver d = new ChromeDriver();

		// to maximize window
		d.manage().window().maximize();

		// to open web application
		d.get("https://demowebshop.tricentis.com/");

		// to click use click method
		d.findElement(By.partialLinkText("Register")).click();

	}

}
