package com.TimesheetManagementToolProject.GenericLib;

import java.awt.Robot;
import java.util.Random;

public class WorkLib {
	
    public int randomNo() {
    	
    	Random r = new Random();
    	int no = r.nextInt(2000);
    	return no;
    }

}

