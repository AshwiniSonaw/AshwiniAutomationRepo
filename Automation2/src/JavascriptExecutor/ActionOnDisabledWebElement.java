package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOnDisabledWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver a = new ChromeDriver();
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		a.get("https://demoapps.qspiders.com/?scenario=1");
		//click on disabled button
		a.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(2000);
		//to enter name in disabled textfield
		JavascriptExecutor js = (JavascriptExecutor)a;
		js.executeScript("document.getElementById('name').value='Baburao'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('email').value='baburao@gmail.com'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('password').value='B@123'");
		Thread.sleep(2000);
		//to click on disabled button
		WebElement disabledButton = a.findElement(By.xpath("//button[text()='Register']"));
		
		js.executeScript("arguments[0].click()", disabledButton);
		
		

	}

}
