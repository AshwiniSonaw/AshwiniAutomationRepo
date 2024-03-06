package com.TimesheetManagementToolProject.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTasksPage extends BaseClass {

	// constructor
	public OpenTasksPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	// encapsulation
	@FindBy(xpath = "//a[text()='Projects & Customers']")
	private WebElement projectsAndCustomersTab;


	public WebElement getProjectsAndCustomersTab() {
		return projectsAndCustomersTab;
	}

	// method to perform click action on project and cusotmer tab
	public void clickOnProjectsAndCustomersTab() {
		projectsAndCustomersTab.click();
	}


}
