package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleOfWebPage {
	
	public static void main(String[] args) {
		
		//to launch web browser
		WebDriver a = new ChromeDriver();
		
		//to maximize web browser
		a.manage().window().maximize();
		
		//to open the web application in web browser
		a.get("https://www.flipkart.com/");
		
		//to fetch title of current web page-->right click-->inspect-->control+f-->
		String Actual_Title = a.getTitle(); //variable of string data type because title is in string format
		//System.out.println(Actual_Title);
	
		if (Actual_Title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			System.out.println("The test case is pass");
		}
		else {
			System.out.println("The test case is fail");
		}
	}

}
