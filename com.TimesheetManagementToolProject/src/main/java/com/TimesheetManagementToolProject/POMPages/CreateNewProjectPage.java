package com.TimesheetManagementToolProject.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class CreateNewProjectPage extends BaseClass {

	// consructor
	public CreateNewProjectPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	//encapsulation
	@FindBy (xpath = "//select[@name='customerId']")
	private WebElement customerDropdown;
	
	@FindBy (xpath = "//input[@name='name']")
	private WebElement projectNameTextField;
	
	@FindBy (xpath = "//input[@value='Create Project']")
	private WebElement createProjectButton;
	
	@FindBy (xpath = "//input[@value='    Cancel    ']")
	private WebElement cancelButton;

	//getter method
	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	public WebElement getCusotmerDropdown() {
		return customerDropdown;
	}

	public WebElement getProjectNameTextField() {
		return projectNameTextField;
	}

	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}
	
	//method to fill details
	public void createNewCustomerAndNewProject(WebDriver driver, String customerName, String projectName)
	{    //method for create customer and project in single method
		//first we create customer then go for project 
		//to access customer by its visible text we will create object for createnewcustomer class 
	
		ProjectAndCustomerPage pacp = new ProjectAndCustomerPage(driver);
		pacp.clickOnCreateNewCustomer();
		//to create customer
		CreateNewCustomerPage cncp = new CreateNewCustomerPage(driver);
		cncp.getCustomerNameTextfield().sendKeys(customerName);
		cncp.getCreateNewCustomerButton().click();
		//to create project
		pacp.clickOnCreateNewProject();
		Select s = new Select(customerDropdown);
		s.selectByVisibleText(customerName);
		
		getProjectNameTextField().sendKeys(projectName);
		getCreateProjectButton().click();
		
	}
	
	
	
}

