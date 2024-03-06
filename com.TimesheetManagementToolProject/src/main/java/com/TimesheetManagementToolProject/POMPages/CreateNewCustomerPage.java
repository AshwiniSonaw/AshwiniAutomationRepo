package com.TimesheetManagementToolProject.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomerPage extends BaseClass {

	// constructor
	public CreateNewCustomerPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	//encapsulation
	@FindBy(xpath = "//input[@name='name']")
	private WebElement customerNameTextfield;
	
	@FindBy (xpath = "//input[@name='createCustomerSubmit']")
	private WebElement createNewCustomerButton;


	//getter method
	public WebElement getCustomerNameTextfield() {
		return customerNameTextfield;
	}

	public WebElement getCreateNewCustomerButton() {
		return createNewCustomerButton;
	}
	
	///method to enter details is in the create new project
	
	
	
	

}
