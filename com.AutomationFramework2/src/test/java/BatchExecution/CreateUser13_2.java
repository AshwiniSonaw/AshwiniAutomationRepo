package BatchExecution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateUser13_2 extends BaseTest{
	
	@Test
	public void CreateUser() {

		driver.findElement(By.xpath("//a[@class='content users']")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("TestE");
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("T1");
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("T1");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Captain");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("America");
		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
	}


}
