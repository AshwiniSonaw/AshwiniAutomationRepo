package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithGetWrappedElement {

	public static void main(String[] args) {
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
		//to store all option in one ref_var
		WebElement options = s.getWrappedElement();
		//print all option
		//System.out.println(options); //throw address
		System.out.println(options.getText()); //throw values

}

}
