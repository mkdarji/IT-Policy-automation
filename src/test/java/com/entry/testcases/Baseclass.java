package com.entry.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.entry.util.readconfig;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
readconfig read = new readconfig();
	
	String url = read.url();
	String bro = read.getbowser();
//	String u = read.getuname();
//	String p = read.getpass();
//	String c = read.getcaptcha();
	
	public static WebDriver driver;
	public static Logger logg;
	
	@BeforeClass
	public void setup() {
		
		String browser = "CHROME";
	
		WebDriverManager.chromedriver().setup();
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--remote-allow-origins=*");
		 * options.addArguments("--no-proxy-server"); WebDriver driver = new
		 * ChromeDriver(options);
		 */
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		
		logg = LogManager.getLogger("IT-Policy-automation");
	}
	
	
	
	
	
	@AfterClass
	public void tear() {
		//driver.close();
		driver.quit();
	} 
	
	public String capture(WebDriver driver, String testname) throws IOException {
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testname + ".png");
		FileUtils.copyFile(src, dest);
		return System.getProperty("user.dir") + "//Screenshots//" + testname + ".png";
		
	}


}
