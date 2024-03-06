import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ShopprstackAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		d.get("https://www.shoppersstack.com/");
		//click on login button
		d.findElement(By.xpath("//button[@id='loginBtn']")).click();
		//enter emailid
		d.findElement(By.xpath("//input[@name='Email']")).sendKeys("ashwinisonawane2032@gmail.com");
		//enter password
		d.findElement(By.xpath("//input[@name='Password']")).sendKeys("Password@123");
		//clink on login
		d.findElement(By.xpath("//span[text()='Login']")).click();
		//mousehover on men section
		Actions act = new Actions(d);
		act.moveToElement(d.findElement(By.xpath("//a[@id='men']"))).perform();
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[text()='T-shirts']")).click();
		d.findElement(By.xpath("(//button[contains(text(),'add to')])[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[@name='cart']")).click();
		d.findElement(By.xpath("//button[contains(text(),'Remove from')]")).click();
		d.findElement(By.xpath("//button[text()='Yes']")).click();
		//fetch empty cart text
		WebElement emptyText = d.findElement(By.xpath("//h2[text()='Your cart is empty!']"));
		System.out.println(emptyText.getText());
		//explicit typecasting
		TakesScreenshot ts = (TakesScreenshot)d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/EmptyCart.png");
		Files.copy(src, dest);
		//click on account setting for logout
		d.findElement(By.xpath("//div[text()='A']")).click();
		d.findElement(By.xpath("//li[text()='Logout']")).click();
		
		

	}

}
