package com.TimesheetManagementToolProject.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateUserPage extends BaseClass {
	
	//constructor
	public CreateUserPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	//encapsulation
	@FindBy (xpath = "//input[@value='Create New User']")
	private WebElement createNewUserButton;

	//getter method
	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}
	
	// method to perforfm click action
	public void createNewUser()
	{
		createNewUserButton.click();
	}
	

}
