package com.TimesheetManagementToolProject.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.TimesheetManagementToolProject.GenericLib.BaseTest;
import com.TimesheetManagementToolProject.GenericLib.CustomListener;
import com.TimesheetManagementToolProject.GenericLib.Flib;
import com.TimesheetManagementToolProject.POMPages.LoginPage;

@Listeners (CustomListener.class)
public class ValidLoginTest extends BaseTest {
	//ST = SMOKE TESTING
	@Test (groups = "ST")
	public void login() throws EncryptedDocumentException, IOException {
		
		//to fetch data from excel file
		Flib lib = new Flib();
	    String username = lib.getDataFromExcelFile(excelPath, vsheetName, 1, 0);
		String password = lib.getDataFromExcelFile(excelPath, vsheetName, 1, 1);
	    //create object for loginpage pom class
		LoginPage lp = new LoginPage(driver);
		lp.loginOperation(username, password);
	}
}