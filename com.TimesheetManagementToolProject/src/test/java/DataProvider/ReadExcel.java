package DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	
	public static Object[][] getMultipleDataFromExcelSheet(String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		 Sheet sheet = book.getSheet(sheetName);
		// to get number of rows 
		int row = sheet.getPhysicalNumberOfRows(); //7
		//to get number of columns
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();  //2
		
		//double array 
		Object[][] testData = new Object[row-1] [cell];
		//row-1 = 7-1 = 6
		
		for (int r =1; r<row; r++) {  //for row
			
			for(int c=0; c<cell; c++) {   //for column
				
				testData [r-1] [c] = sheet.getRow(r).getCell(c).getStringCellValue();
			}
			
		}
		
		return testData;	
	}
}