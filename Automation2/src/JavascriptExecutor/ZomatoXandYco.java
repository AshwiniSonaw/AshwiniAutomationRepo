package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoXandYco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        d.get("https://www.zomato.com/");
		WebElement button = d.findElement(By.xpath("//div[@class='sc-10ugfab-7 epQgJy']"));
		//getrect method
		Rectangle g = button.getRect();
		int x = g.getX();
		int y = g.getY();
		System.out.println("x-axis:" + x); //979
		System.out.println("y-axis:" + y); //1998
		//javascriptexecute method to scroll
		JavascriptExecutor js = (JavascriptExecutor) d;
		//js.executeScript("window.scrollBy(979,1998)");
		js.executeScript("window.scrollBy("+x+","+y+")");
		
	}

}
