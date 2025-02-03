package com.entry.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readconfig {
	Properties properties;
	
	String configPath = "\\src\\main\\resources\\config.properties"; // Relative path
	
	
	public readconfig() {
		
        try (InputStream inputStream = readconfig.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (inputStream == null) {
                throw new RuntimeException("config.properties file not found in resources folder!");
            }
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load config.properties file.");
        }
        System.out.println("Available resources: " + readconfig.class.getClassLoader().getResource(""));

				
}
	
	public String url() {
		
		String value = properties.getProperty("baseurl");
		
		if(value != null)
		return value;
		else 
			throw new RuntimeException("URL not specified");
	}
	
public String getbowser() {
		
		String value = properties.getProperty("browser");
		
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
