package PopupHandling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.grid.jmx.ManagedAttribute;

public class HandlingNotificationPopup {

	public static void main(String[] args) {
		//first handle notification popup then go for the launching, 
		//maximize browser and implicit wait then open web application
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		//launch browser= 
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hp.com/");
		

	}

}
