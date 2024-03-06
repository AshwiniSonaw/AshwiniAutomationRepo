import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingOfTreeSet {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Ashu/Desktop/Qspider/HTML/movies%20dropdown.html");
		WebElement dropDown = driver.findElement(By.id("movies"));
		Select s = new Select(dropDown);
		List<WebElement> allD = s.getOptions();
		TreeSet<String> set = new TreeSet<String>();
		for(int i=1; i<allD.size();i++)
		{
			String allOption = allD.get(i).getText();
			
			set.add(allOption);
		}
		for (String opt : set )
		{
			System.out.println(opt);
		}		
	}
}