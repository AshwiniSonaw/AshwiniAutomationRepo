package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartIphoneTextAndPrice {

		public static void main(String[] args) {

			// to launch browser
			WebDriver u = new ChromeDriver();

			// to maximize window
			u.manage().window().maximize();

			// to open the web application
			u.get("https://www.flipkart.com/");

			// to close the login window using xpath by visible text
			u.findElement(By.xpath("//span[text()='✕']")).click();
			
			//to click on searchbar and search iphone and press enter
		    u.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone", Keys.ENTER);
		
		  //to get all iphone i.e. 1 of 24 means there are 24 iphone on one webpage 
		   //and store in variable and return type of findelements is list<webelement>
		    List<WebElement> AllIphone = u.findElements(By.xpath("//div[@class='_4rR01T']"));
		    
		   List<WebElement> IphonePrice = u.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		    
		    //to print the text of all the iphone
		 //   for (WebElement iphone : AllIphone)
		  //  { 
		    //   for  (WebElement price : IphonePrice)
		      // {
		    	//   System.out.println(iphone.getText() +":" + price.getText());
		//}
		//}
		   for (int a= 0; a < AllIphone.size() ; a++)
		   {
			   System.out.println(AllIphone.get(a).getText() +":" + IphonePrice.get(a).getText());
		   }
		   
	}
		}

