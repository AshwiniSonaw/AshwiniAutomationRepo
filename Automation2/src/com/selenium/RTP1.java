package com.selenium;

import java.util.Scanner;          

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RTP1 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		Integer n= sc.nextInt();
		
		if (n.equals(1))
		{
			driver = new ChromeDriver();
		}
		else if (n.equals(2))
		{
			driver = new FirefoxDriver();
		}
		else if (n.equals(3))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		
		
	}

}
