package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDeselectByIndex {

	public static void main(String[] args) throws InterruptedException {
		// to launch the browser
		WebDriver driver = new ChromeDriver();
		// to maximize the window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// to open web application
		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect?sublist=1");
		// identify multiselect dropdown and store the location in one variable
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		// create object for select class
		Select s = new Select(dropdown);
		// to select multiple option in dropdown
		for (int i = 0; i < 3; i++) {
			Thread.sleep(2000);
			s.selectByIndex(i);
		}
		// to deselect multiple option in dropdown
		for (int i = 0; i < 3; i++) {
			Thread.sleep(2000);
			s.deselectByIndex(i);
		}

	}

}
