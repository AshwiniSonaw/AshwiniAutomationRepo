package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoFetchTitleAndCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launch browser
		WebDriver driver = new ChromeDriver();

		// maximize window
		driver.manage().window().maximize();

		// to open web app
		driver.get("https://www.zomato.com/");

		// to fetch title of web page
		System.out.println(driver.getTitle());

		// to fetch current url of web page
		System.out.println(driver.getCurrentUrl());
		
		//to close window
		driver.close();

	}

}
