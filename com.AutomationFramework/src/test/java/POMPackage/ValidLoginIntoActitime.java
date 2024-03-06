package POMPackage;

import java.io.IOException;

public class ValidLoginIntoActitime extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		//to launch browser and actitime application
		BaseTest test = new BaseTest();
		test.setup();
		
		// to perform login action we have created object for loginpage
		LoginPage lp = new LoginPage(driver);
		
		//to fetch data from excelsheet or property file we have created object for flib class 
		Flib lib = new Flib();
		
		//calling one ethod in another method to perform task
		lp.validLoginIntoActitime(lib.getDataFromExcelSheet(EXCELPATH, VALIDSHEETNAME,1,0), 
				lib.getDataFromExcelSheet(EXCELPATH, VALIDSHEETNAME,1,1));
		
		//to quit the browser and applIcation
		test.tearDown();
		
	}

}
