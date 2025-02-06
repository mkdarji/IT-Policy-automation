package com.entry.testcases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.entry.pageobject.Index1;

public class Newunit_incorpBefore_SetAfter_ComNotstart extends Baseclass{

	@Test(priority = 1)
	public void sc1() throws Exception {
		
		driver.get(url);	
		Index1 i = new Index1(driver);
		driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/add_application");
		
		i.projecttype();
		i.next();
		i.Outside_No();
		i.pan("ASDER1234E");
		Thread.sleep(2000);
		i.incorpdate("January 2024", "10");
		Thread.sleep(2000);
		i.setdate("February 2024", "10");
		Thread.sleep(2000);
		i.Commercial_Notstarted();
		i.tentdate("March 2025", "10");
		Thread.sleep(2000);
		i.emp("30");
		i.DeeptechYes();
		i.lptp("30");
		i.clickeligible();
		
		
		try {
		    Thread.sleep(5000);
		    String ver = i.vrfunit();
		    Assert.assertEquals(ver, "IT/ITeS New Unit", "Verify results");
		    logg.info("Unit Verification Successfully: {}", ver);
		} catch (AssertionError e) {
			System.out.println("Unit Verification Failed: " + e.getMessage());
		}

		try {
		    Thread.sleep(5000);
		    i.cnt();
		    Thread.sleep(5000);
		    
		    String ver1 = i.vrfval();
		    Assert.assertEquals(ver1, "Currently you are not eligible for Incentive Application as your employee count is less than 33.", "Verify scenario");
		    logg.info("Eligibility Error message for (Employee count is not equal to 33): {}", ver1);
		} catch (AssertionError e) {
			 System.out.println("Error Message Verification Failed: " + e.getMessage());
		}

		Thread.sleep(5000);

	}
	
	
	@Test(priority = 2)
    public void sc2() throws Exception {
		
		driver.get(url);	
		Index1 i = new Index1(driver);
		driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/add_application");
		
		i.projecttype();
		i.next();
		i.Outside_No();
		i.pan("ASDER1234E");
		Thread.sleep(2000);
		i.incorpdate("January 2024", "10");
		Thread.sleep(2000);
		i.setdate("February 2024", "10");
		Thread.sleep(2000);
		i.Commercial_Notstarted();
		i.tentdate("March 2025", "10");
		Thread.sleep(2000);
		i.emp("33");
		i.DeeptechYes();
		i.lptp("10");
		i.clickeligible();
		
		
		try {
		    Thread.sleep(5000);
		    String ver = i.vrfunit();
		    Assert.assertEquals(ver, "IT/ITeS New Unit", "Verify results");
		    logg.info("Unit Verification Successfully: {}", ver);
		} catch (AssertionError e) {
			 System.out.println("Unit Verification Failed: " + e.getMessage());
		}

		try {
		    Thread.sleep(5000);
		    i.cnt();
		    Thread.sleep(5000);
		    
		    String ver1 = i.vrfval();
		    Assert.assertEquals(ver1, "According to para 2.5.11 of G.R. No: ITP/10/2021/583612/IT a workstation, laptop, or any IT device must be allocated to at least 80% of the total employees.", "Verify scenario");
		    logg.info("Eligibility Error message for (Employee count and Laptop count not 80 %): {}", ver1);
		} catch (AssertionError e) {
			 System.out.println("Error Message Verification Failed: " + e.getMessage());
		}

		Thread.sleep(5000);


	}

   @Test(priority = 3)
   public void sc3() throws Exception {
	
	driver.get(url);	
	Index1 i = new Index1(driver);
	driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/add_application");
	

	i.projecttype();
	i.next();
	i.Outside_No();
	i.pan("ASDER1234E");
	Thread.sleep(2000);
	i.incorpdate("January 2024", "10");
	Thread.sleep(2000);
	i.setdate("February 2024", "10");
	Thread.sleep(2000);
	i.Commercial_Notstarted();
	i.tentdate("March 2025", "10");
	Thread.sleep(2000);
	i.emp("50");
	i.DeeptechYes();
	i.lptp("60");
	i.clickeligible();
	
	
	try {
	    Thread.sleep(5000);
	    String ver = i.vrfunit();
	    Assert.assertEquals(ver, "IT/ITeS New Unit", "Verify results");
	    logg.info("Unit Verification Successfully: {}", ver);
	} catch (AssertionError e) {
		System.out.println("Unit Verification Failed: " + e.getMessage());
	}

	try {
	    Thread.sleep(5000);
	    i.cnt();
	    Thread.sleep(5000);
	    
	    String ver1 = i.vrfsuceesunit();
	    Assert.assertEquals(ver1, "IT/ITeS New Unit", "Verify scenario");
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
	Thread.sleep(5000);


}

    @Test(priority = 4)
    public void sc4() throws Exception {
	
	driver.get(url);	
	Index1 i = new Index1(driver);
	driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/add_application");
	

	i.projecttype();
	i.next();
	i.Outside_No();
	i.pan("ASDER1234E");
	Thread.sleep(2000);
	i.incorpdate("January 2024", "10");
	Thread.sleep(2000);
	i.setdate("February 2024", "10");
	Thread.sleep(2000);
	i.Commercial_Notstarted();
	i.tentdate("March 2025", "10");
	Thread.sleep(2000);
	i.emp("40");
	i.DeeptechNO();
	i.lptp("40");
	i.clickeligible();
	
	
	try {
	    Thread.sleep(5000);
	    String ver = i.vrfunit();
	    Assert.assertEquals(ver, "IT/ITeS New Unit", "Verify results");
	    logg.info("Unit Verification Successfully: {}", ver);
	} catch (AssertionError e) {
		 System.out.println("Unit Verification Failed: " + e.getMessage());
	}

	try {
	    Thread.sleep(5000);
	    i.cnt();
	    Thread.sleep(5000);
	    
	    String ver1 = i.vrfval();
	    Assert.assertEquals(ver1, "Currently you are not eligible for Incentive Application as your employee count is less than 50.", "Verify scenario");
	    logg.info("Eligibility Error message for (Employee count is not equal to 50): {}", ver1);
	} catch (AssertionError e) {
		 System.out.println("Error Message Verification Failed: " + e.getMessage());
	}

	
	Thread.sleep(5000);


}


   @Test(priority = 5)

   public void sc5() throws Exception {
	
	driver.get(url);	
	Index1 i = new Index1(driver);
	driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/add_application");
	

	i.projecttype();
	i.next();
	i.Outside_No();
	i.pan("ASDER1234E");
	Thread.sleep(2000);
	i.incorpdate("January 2024", "10");
	Thread.sleep(2000);
	i.setdate("February 2024", "10");
	Thread.sleep(2000);
	i.Commercial_Notstarted();
	i.tentdate("March 2025", "10");
	Thread.sleep(2000);
	i.emp("50");
	i.DeeptechNO();
	i.lptp("30");
	i.clickeligible();
	
	
	try {
	    Thread.sleep(5000);
	    String ver = i.vrfunit();
	    Assert.assertEquals(ver, "IT/ITeS New Unit", "Verify results");
	    logg.info("Unit Verification Successfully: {}", ver);
	} catch (AssertionError e) {
	    System.out.println("Unit Verification Failed: " + e.getMessage());
	}

	try {
	    Thread.sleep(5000);
	    i.cnt();
	    Thread.sleep(5000);
	    
	    String ver1 = i.vrfval();
	    Assert.assertEquals(ver1, "According to para 2.5.11 of G.R. No: ITP/10/2021/583612/IT a workstation, laptop, or any IT device must be allocated to at least 80% of the total employees.", "Verify scenario");
	    logg.info("Eligibility Error message for (Employee count and Laptop count not 80 %): {}", ver1);
	   	} catch (AssertionError e) {
	   	    System.out.println("Error Message Verification Failed: " + e.getMessage());
	}

	

	Thread.sleep(5000);

}

    @Test(priority = 6)

    public void sc6() throws Exception {
	
	driver.get(url);	
	Index1 i = new Index1(driver);
	driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/add_application");
	

	i.projecttype();
	i.next();
	i.Outside_No();
	i.pan("ASDER1234E");
	Thread.sleep(2000);
	i.incorpdate("January 2024","10");
	Thread.sleep(2000);
	i.setdate("February 2024","10");
	Thread.sleep(2000);
	i.Commercial_Notstarted();
	i.tentdate("March 2025", "10");
	Thread.sleep(2000);
	i.emp("100");
	i.DeeptechNO();
	i.lptp("100");
	i.clickeligible();
	
	
	try {
	    Thread.sleep(5000);
	    String ver = i.vrfunit();
	    Assert.assertEquals(ver, "IT/ITeS New Unit", "Verify results");
	    logg.info("Unit Verification Successfully: {}", ver);
	} catch (AssertionError e) {
	    System.out.println("Unit Verification Failed: " + e.getMessage());
	}
	
	try {
	    Thread.sleep(5000);
	    i.cnt();
	    Thread.sleep(5000);
	    
	    String ver1 = i.vrfsuceesunit();
	    Assert.assertEquals(ver1, "IT/ITeS New Unit", "Verify scenario");
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
	Thread.sleep(5000);
    }
}
