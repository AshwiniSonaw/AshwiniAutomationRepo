package com.TimesheetManagementToolProject.GenericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseTest implements IAutoConstant {
	
	public  WebDriver driver;
	public Flib lib;
	public static WebDriver sdriver;
	
	@Parameters ("browser")
    //to launch the browser
	@BeforeClass (alwaysRun = true)
	public void launchBrowser(@Optional ("Chrome") String browser) throws IOException {
		
	//object of flib class
	lib = new Flib();
	//to launch browser we need to fetch browser and url from property file
	//for parametrization we have comment this browser variable beacuse we are fetching the browser value from xml file
	//String browser = lib.getDataFromPropertyFile(propFilePath,browserKey);
	String url = lib.getDataFromPropertyFile(propFilePath,urlKey);
	Reporter.log("==Launch the " + browser + " browser==", true);
	
	//run time polymorphism
	if (browser.equals("Chrome")) {
		driver = new ChromeDriver();
	}
	else if (browser.equals("Edge")) {
		driver = new EdgeDriver();
	}
	else if (browser.equals("FireFox")) {
		driver = new FirefoxDriver();
	}
	else {
		Reporter.log("invalid browser", true);
	}
	//reinitilization of driver variable
	sdriver = driver;
	//to maximize the window
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeSeconds));
	//to launch the web application
	driver.get(url);		
	}
	
	
	//to close the browser
	@AfterClass (alwaysRun = true)
	public void closeBrowser() {
		//quit() is used to close parent as well as child window
		driver.quit();
	}

}
