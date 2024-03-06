package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithIsMultiple {

	public static void main(String[] args) {
		//launch browser
		WebDriver driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//open web application
		WebElement dropdown = driver.findElement(By.id("https://demoapps.qspiders.com/dropdown?sublist=0"));
		//create object for select class
		Select s = new Select(dropdown);
		//verify weather the dropdown is multiple or single, if multiple then o/p is true and for single dropdown o/p is false
		 boolean value = s.isMultiple();
		 System.out.println(value);
	}

}
