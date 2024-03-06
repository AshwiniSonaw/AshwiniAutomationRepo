package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.zomato.com/");
		WebElement button = d.findElement(By.xpath("//div[@class='sc-10ugfab-7 epQgJy']"));
		JavascriptExecutor js = (JavascriptExecutor) d;
		//js.executeScript("arguments[0].scrollIntoView(true)",button);
		//true = will display webelement in middle of webpage
	//false = will display webelement at the bottom
		js.executeScript("arguments[0].scrollIntoView(false)",button);
	}

}
