package Assertion;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Validation {

	@Test
	public void validateTitle() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(" http://127.0.0.1/login.do;jsessionid=58cu3a9jf64hr");
//	 if (driver.getTitle().equals("actiTIME - Login")) {
//		 System.out.println("testscript is pass");
//	 }
//	 else {
//		 System.out.println("testscript is not pass");
//	 }
	
	//instead of that testng have one feature i.e. assertion
	//hard assert
	//Assert.assertEquals(driver.getTitle(), "actiTIME - Logi");
	
	//soft assert
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(driver.getTitle(),"actiTIME - Login");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
	driver.quit();
	sa.assertAll();
	}
}
