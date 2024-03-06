package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOfSubmitButtonQspiders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//to launch web browser
		WebDriver driver = new ChromeDriver();
		//to maximize window
		driver.manage().window().maximize();
		//to launch web application
		driver.get("https://demoapps.qspiders.com/formValidation?sublist=0");
		//to fill the details
		driver.findElement(By.xpath("//input[@placeholder='Type something']")).sendKeys("Movies");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='minLength']")).sendKeys("new year");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ram@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='maxLength']")).sendKeys("good");
		Thread.sleep(2000);
		driver.findElement(By.className("confirm-password")).sendKeys("Ram@123");
		Thread.sleep(2000);
	    driver.findElement(By.name("rangeLength")).sendKeys("Evening");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ram12345@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='minValue']")).sendKeys("115213");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='URL']")).sendKeys("https://www.ram.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='maxValue']")).sendKeys("3");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='digits']")).sendKeys("123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='rangeValue']")).sendKeys("050");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='number']")).sendKeys("4");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='alphanum']")).sendKeys("@A1");
	    Thread.sleep(2000);
	    //xpath of submit button and stored in variable and return type of findelement method is webelement
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);
        //use of submit method with the help of variable
        submitButton.submit();
        System.out.println("Script run successfully");        
	}

}
