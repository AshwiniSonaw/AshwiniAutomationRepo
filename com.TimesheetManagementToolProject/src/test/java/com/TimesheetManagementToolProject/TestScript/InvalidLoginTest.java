package com.TimesheetManagementToolProject.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.TimesheetManagementToolProject.GenericLib.BaseTest;
import com.TimesheetManagementToolProject.GenericLib.Flib;
import com.TimesheetManagementToolProject.POMPages.LoginPage;

public class InvalidLoginTest extends BaseTest {
	//FT= functional Testing , ST= Smoke Testing
	@Test (groups = {"FT","ST"})
	public void invalidLogin() throws EncryptedDocumentException, IOException {
		Flib lib = new Flib();
		//to get last row count
		int rowCount = lib.getLastRowCount(excelPath,invSheetName);
		
		//for loop = to pass vlaue one by one
		for (int a =1; a< rowCount; a++) {
		String invalidUsername = lib.getDataFromExcelFile(excelPath, invSheetName , 1, 0);
		String invalidPassword = lib.getDataFromExcelFile(excelPath,invSheetName, 1, 1);
		//to perform on invalidlogin operation we will create object for invalidloginpom page
		LoginPage lp = new LoginPage(driver);
		lp.invalidLoginOperation(invalidUsername, invalidPassword);
	
		}
  }
	
}
