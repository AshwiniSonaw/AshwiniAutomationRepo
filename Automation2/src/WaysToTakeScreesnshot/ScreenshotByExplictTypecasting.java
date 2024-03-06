package WaysToTakeScreesnshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotByExplictTypecasting {

	public static void main(String[] args) throws IOException {
		//launch browser
		WebDriver g = new ChromeDriver();
		//maximize window
		g.manage().window().maximize();
		// implicit wait
		g.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		g.get("https://www.apple.com/in/iphone/");
		//expicit typecasting
		TakesScreenshot ts = (TakesScreenshot) g;
		//to use getscreenshot method
		 File src = ts.getScreenshotAs(OutputType.FILE);
		//create new file to store the screenshot for the provide path
		 File dest = new File("./Screenshot/iphone.png");
		 //copy from src to dest
		 Files.copy(src, dest);

	}

}
