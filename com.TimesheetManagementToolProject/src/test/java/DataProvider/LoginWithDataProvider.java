package DataProvider;

import java.awt.RenderingHints.Key;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithDataProvider {

	@DataProvider (name = "TestData")
	public Object[][] loginTestData() throws EncryptedDocumentException, IOException {
		
	 return	ReadExcel.getMultipleDataFromExcelSheet("INVALID LOGIN");
	}
	
	@Test (dataProvider = "TestData")
	public void login (String username, String password) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://127.0.0.1/login.do;jsessionid=58cu3a9jf64hr");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password, Keys.ENTER);
		driver.quit();	
	}
	 
	//for multiple testdata
	//data provider consider each scenario or testdata as one separate testscript
	//whereas for loop consider each testdata as a one testscript

	
}
