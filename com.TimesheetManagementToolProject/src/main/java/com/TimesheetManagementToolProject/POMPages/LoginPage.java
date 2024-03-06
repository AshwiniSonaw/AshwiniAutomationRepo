package com.TimesheetManagementToolProject.POMPages;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.implementation.bind.annotation.Super;
import net.bytebuddy.implementation.bind.annotation.SuperCall;

public class LoginPage extends BaseClass{
	
	//for reinitialization of webelement
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	//annotation @FindBy to perform encapsulation= private webelement like username, password and loginbutton
	@FindBy(name ="userna")
	private WebElement usernameTextfield;
	
	@FindBy (name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy (id="loginButton")
	private WebElement loginButton;

	//getter method to access private webelement  like username, password and loginbutton
	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//methods to perform sendkeys operation, click action
	public void loginOperation (String username, String password)
	{
		usernameTextfield.sendKeys(username);
		passwordTextfield.sendKeys(password);
		loginButton.click();
	}
	
	public void invalidLoginOperation (String username1, String password1)
	{
		usernameTextfield.sendKeys(username1);
		passwordTextfield.sendKeys(password1);
		loginButton.click();
		usernameTextfield.clear();
		passwordTextfield.clear();
	}
	
	
	
	

}
