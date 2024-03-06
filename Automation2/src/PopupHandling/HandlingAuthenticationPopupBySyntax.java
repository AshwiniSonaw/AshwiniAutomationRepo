package PopupHandling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationPopupBySyntax {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		WebDriver d = new ChromeDriver();
		// maximize
		d.manage().window().maximize();
		// implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		// open web application
		d.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
	}

}
