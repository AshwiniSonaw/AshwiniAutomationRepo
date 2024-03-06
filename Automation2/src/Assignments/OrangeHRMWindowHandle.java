package Assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		WebDriver driver = new ChromeDriver();
		// maximize window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open web application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// to scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");

		// to click on facebook link
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
		// to click on twitter link
		driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
		// to click on youtube link
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click();
		// to click on linkedin link
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();

		// to switch only on linkedin page we are going to handle window by window id
		// and for each loop
		Set<String> all_id = driver.getWindowHandles();

		for (String id : all_id) {
			driver.switchTo().window(id);

			// if
			// (driver.getCurrentUrl().equals("https://www.linkedin.com/company/orangehrm"))
			if (driver.getTitle().equals("OrangeHRM | LinkedIn")) {
				System.out.println(driver.getTitle());
				break;
			} else {
				Thread.sleep(2000);
				driver.close();
			}
		}

	}

}
