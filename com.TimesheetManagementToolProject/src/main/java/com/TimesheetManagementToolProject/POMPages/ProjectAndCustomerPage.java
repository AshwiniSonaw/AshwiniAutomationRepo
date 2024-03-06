package com.TimesheetManagementToolProject.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectAndCustomerPage extends BaseClass {
	
	//constructor
	public ProjectAndCustomerPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	//encapsulation
	@FindBy(xpath = "//input[@value='Create New Customer']")
	private WebElement createNewCustomerButton;
	
	@FindBy (xpath = "//input[@value='Create New Project']")
	private WebElement createNewProjectButton;

	@FindBy (xpath ="//a[text()='All']")
	private WebElement allButton;
	
	@FindBy (xpath ="//input[@value='Delete Selected']")
	private WebElement deleteSelectedButton;
	
	@FindBy (xpath ="//input[@value='Delete These Customers']")
	private WebElement deleteTheseCustomerButton;

	//getter method
	public WebElement getCreateNewCustomerButton() {
		return createNewCustomerButton;
	}

	public WebElement getCreateNewProjectButton() {
		return createNewProjectButton;
	}
	
	public WebElement getAllButton() {
		return allButton;
	}
	
    public WebElement getDeleteSelectedButton() {
		return deleteSelectedButton;
	}

	public WebElement getDeleteTheseCustomerButton() {
		return deleteTheseCustomerButton;
	}

	//methods to perform click action
	public void clickOnCreateNewCustomer()
	{
		 createNewCustomerButton.click();
	}
	
	public void clickOnCreateNewProject()
	{
		createNewProjectButton.click();
	}
	
	public void selectAllButton() {
		
		allButton.click();
	}
	
	public void deleteSelectedButton() {
		
		deleteSelectedButton.click();
	}
	
	public void deleteTheseCustomerButton() {
		deleteTheseCustomerButton.click();
	}
	
}
