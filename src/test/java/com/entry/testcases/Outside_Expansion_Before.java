package com.entry.testcases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;
import com.entry.pageobject.Index1;

public class Outside_Expansion_Before extends Baseclass{
	
	

	@Test(priority = 1)
	public void sc1() throws Exception {
		
		logg.info("----------Outside Gujarat Date Before Policy Period  Unit Type(Expansion) scenario 1-------------");
		
		driver.get(url);	
		Index1 i = new Index1(driver);
		driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/add_application");
		
		i.projecttype();
		logg.info("Selected Project Type");
		i.next();
		logg.info("Click on Next");
		i.Outside_Yes();
		logg.info("select - yes");
		i.pan("SSFDE1234K");
		logg.info("PAN Entered");
		Thread.sleep(2000);
		i.incorpdate("January 2022", "10");
		logg.info("Incorporation date enter successfully");
		Thread.sleep(2000);
		i.setdate("February 2022", "2");
		logg.info("Settingup date enter successfully");
		Thread.sleep(2000);
		i.DeeptechYes();
		logg.info("Select Deeptech - Yes");
		Thread.sleep(3000);
		i.Commercial_started();
		logg.info("Commercial Operation Started - Yes");
		Thread.sleep(3000);
		i.comdate("February 2022", "3");
		logg.info("Commercial date enter successfully");
		Thread.sleep(2000);
		i.emp("30");
		logg.info(" EMP Count Entered");
		i.Exp_Yr("2022");
		logg.info("Selected Expansion Year");
		Thread.sleep(3000);
		i.Exp_Mon("March");
		logg.info("Selected Expansion Month");
		Thread.sleep(5000);
		i.lptp("30");
		logg.info("Laptop Count Entered ");
		i.clickeligible();
		logg.info("Click on Eligibility");
		
		try {
		    Thread.sleep(5000);
		    String ver = i.vrfunit();
		    Assert.assertEquals(ver, "IT/ITeS Expansion Unit", "Verify results");
		    logg.info("Unit Verification Successfully: {}", ver);
		} catch (AssertionError e) {
		    System.out.println("Unit Verification Failed: " + e.getMessage());
		}

		try {
		    Thread.sleep(5000);
		    i.cnt();
		    Thread.sleep(5000);
		    
		    String ver1 = i.vrfval();
		    Assert.assertEquals(ver1, "You are not eligible for the policy as of now, as your Commercial operation started less than a year ago. You may try again later once your Commercial operation date is at least 12 months old from the date of Expansion", "Verify scenario");
		    logg.info("Eligibility Error message for (Expansion Month-Year and Commercial date not completed 1 year): {}", ver1);
		  
		} catch (AssertionError e) {
		    System.out.println("Verification Failed: " + e.getMessage());
		}

		Thread.sleep(3000);

	}
	
	
	@Test(priority = 2)
    public void sc2() throws Exception {
		
		logg.info("----------Outside Gujarat Before Policy Period Date Unit(Expansion) scenario 2-------------");
		
		driver.get(url);	
		Index1 i = new Index1(driver);
		driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/add_application");
		
		i.projecttype();
		logg.info("Selected Project Type");
		i.next();
		logg.info("Click on Next");
		i.Outside_Yes();
		logg.info("select - yes");
		i.pan("SSFDE1234K");
		logg.info("PAN Entered");
		Thread.sleep(2000);
		i.incorpdate("January 2022", "10");
		logg.info("Incorporation date enter successfully");
		Thread.sleep(2000);
		i.setdate("February 2022", "2");
		Thread.sleep(2000);
		i.DeeptechNO();
		Thread.sleep(3000);
		i.Commercial_started();
		Thread.sleep(3000);
		i.comdate("February 2022", "3");
		Thread.sleep(2000);
		i.emp("30");
		i.Exp_Yr("2022");
		Thread.sleep(3000);
		i.Exp_Mon("March");
		Thread.sleep(5000);
		i.lptp("30");
		i.clickeligible();
		
		
		try {
		    Thread.sleep(5000);
		    String ver = i.vrfunit();
		    Assert.assertEquals(ver, "IT/ITeS Expansion Unit", "Verify results");
		    logg.info("Unit Verification Successfully: {}", ver);
		} catch (AssertionError e) {
		    System.out.println("Unit Verification Failed: " + e.getMessage());
		}

		try {
		    Thread.sleep(5000);
		    i.cnt();
		    Thread.sleep(5000);
		    
		    String ver1 = i.vrfval();
		    Assert.assertEquals(ver1, "You are not eligible for the policy as of now, as your Commercial operation started less than a year ago. You may try again later once your Commercial operation date is at least 12 months old from the date of Expansion", "Verify scenario");
		    logg.info("Eligibility Error message for (Expansion Month-Year and Commercial date not completed 1 year): {}", ver1);
		  
		} catch (AssertionError e) {
		    System.out.println("Verification Failed: " + e.getMessage());
		}

		Thread.sleep(3000);

	}

	
	@Test(priority = 3)
    public void sc3() throws Exception {
		
		logg.info("----------Outside Gujarat Before Policy Period Date Unit(Expansion) scenario 3-------------");
	
	driver.get(url);	
	Index1 i = new Index1(driver);
	driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/add_application");
	
	i.projecttype();
	i.next();
	i.Outside_Yes();
	i.pan("SSFDE1234K");
	Thread.sleep(2000);
	i.incorpdate("January 2022", "10");
	Thread.sleep(2000);
	i.setdate("February 2022", "2");
	Thread.sleep(2000);
	i.DeeptechYes();
	Thread.sleep(3000);
	i.Commercial_started();
	Thread.sleep(3000);
	i.comdate("February 2022", "3");
	Thread.sleep(2000);
	i.emp("30");
	i.Exp_Yr("2023");
	Thread.sleep(3000);
	i.Exp_Mon("May");
	Thread.sleep(5000);
	i.lptp("30");
	i.clickeligible();
	
	
	try {
	    Thread.sleep(5000);
	    String ver = i.vrfunit();
	    Assert.assertEquals(ver, "IT/ITeS Expansion Unit", "Verify results");
	    logg.info("Unit Verification Successfully: {}", ver);
	} catch (AssertionError e) {
		System.out.println("Unit Verification Failed: " + e.getMessage());
	}

	try {
	    Thread.sleep(5000);
	    i.cnt();
	    Thread.sleep(5000);
	    
	    String ver1 = i.vrfsuceesunit();
	    Assert.assertEquals(ver1, "IT/ITeS Expansion Unit", "Verify scenario");
	    logg.info("Application Created Successfully: {}", ver1);
	} catch (AssertionError e) {
		System.out.println("Application Creation Failed: " + e.getMessage());
	}


	
	Thread.sleep(3000);
	driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/viewcommonapplication");
	Thread.sleep(3000);
	i.revokeopen();
	Thread.sleep(2000);
	i.revokeapp();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());

	// Now handle the alert
	Alert alert = driver.switchTo().alert();
	alert.accept();
    logg.info("Application Revoked Successfully");
	Thread.sleep(3000);


}
	
	@Test(priority = 4)
	
	public void sc4() throws Exception {
		
		logg.info("----------Outside Gujarat Before Policy Period Date Unit(Expansion) scenario 4-------------");
	
	driver.get(url);	
	Index1 i = new Index1(driver);
	driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/add_application");
	
	i.projecttype();
	i.next();
	i.Outside_Yes();
	i.pan("SSFDE1234K");
	Thread.sleep(2000);
	i.incorpdate("January 2022", "10");
	Thread.sleep(2000);
	i.setdate("February 2022", "2");
	Thread.sleep(2000);
	i.DeeptechNO();
	Thread.sleep(3000);
	i.Commercial_started();
	Thread.sleep(3000);
	i.comdate("February 2022", "3");
	Thread.sleep(2000);
	i.emp("30");
	i.Exp_Yr("2023");
	Thread.sleep(3000);
	i.Exp_Mon("April");
	Thread.sleep(5000);
	i.lptp("30");
	i.clickeligible();
	
	
	try {
	    Thread.sleep(5000);
	    String ver = i.vrfunit();
	    Assert.assertEquals(ver, "IT/ITeS Expansion Unit", "Verify results");
	    logg.info("Unit Verification Successfully: {}", ver);
	} catch (AssertionError e) {
		System.out.println("Unit Verification Failed: " + e.getMessage());
	}

	try {
	    Thread.sleep(5000);
	    i.cnt();
	    Thread.sleep(5000);
	    
	    String ver1 = i.vrfsuceesunit();
	    Assert.assertEquals(ver1, "IT/ITeS Expansion Unit", "Verify scenario");
	    logg.info("Application Created Successfully: {}", ver1);
	} catch (AssertionError e) {
		System.out.println("Application Creation Failed: " + e.getMessage());
	}


	
	Thread.sleep(3000);
	driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/viewcommonapplication");
	Thread.sleep(3000);
	i.revokeopen();
	Thread.sleep(2000);
	i.revokeapp();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());

	// Now handle the alert
	Alert alert = driver.switchTo().alert();
	alert.accept();
    logg.info("Application Revoked Successfully");
	Thread.sleep(3000);


}

}
