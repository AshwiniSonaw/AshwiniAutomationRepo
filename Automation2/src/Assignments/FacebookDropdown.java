package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// to launch browser
			WebDriver driver = new ChromeDriver();
			// to maximize
			driver.manage().window().maximize();
			// implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			// to open web applicaiton
		//	get.Thttps://www.facebook.com/
						// identify dropdown
			 //  WebElement dropdown = driver.findElement(By.id("select3"));
			// create object for select class
			//Select s = new Select (dropdown);
			
			//for (int i=0; i<dropdown.size();i++)
		//	{
			//	s.get(i).selectByindex();
		//	}
}
}
