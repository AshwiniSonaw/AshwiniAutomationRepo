package SynchronizationHandling;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

  public static void main(String[] args) {
	  
	  Random r = new Random();
	  
	  int no = r.nextInt(10000);
	  		
	  WebDriver g = new ChromeDriver();
	  
	  g.manage().window().maximize();
	  
	  //implicit wait
	  g.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
    	g.get("http://127.0.0.1/login.do;jsessionid=1cawicbnit5vm");
			
				g.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
				
				g.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
				g.findElement(By.xpath("//a[@id='loginButton']")).click();
			
				g.findElement(By.xpath("//a[@class='content tasks']")).click();
				
				g.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		
				g.findElement(By.xpath("//input[contains(@value,'Create New Customer')]")).click();
			
			    g.findElement(By.xpath("//input[@name='name']")).sendKeys("Dish TV" + no);
		
				g.findElement(By.xpath("//input[@type='submit']")).click();
				
			//	g.findElement(By.xpath("//a[text()='Logout']")).click();

			//	g.quit();
			}

}
