package FinalMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class FinalAssignment {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.zomato.com/");
		WebElement scrollTill = d.findElement(By.xpath("//p[text()='Zomaland']"));
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollTill);
		scrollTill.click();
		WebElement scrollTill1 = d.findElement(By.xpath("//p[text()='Privacy']"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrollTill1);
		scrollTill1.click();

	}

}
