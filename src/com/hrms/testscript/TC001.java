package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 {
@Test
 public void LoginLogout() {
// Test Steps
	DOMConfigurator.configure("log4j.xml");
	General      obj    =    new      General();
	obj.openApplication();
	obj.Login();
	obj.Logout();
	obj.closeApplication();
}
}
