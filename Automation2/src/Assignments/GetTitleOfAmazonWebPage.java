package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleOfAmazonWebPage {
	
	public static void main(String[] args) {
		
		//to launch web browser
		WebDriver s = new ChromeDriver();
		
		//to maximize the web browser
		s.manage().window().maximize();
		
		//to open the we application in web browser
		s.get("https://www.amazon.com/");
		
		//to fetch the title of web page
		String Actual_Title = s.getTitle();
		
		if (Actual_Title.equals("Free shipping on millions of items. Get the best of Shopping and Entertainment with Prime. Enjoy low prices and great deals on the largest selection of everyday essentials and other products, including fashion, home, beauty, electronics, Alexa Devices, sporting goods, toys, automotive, pets, baby, books, video games, musical instruments, office supplies, and more."))
				{
			System.out.println("The Test Case is Pass");
		}
		else {
			System.out.println("The Test Case is Fail");
		}	
	}
}
