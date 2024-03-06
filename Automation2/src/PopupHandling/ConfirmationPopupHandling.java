package PopupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopupHandling {

	public static void main(String[] args) {
		// launch browser
		WebDriver j = new ChromeDriver();
		// maximize
		j.manage().window().maximize();
		// implicit wait
		j.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open web application
		j.get("https://demoapps.qspiders.com/alert/confirm?sublist=1");
		// to click on alert button
		j.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		// to handle alert popup
		Alert confirmPopup = j.switchTo().alert();
		// to click on OK button of popup
		//confirmPopup.accept();
		//to click on Cancel button of popup
	    confirmPopup.dismiss();

	}

}
