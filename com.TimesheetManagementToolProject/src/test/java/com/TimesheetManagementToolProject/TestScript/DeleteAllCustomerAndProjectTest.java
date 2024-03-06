package com.TimesheetManagementToolProject.TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.TimesheetManagementToolProject.GenericLib.BaseTest;
import com.TimesheetManagementToolProject.POMPages.HomePage;
import com.TimesheetManagementToolProject.POMPages.LoginPage;
import com.TimesheetManagementToolProject.POMPages.OpenTasksPage;
import com.TimesheetManagementToolProject.POMPages.ProjectAndCustomerPage;

public class DeleteAllCustomerAndProjectTest extends BaseTest {
	
	@Test 
	public void deleteAllCustomerAndProject() throws IOException {
		
		//to perform login action
		String username = lib.getDataFromPropertyFile(propFilePath, usernameKey);
		String password = lib.getDataFromPropertyFile(propFilePath, passwordKey);
		
		LoginPage lp = new LoginPage(driver);
		lp.loginOperation(username, password);
		
		//to click on tasks tab present of home pages
		HomePage hp = new HomePage(driver);
		hp.clickOnTasksTab();
		
		//to click on select all button present on open task tab
		OpenTasksPage otp = new OpenTasksPage(driver);
		otp.clickOnProjectsAndCustomersTab();
		
		//to click on select all button
		ProjectAndCustomerPage pacp = new ProjectAndCustomerPage(driver);
		pacp.selectAllButton();
		pacp.getDeleteSelectedButton();
		pacp.getDeleteTheseCustomerButton();	
	}
}
