package com.TimesheetManagementToolProject.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.TimesheetManagementToolProject.GenericLib.BaseTest;
import com.TimesheetManagementToolProject.GenericLib.WorkLib;
import com.TimesheetManagementToolProject.POMPages.CreateNewCustomerPage;
import com.TimesheetManagementToolProject.POMPages.CreateNewProjectPage;
import com.TimesheetManagementToolProject.POMPages.HomePage;
import com.TimesheetManagementToolProject.POMPages.LoginPage;
import com.TimesheetManagementToolProject.POMPages.OpenTasksPage;
import com.TimesheetManagementToolProject.POMPages.ProjectAndCustomerPage;

public class CreateCustomerAndProjectTest extends BaseTest {
    //IT = integration testing
	@Test (groups = "IT")
	public void createCustomerAndProject() throws EncryptedDocumentException, IOException {
	
	//to pass username and password for login operation we have to fetch it from property file
	 String username = lib.getDataFromExcelFile(excelPath, vsheetName, 1, 0);
	 String password = lib.getDataFromExcelFile(excelPath, vsheetName, 1, 1);
	 
	 //to perform login action
     LoginPage lp = new LoginPage(driver);
     lp.loginOperation(username, password);
     
     //perform action on tasks tab
     HomePage hp = new HomePage(driver);
     hp.clickOnTasksTab();
     
     //to click on project and customer tab
     OpenTasksPage otp = new OpenTasksPage(driver);
     otp.clickOnProjectsAndCustomersTab();
     
     //to create project and customer
     //use of random class - create object of worklib class
     WorkLib wl = new WorkLib();
     
     String customerName = lib.getDataFromExcelFile(excelPath, cSheetName,0,1) + wl.randomNo();
     String projectName = lib.getDataFromExcelFile(excelPath, cSheetName,1,1) + wl.randomNo(); 
     CreateNewProjectPage cnpp = new CreateNewProjectPage(driver);
     cnpp.createNewCustomerAndNewProject(driver, customerName, projectName);
     
	}

}
