package PopupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandling {

	public static void main(String[] args) {
		//launch browser
		WebDriver j = new ChromeDriver();
		//maximize
		j.manage().window().maximize();
		//implicit wait
		j.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//open web application
		j.get("https://demoapps.qspiders.com/alert?sublist=0");
		//to click on alert button
		j.findElement(By.xpath("//button[text()='Alert Box']")).click();
		//to handle alert popup
		Alert alertPopup = j.switchTo().alert();
		//to click on OK button of popup
		alertPopup.accept();
		
		}

}
