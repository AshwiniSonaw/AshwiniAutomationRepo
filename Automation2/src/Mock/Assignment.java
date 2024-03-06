package Mock;

import java.time.Duration;
import java.util.Set;

import javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop", Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		 Set<String> windowId = driver.getWindowHandles();
		 
		 for (String id:windowId)
		 {
			 driver.switchTo().window(id);
			 if(driver.getTitle().contains("HP Intel Core i5 12th Gen 1235U - (8 GB/512 GB SSD/Windows 11 Home) 15s-fq5202TU Thin and Light Laptop Rs.65387  Price in India - Buy HP Intel Core i5 12th Gen 1235U"))
			 {
				 driver.close();
			 }
		 }
	}
}
