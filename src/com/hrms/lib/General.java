package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
//std rule :To provede all re-usability fun:/methods related to whole application
public void openApplication() {
	driver 	=new 	ChromeDriver();
	driver.navigate().to(url);
	driver.manage().window().maximize();
	System.out.println("Application Opened");
	Reporter.log("Application Opened");
	Log.info("Application Opened");
	
}
public void Login () {
	driver.findElement(By.name(txtbox_loginname)).sendKeys(un);
	driver.findElement(By.name(txtbox_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login Completed");
	Log.info("Login Completed");
}
public void EnterFrames() {
    driver.switchTo().frame(frame_empinfo);
    System.out.println("Enter to frames");
    Log.info("Enter to Frames");
}
public void selectEmployee() {
	Select   st  = new Select(driver.findElement(By.id(txtbox_searchby)));
	st.selectByIndex(2);
	driver.findElement(By.xpath(btn_search)).click();
	driver.findElement(By.xpath(select_link)).click();
	driver.findElement(By.name(btn_edit)).click();
	driver.findElement(By.name(txtbox_fn)).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
	driver.findElement(By.name(txtbox_fn)).sendKeys(searchname);
	driver.findElement(By.name(btn_edit)).click();
	System.out.println("Edit employee details");
	Log.info("Edit employee details");
}
public void click_edit_btn() {
	driver.findElement(By.name(btn_edit)).click();
	System.out.println("click on the edit button");
	Log.info("click on the edit button");
}
public void edit_details(){
	driver.findElement(By.name(txtbox_ln)).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE);
	System.out.println("clear the details");
	Log.info("clear the details");
}
public void EnterEmployeeDetails() {
	driver.findElement(By.xpath(add_btn)).click();
	driver.findElement(By.name(txtbox_fn)).sendKeys(Fname);
	driver.findElement(By.name(txtbox_ln)).sendKeys(Lname);
	driver.findElement(By.id(btn_save)).click();
	System.out.println("Enter Employee First Name");
	System.out.println("Enter Last Name");
	System.out.println("Save the info");
	System.out.println("Add Employee");
	Log.info("Add Employee");
}
public void ExitFrames() {
	driver.switchTo().defaultContent();
	System.out.println("Exit from frames");
	Log.info("Exit from frames");
}
public void Logout() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout Completed");
	Log.info("Logout Completed");
}
public void closeApplication() {
	driver.quit();
	System.out.println("Application Closed");
	Log.info("Application Closed");
	
}
public void  delete_emp() throws Exception {
	WebElement   checkbox  = driver.findElement(By.xpath(checkbox_28));
	checkbox.click();
	Thread.sleep(2000);
	System.out.println("Delete Employee Completed");
	Log.info("Delete Employee Completed");
}
}
