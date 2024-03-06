package KeyboardStrokeHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) {
		// launch browser
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open web application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//login task by using keyboard only
		driver.findElement(By.name("username")).sendKeys("Admin",Keys.TAB,"admin123",Keys.TAB,Keys.ENTER);
	}
}
