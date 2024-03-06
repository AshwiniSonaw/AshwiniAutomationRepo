package POMPackage;

import java.io.IOException;

public class InvalidLoginIntoActitime extends BaseTest {

	public static void main(String[] args) throws IOException {

		// to launch browser and actitime application
		BaseTest test = new BaseTest();
		test.setup();

		// to perform login action we have created object for loginpage
		LoginPage lp = new LoginPage(driver);

		// to fetch data from excelsheet or property file we have created object for
		// flib class
		Flib lib = new Flib();
	   int rowcount = lib.getRowCount(EXCELPATH, INVALIDSHEETNAME);
	   
	   for (int i=1; i<= rowcount; i++) {

		// calling one method in another method to perform task
		lp.invalidLoginIntoActitime(lib.getDataFromExcelSheet(EXCELPATH, INVALIDSHEETNAME, i, 0),
				lib.getDataFromExcelSheet(EXCELPATH, INVALIDSHEETNAME, i, 1));
	}
}
}