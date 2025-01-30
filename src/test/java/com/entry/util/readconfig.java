package com.entry.util;

import java.io.FileInputStream;
import java.util.Properties;

public class readconfig {
	Properties pr;
	String path = "E:\\Validation_DemoPOM_Latest (2)\\Validation_DemoPOM_Latest\\Validation_DemoPOM\\Validation_DemoPOM\\Configuration\\config.properties";
	
	
	
	public readconfig() {
		
		
		try {
			pr = new Properties();
			FileInputStream fi = new FileInputStream(path);
			pr.load(fi);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}
	
	public String url() {
		
		String value = pr.getProperty("baseurl");
		
		if(value != null)
		return value;
		else 
			throw new RuntimeException("URL not specified");
	}
	
public String getbowser() {
		
		String value = pr.getProperty("browser");
		
		if(value != null)
		return value;
		else 
			throw new RuntimeException("URL not specified");
	}
	
	/*
	 * public String getuname() {
	 * 
	 * String value = pr.getProperty("uname");
	 * 
	 * if(value != null) return value; else throw new
	 * RuntimeException("URL not specified"); }
	 * 
	 * public String getpass() {
	 * 
	 * String value = pr.getProperty("pass");
	 * 
	 * if(value != null) return value; else throw new
	 * RuntimeException("URL not specified"); }
	 * 
	 * public String getcaptcha() {
	 * 
	 * String value = pr.getProperty("captcha"); return value; }
	 */

}
