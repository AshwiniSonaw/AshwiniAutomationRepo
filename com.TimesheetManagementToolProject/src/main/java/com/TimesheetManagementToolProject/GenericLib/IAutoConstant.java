package com.TimesheetManagementToolProject.GenericLib;

public interface IAutoConstant {

	String propFilePath = "./src/test/resources/CommonData.properties";

	String browserKey = "Browser";

	String urlKey = "Url";
	
	String usernameKey = "Username";
	
	String passwordKey = "Password";

	int timeSeconds = 30;

	String excelPath = "./src/test/resources/TestData.xlsx";
	// for valid login
	String vsheetName = "VALID LOGIN";

	// for invalid login
	String invSheetName = "INVALID LOGIN";

	// for customer sheet
	String cSheetName = "CUSTOMER DATA";

	// for user sheet
	String uSheetName = "USER DATA";

}
