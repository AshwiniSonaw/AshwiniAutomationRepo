package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetPageSource {
	
	public static void main(String[] args) {
		
		
		  WebDriver driver = new ChromeDriver();
		
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.myntra.com/");
		  
		  String sc = driver.getPageSource();
		 
		  System.out.println(sc);
		  
		  
		  
		}

}
