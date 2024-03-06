package com.TimesheetManagementToolProject.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.TimesheetManagementToolProject.GenericLib.BaseTest;
import com.TimesheetManagementToolProject.GenericLib.Flib;
import com.TimesheetManagementToolProject.GenericLib.WorkLib;
import com.TimesheetManagementToolProject.POMPages.CreateNewUserPage;
import com.TimesheetManagementToolProject.POMPages.CreateUserPage;
import com.TimesheetManagementToolProject.POMPages.HomePage;
import com.TimesheetManagementToolProject.POMPages.LoginPage;
import com.TimesheetManagementToolProject.POMPages.OpenTasksPage;

public class CreateUserTest extends BaseTest {

	@Test (groups = "ST")
	public void createUser() throws EncryptedDocumentException, IOException {

		// to pass username and password for login operation we have to fetch it from
		// property file
		String username = lib.getDataFromExcelFile(excelPath, vsheetName, 1, 0);
		String password = lib.getDataFromExcelFile(excelPath, vsheetName, 1, 1);

		// to login
		LoginPage lp = new LoginPage(driver);
		lp.loginOperation(username, password);

		// from home page to click on user tab
		HomePage hp = new HomePage(driver);
		hp.clickOnUsersTab();

		/// click on create new button
		CreateUserPage cup = new CreateUserPage(driver);
		cup.createNewUser();

		// to fill details of user
		//use of random class and create object of worklib class
		WorkLib wl = new WorkLib();
		
		String userUsername = lib.getDataFromExcelFile(excelPath, uSheetName, 0, 1);
		String userPassword = lib.getDataFromExcelFile(excelPath, uSheetName, 1, 1);
		String firstName = lib.getDataFromExcelFile(excelPath, uSheetName, 2, 1);
		String lastName = lib.getDataFromExcelFile(excelPath, uSheetName, 3, 1);

		CreateNewUserPage cnup = new CreateNewUserPage(driver);
		cnup.createNewUser(userUsername + wl.randomNo(), userPassword+wl.randomNo(), 
				firstName+wl.randomNo(), lastName+wl.randomNo());

	}
}
