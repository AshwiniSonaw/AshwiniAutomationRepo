package DropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WokringWithGetAllSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		WebDriver driver = new ChromeDriver();
		// maximize window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open web application
		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect?sublist=1");
		// store location of multiselect dropdown
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		// create object for select class
		Select s = new Select(dropdown);
		// to select multiple option
		for (int i = 0; i < 5; i++) {
			Thread.sleep(2000);
			s.selectByIndex(i);
		}
		//store all selected option in one ref_ver
	   List<WebElement> allSelelctedOption = s.getAllSelectedOptions();
		//to print selected option use for each loop
	   for( WebElement selelctedOption : allSelelctedOption)
	   {
         System.out.println(selelctedOption.getText());
	}
	}
}
