package Assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddToCartSwitchToWindow {

	public static void main(String[] args) {
		//launch browser
		WebDriver a = new ChromeDriver();
		//maximize
		a.manage().window().maximize();
		//implicit wait
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//open web application
		a.get("https://www.amazon.in/");
		//click on search textfield and search product
		a.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("toys",Keys.ENTER);
		//to scroll down
		JavascriptExecutor js = (JavascriptExecutor) a;
		js.executeScript("window.scrollBy(0,1000)");
		//to click on particular product
		a.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")).click();
		//to switch form parent to child tab
		Set<String> all_id = a.getWindowHandles();
		
		for (String id : all_id)
		{
			a.switchTo().window(id);
			if(a.getCurrentUrl().equals("https://www.amazon.in/Einstein-Box-Educational-Learning-Experiments/dp/B0855MGS99/ref=sr_1_2_sspa?crid=1T1PUK8IOXUUC&keywords=toys&qid=1706154456&sprefix=toys%2Caps%2C319&sr=8-2-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1"))
			{
				break;
			}
		}
		js.executeScript("window.scrollBy(0,500)");
		//click on add to cart button
		a.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	}
}
