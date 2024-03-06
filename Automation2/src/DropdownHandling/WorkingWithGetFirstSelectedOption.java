package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithGetFirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//open web application
		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect?sublist=1");
		//store location of multiselect dropdown
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		//create object for select class
		Select s = new Select(dropdown);
		//to select multiple option
		for ( int i=0; i<5 ; i++) {
			Thread.sleep(2000);
			s.selectByIndex(i);   }
		//getfirstselectedoption method will return first selected option only
		//System.out.println(s.getFirstSelectedOption()); //throw address of first selected option
		System.out.println(s.getFirstSelectedOption().getText()); //throw option or value present in first selected option
	}
}