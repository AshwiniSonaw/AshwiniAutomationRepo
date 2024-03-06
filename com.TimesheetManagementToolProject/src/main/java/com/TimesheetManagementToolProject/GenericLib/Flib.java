package com.TimesheetManagementToolProject.GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	// to fetch the data from the property file
	public String getDataFromPropertyFile(String filepath, String key) throws IOException {
		// object of fileinputstream class
		FileInputStream fis = new FileInputStream(filepath);
		// object of property class
		Properties prop = new Properties();
		// to load all the keys inside scripts
		prop.load(fis);
		// access value with the help of key
		String data = prop.getProperty(key);
		return data;
	}

	// to fetchdata from excel file, we can use same variable in different methods
	public String getDataFromExcelFile(String filepath, String sheetname, int rowNo, int cellNo)
			throws EncryptedDocumentException, IOException {
		// object of fileinputstream class
		FileInputStream fis = new FileInputStream(filepath);
		// to convert excel file into readable mode we are using create method of
		// workbookfactory class
		Workbook book = WorkbookFactory.create(fis);
		// to fetch sheet from workbook
		Sheet sheet = book.getSheet(sheetname);
		// to fetch row from sheet
		Row row = sheet.getRow(rowNo);
		// to fetch value from cell
		Cell cell = row.getCell(cellNo);
		// to get that value in string format
		String value = cell.getStringCellValue();
		return value;
	}

	// to get row count means numbers of rows till which data is present
	public int getLastRowCount(String filepath, String sheetname) throws EncryptedDocumentException, IOException {
		// object of fileinputstream class
		FileInputStream fis = new FileInputStream(filepath);
		// to convert excel file into readable mode we are using create method of
		// workbookfactory class
		Workbook book = WorkbookFactory.create(fis);
		// to fetch sheet from workbook
		Sheet sheet = book.getSheet(sheetname);
		// to fetch last row count
		int count = sheet.getLastRowNum();
		return count;
	}
}
