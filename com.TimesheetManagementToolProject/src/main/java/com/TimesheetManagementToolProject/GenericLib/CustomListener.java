package com.TimesheetManagementToolProject.GenericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class CustomListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		//this method is used to take the sccreenshot
		//when the testscript gets fails
		//now to fetch in which method or testscript the method got failed
		//we use getmethod and getmethodname present inside itestresult interface
		//these are nonstatic method we need to call these with the help of obj_ref_var i.e. result
		String methodName = result.getMethod().getMethodName();
		
		///to print at what date the ss is taken for that wh have date class0
		 String date = new Date().toString().replace(" ","_").replace(":","_");
		 
		 TakesScreenshot ts = (TakesScreenshot) BaseTest.sdriver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Screenshot/"+ date + "" + methodName + ".png");
		 try {
			 Files.copy(src, dest);
		 }
		 catch (IOException e)
		 {
			 e.printStackTrace();
		 }
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
