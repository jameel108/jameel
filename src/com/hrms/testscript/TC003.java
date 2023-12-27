package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003 {
    @Test
	public void EditEmp() {
    	DOMConfigurator.configure("Log4j.xml");
		General  obj  =  new General();
		obj.openApplication();
		obj.Login();
		obj.EnterFrames();
		obj.selectEmployee();
		obj.ExitFrames();
		obj.Logout();
		obj.closeApplication();
}
}
