package PopupHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopupByAutoIT {

	public static void main(String[] args) throws IOException {
		//launch browser
		WebDriver j = new ChromeDriver();
		j.manage().window().maximize();
		j.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		j.get("https://demoapps.qspiders.com/fileUpload/custom?sublist=1");
		j.findElement(By.xpath("//div[text()='Upload File']")).click();
		//merged .exe file with selenium
		Runtime.getRuntime().exec("./AutoIT/FileUpload.exe");
	}
}
