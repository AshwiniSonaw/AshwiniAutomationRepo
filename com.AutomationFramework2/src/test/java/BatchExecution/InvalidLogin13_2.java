package BatchExecution;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class InvalidLogin13_2 extends BaseTest {
	
	@Test
	public void invalidLogin() throws EncryptedDocumentException, IOException {

		Flib lib = new Flib();
		int row_count = lib.getRowCount("./src/test/resources/TestData.xlsx", "Invalid");
		System.out.println(row_count);
		for (int i = 1; i <= row_count; i++) {
			String username = lib.getDataFromExcelSheet("./src/test/resources/TestData.xlsx", "Invalid", i, 0);
			String password = lib.getDataFromExcelSheet("./src/test/resources/TestData.xlsx", "Invalid", i, 1);
			WebElement username1 = driver.findElement(By.name("username"));
			username1.sendKeys(username);
			WebElement password1 = driver.findElement(By.name("pwd"));
			password1.sendKeys(password);
			username1.clear();
			password1.clear();
		}
}
}