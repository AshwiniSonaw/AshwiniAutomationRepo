package com.TimesheetManagementToolProject.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass{

	//constructor
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super (driver);
	}
	
	//encapsulation
	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement tasksTab;
	
	@FindBy (xpath = "//a[@class='content users']")
	private WebElement usersTab;

	//getter methods
	public WebElement getTasksTab() {
		return tasksTab;
	}

	public WebElement getUsersTab() {
		return usersTab;
	}
	
	//method to click on tasks and users tab
	
	public void clickOnTasksTab()
	{
		tasksTab.click();
	}
	
	public void clickOnUsersTab()
	{
		usersTab.click();
	}
	
	
	
}
