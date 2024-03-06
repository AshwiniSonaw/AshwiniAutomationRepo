package com.TimesheetManagementToolProject.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewUserPage extends BaseClass{
	
	//constructor
	public CreateNewUserPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	//encapsulation
	@FindBy (name="username")
	private WebElement usernameTextfield;
	
	@FindBy (name="passwordText")
	private WebElement passwordTextfield;
	
	@FindBy (name="passwordTextRetype")
	private WebElement reTypePasswordTextfield;
	
	@FindBy (name="firstName")
	private WebElement firstNameTextfield;
	
	@FindBy (name="lastName")
	private WebElement lastNameTextfield;
	
	@FindBy (xpath = "//input[@value='   Create User   ']")
	private WebElement createUserButton;
	
	@FindBy (xpath = "//input[@value='      Cancel      ']")
	private WebElement cancelButton;

	//getter method
	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getReTypePasswordTextfield() {
		return reTypePasswordTextfield;
	}

	public WebElement getFirstNameTextfield() {
		return firstNameTextfield;
	}

	public WebElement getLastNameTextfield() {
		return lastNameTextfield;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	//method to fill details
    public void createNewUser(String CreateUserName, String UserPassword, String FirstName, String LastName)
    {
    	usernameTextfield.sendKeys(CreateUserName);
    	passwordTextfield.sendKeys(UserPassword);
    	reTypePasswordTextfield.sendKeys(UserPassword);
    	firstNameTextfield.sendKeys(FirstName);
    	lastNameTextfield.sendKeys(LastName);
    	createUserButton.click();
    }	
}