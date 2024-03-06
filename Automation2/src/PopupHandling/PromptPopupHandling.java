package PopupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopupHandling {
	public static void main(String[] args) throws InterruptedException {
		// launch browser
		WebDriver j = new ChromeDriver();
		// maximize
		j.manage().window().maximize();
		// implicit wait
		j.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open web application
		j.get("https://demoapps.qspiders.com/alert/prompt?sublist=2");
		// to click on alert button
		j.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		Thread.sleep(2000);
		// to handle alert popup
		Alert promptPopup = j.switchTo().alert();
		Thread.sleep(2000);
		// to enter value in popup textfield
		promptPopup.sendKeys("yes");
		Thread.sleep(2000);
		// to fetch the text of popup
		System.out.println(promptPopup.getText()); 
		Thread.sleep(2000);
		//to click on OK button of popup
		promptPopup.accept();

	}

}
