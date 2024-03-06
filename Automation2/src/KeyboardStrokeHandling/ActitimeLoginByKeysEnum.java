package KeyboardStrokeHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginByKeysEnum {

	public static void main(String[] args) {
		//launch browser
		WebDriver driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//open web application
		driver.get("http://127.0.0.1/login.do");
		//perform login task by keyboard only no need of mouse
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);

	}

}
