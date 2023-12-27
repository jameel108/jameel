package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
public  WebDriver  driver;
	//std  rule to provide testdata  & object related to whole application
    //  DT                VAR                   VV
public    String            url       =          "http://183.82.103.245/nareshit/login.php";
public    String            un       =			"nareshit";
public 	  String				pw	   =           "nareshit";
public    String				Lname =			"Selenium";
public 	  String				Fname =			"Jameel"; 	
public    String		   editlname =   		"selenium";
public 	  String		   editfname = 			"shabaz";
public	  String		  searchname=        "jameel";

//                           object   		/            		 elements
public 		String 		txtbox_loginname 	=	"txtUserName";
public 		String 		txtbox_password   	= "txtPassword";
public 		String 		btn_login  				= "Submit";
public 		String 		link_logout 				=	"Logout";
public		String	    frame_empinfo			=	"rightMenu";
public 		String 		add_btn					=	"//*[@value='Add']";
public 		String		txtbox_fn					=	"txtEmpFirstName";
public 		String		txtbox_ln					=	"txtEmpLastName";
public 		String		btn_save					=	"btnEdit";
public		String 		txtbox_searchby		= 	"loc_code";
public 		String		txtbox_searchfor		=	"loc_name";
public		String		btn_search				=	"//input[@value='Search']";
public 		String		select_link				=	"//*[@id=\"standardView\"]/table/tbody/tr/td[3]/a";
public 		String		btn_edit					=	"EditMain";
public		String 		checkbox_28			=	"//input[@value='0668']";
public		String		btn_delete				=	"//input[@value='Delete']";
}
