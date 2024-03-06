package Assignments;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriRegisterAutoIT {

	public static void main(String[] args) throws IOException {
		WebDriver o = new ChromeDriver();
		o.manage().window().maximize();
		o.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		o.get("https://www.naukri.com/");
		o.findElement(By.xpath("//a[text()='Register']")).click();
		o.findElement(By.xpath("//input[@id='name']")).sendKeys("Baburao");
		o.findElement(By.xpath("//input[@id='email']")).sendKeys("baburao1213@gmail.com");
		o.findElement(By.xpath("//input[@id='password']")).sendKeys("Baburao@12");
		o.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9922109668");
		o.findElement(By.xpath("(//div[@class='textWrap'])[2]")).click();
		o.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		//autoit to automate desktop application"
		Runtime.getRuntime().exec("./AutoIT/NaukriFileUpload.exe");
		

	}

}
