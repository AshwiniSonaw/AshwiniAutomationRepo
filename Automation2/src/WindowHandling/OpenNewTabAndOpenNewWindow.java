package WindowHandling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabAndOpenNewWindow {

	public static void main(String[] args) {
		//launch browser
		WebDriver h = new ChromeDriver();
		//maximize
		h.manage().window().maximize();
		//implicit wait
		h.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//open web application
		h.get("https://www.selenium.dev/");
		//to open new tab
		h.switchTo().newWindow(WindowType.TAB);
		//to open new window
		h.switchTo().newWindow(WindowType.WINDOW);

	}

}
