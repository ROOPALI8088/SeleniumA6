package com.crm.javautility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaUtility {
	public static String loginData(String key) throws IOException 
	{
		Properties prop=new Properties();
		//FileInputStream fis=new FileInputStream("C:\Users\Capricon\eclipse-workspace\Com.crm.AdvanceSeleniumA6\ConfigureFile\LoginFunction.properties")
		FileInputStream fis=new FileInputStream("C:\\Users\\Capricon\\eclipse-workspace\\com.crm.vtiger\\ConfigureFile\\VtigerLogin");
		prop.load(fis);
	    String data=prop.getProperty(key);
		return data;
		
	}


}


