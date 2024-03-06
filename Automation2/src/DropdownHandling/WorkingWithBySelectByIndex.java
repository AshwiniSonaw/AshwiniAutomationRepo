package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithBySelectByIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to launch browser
		WebDriver driver = new ChromeDriver();
		//to maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//to open web applicaiton
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		//identify dropdown
		WebElement dropdown = driver.findElement(By.id("select3"));
		//create object for select class
		Select s = new Select(dropdown);
		//use selectByIndex(int index) method
		s.selectByIndex(7);

	}

}
