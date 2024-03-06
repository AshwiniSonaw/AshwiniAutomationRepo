package DropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithGetOptions {

	public static void main(String[] args) {
		// launch browser
		WebDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open web application
		WebElement dropdown = driver.findElement(By.id("https://demoapps.qspiders.com/dropdown?sublist=0"));
		// create object for select class
		Select s = new Select(dropdown);
		//to get all options present in dropdown and store those option in one ref_var
		List<WebElement> allOptions = s.getOptions();
		//tp print all option present in getoption method we required for loop
		for(WebElement option : allOptions)
		{
			System.out.println(option.getText());
		}

	}

}
