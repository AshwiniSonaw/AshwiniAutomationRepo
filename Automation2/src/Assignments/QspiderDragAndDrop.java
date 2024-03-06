package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QspiderDragAndDrop {

	public static void main(String[] args) {
		// launch browser
		WebDriver a = new ChromeDriver();
		// maximize
		a.manage().window().maximize();
		// implicit wait
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// open web application
		a.get("https://demoapps.qspiders.com/?scenario=1");
		// click on mouse action
		a.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		// click on drag and drop
		a.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		// click on drag position
		a.findElement(By.xpath("//a[text()='Drag Position']")).click();
		// drag 1st webelement
		WebElement drag1 = a.findElement(By.xpath("//div[text()='Mobile Charger']"));
		// drag 2nd webelement
		WebElement drag2 = a.findElement(By.xpath("//div[text()='Laptop Charger']"));
		// drag 3rd webelement
		WebElement drag3 = a.findElement(By.xpath("//div[text()='Mobile Cover']"));
		// drag 4th webelement
		WebElement drag4 = a.findElement(By.xpath("//div[text()='Laptop Cover']"));
		// drop 1st webelement
		WebElement drop1 = a.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		// drop 2nd webelement
		WebElement drop2 = a.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		// create object for actions class
		Actions act = new Actions(a);
		// use drag and drop method 1st webelement
		act.dragAndDrop(drag1, drop1).perform();
		// use drag and drop method 2nd webelement
		act.dragAndDrop(drag2, drop2).perform();
		// use drag and drop method 3rd webelement
		act.dragAndDrop(drag3, drop1).perform();
		// use drag and drop method 4th webelement
		act.dragAndDrop(drag4, drop2).perform();
		//close the browser
		a.quit();
	}
}
