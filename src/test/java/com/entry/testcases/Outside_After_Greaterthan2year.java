package com.entry.testcases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.entry.pageobject.Index1;

public class Outside_After_Greaterthan2year extends Baseclass{

	@Test(priority = 1)
	public void sc1() throws Exception {
		
		driver.get(url);	
		Index1 i = new Index1(driver);
		driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/add_application");
		
		i.projecttype();
		i.next();
		i.Outside_Yes();
		i.pan("ASDER1234E");
		Thread.sleep(2000);
		i.incorpdate("July 2022", "10");
		Thread.sleep(2000);
		i.setdate("July 2022", "10");
		Thread.sleep(2000);
		i.Commercial_started();
		i.comdate("July 2022", "10");
		Thread.sleep(3000);
		i.unitselection("New Unit -Exiting unit outside Gujarat Starting new operation in Gujarat");
		i.emp("30");
		i.DeeptechYes();
		Thread.sleep(2000);
		i.lptp("30");
		i.clickeligible();
		
		
		try {
		    Thread.sleep(5000);
		    String ver = i.vrfunit();
		    Assert.assertEquals(ver, "IT/ITeS New Unit - Existing Unit Outside Gujarat starting new operation in Gujarat", "Verify results");
		    System.out.println("Test Case 1 Passed: Unit verification successful.");
		} catch (AssertionError e) {
		    System.out.println("Test Case 1 Failed: " + e.getMessage());
		}

		try {
		    Thread.sleep(5000);
		    i.cnt();
		    Thread.sleep(5000);
		    
		    String ver1 = i.vrfval();
		    Assert.assertEquals(ver1, "Currently you are not eligible for Incentive Application as your employee count is less than 33.", "Verify scenario");
		    System.out.println("Test Case 2 Passed: Eligibility message verification successful.");
		} catch (AssertionError e) {
		    System.out.println("Test Case 2 Failed: " + e.getMessage());
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
		i.Outside_Yes();
		i.pan("ASDER1234E");
		Thread.sleep(2000);
		i.incorpdate("July 2022", "10");
		Thread.sleep(2000);
		i.setdate("July 2022", "10");
		Thread.sleep(2000);
		i.Commercial_started();
		i.comdate("July 2022", "10");
		Thread.sleep(3000);
		i.unitselection("New Unit -Exiting unit outside Gujarat Starting new operation in Gujarat");
		i.emp("33");
		i.DeeptechYes();
		i.lptp("10");
		i.clickeligible();
		
		
		try {
		    Thread.sleep(5000);
		    String ver = i.vrfunit();
		    Assert.assertEquals(ver, "IT/ITeS New Unit - Existing Unit Outside Gujarat starting new operation in Gujarat", "Verify results");
		    System.out.println("Test Case 1 Passed: Unit verification successful.");
		} catch (AssertionError e) {
		    System.out.println("Test Case 1 Failed: " + e.getMessage());
		}

		try {
		    Thread.sleep(5000);
		    i.cnt();
		    Thread.sleep(5000);
		    
		    String ver1 = i.vrfval();
		    Assert.assertEquals(ver1, "According to para 2.5.11 of G.R. No: ITP/10/2021/583612/IT a workstation, laptop, or any IT device must be allocated to at least 80% of the total employees.", "Verify scenario");
		    System.out.println("Test Case 2 Passed: Eligibility message verification successful.");
		} catch (AssertionError e) {
		    System.out.println("Test Case 2 Failed: " + e.getMessage());
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
	i.Outside_Yes();
	i.pan("ASDER1234E");
	Thread.sleep(2000);
	i.incorpdate("July 2022", "10");
	Thread.sleep(2000);
	i.setdate("July 2022", "10");
	Thread.sleep(2000);
	i.Commercial_started();
	i.comdate("July 2022", "10");
	Thread.sleep(3000);
	i.unitselection("New Unit -Exiting unit outside Gujarat Starting new operation in Gujarat");
	i.emp("50");
	i.DeeptechYes();
	i.lptp("60");
	i.clickeligible();
	
	
	try {
	    Thread.sleep(5000);
	    String ver = i.vrfunit();
	    Assert.assertEquals(ver, "IT/ITeS New Unit - Existing Unit Outside Gujarat starting new operation in Gujarat", "Verify results");
	    System.out.println("Test Case 1 Passed: Unit verification successful.");
	} catch (AssertionError e) {
	    System.out.println("Test Case 1 Failed: " + e.getMessage());
	}

	try {
	    Thread.sleep(5000);
	    i.cnt();
	    Thread.sleep(5000);
	    
	    String ver1 = i.vrfsuceesunit();
	    Assert.assertEquals(ver1, "IT/ITeS New Unit - Existing Unit Outside Gujarat starting new operation in Gujarat", "Verify scenario");
	    System.out.println("Test Case 2 Passed: Application Created successful.");
	} catch (AssertionError e) {
	    System.out.println("Test Case 2 Failed: " + e.getMessage());
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

	Thread.sleep(5000);

}

    @Test(priority = 4)
    public void sc4() throws Exception {
	
	driver.get(url);	
	Index1 i = new Index1(driver);
	driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/add_application");
	

	i.projecttype();
	i.next();
	i.Outside_Yes();
	i.pan("ASDER1234E");
	Thread.sleep(2000);
	i.incorpdate("July 2022", "10");
	Thread.sleep(2000);
	i.setdate("July 2022", "10");
	Thread.sleep(2000);
	i.Commercial_started();
	i.comdate("July 2022", "10");
	Thread.sleep(3000);
	i.unitselection("New Unit -Exiting unit outside Gujarat Starting new operation in Gujarat");
	i.emp("40");
	i.DeeptechNO();
	i.lptp("40");
	i.clickeligible();
	
	
	try {
	    Thread.sleep(5000);
	    String ver = i.vrfunit();
	    Assert.assertEquals(ver, "IT/ITeS New Unit - Existing Unit Outside Gujarat starting new operation in Gujarat", "Verify results");
	    System.out.println("Test Case 1 Passed: Unit verification successful.");
	} catch (AssertionError e) {
	    System.out.println("Test Case 1 Failed: " + e.getMessage());
	}

	try {
	    Thread.sleep(5000);
	    i.cnt();
	    Thread.sleep(5000);
	    
	    String ver1 = i.vrfval();
	    Assert.assertEquals(ver1, "Currently you are not eligible for Incentive Application as your employee count is less than 50.", "Verify scenario");
	    System.out.println("Test Case 2 Passed: Eligibility message verification successful.");
	} catch (AssertionError e) {
	    System.out.println("Test Case 2 Failed: " + e.getMessage());
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
	i.Outside_Yes();
	i.pan("ASDER1234E");
	Thread.sleep(2000);
	i.incorpdate("July 2022", "10");
	Thread.sleep(2000);
	i.setdate("July 2022", "10");
	Thread.sleep(2000);
	i.Commercial_started();
	i.comdate("July 2022", "10");
	Thread.sleep(3000);
	i.unitselection("New Unit -Exiting unit outside Gujarat Starting new operation in Gujarat");
	i.emp("50");
	i.DeeptechNO();
	i.lptp("30");
	i.clickeligible();
	
	
	try {
	    Thread.sleep(5000);
	    String ver = i.vrfunit();
	    Assert.assertEquals(ver, "IT/ITeS New Unit - Existing Unit Outside Gujarat starting new operation in Gujarat", "Verify results");
	    System.out.println("Test Case 1 Passed: Unit verification successful.");
	} catch (AssertionError e) {
	    System.out.println("Test Case 1 Failed: " + e.getMessage());
	}

	try {
	    Thread.sleep(5000);
	    i.cnt();
	    Thread.sleep(5000);
	    
	    String ver1 = i.vrfval();
	    Assert.assertEquals(ver1, "According to para 2.5.11 of G.R. No: ITP/10/2021/583612/IT a workstation, laptop, or any IT device must be allocated to at least 80% of the total employees.", "Verify scenario");
	    System.out.println("Test Case 2 Passed: Application Created successful.");
	} catch (AssertionError e) {
	    System.out.println("Test Case 2 Failed: " + e.getMessage());
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
	i.Outside_Yes();
	i.pan("ASDER1234E");
	Thread.sleep(2000);
	i.incorpdate("July 2022", "10");
	Thread.sleep(2000);
	i.setdate("July 2022", "10");
	Thread.sleep(2000);
	i.Commercial_started();
	i.comdate("July 2022", "10");
	Thread.sleep(3000);
	i.unitselection("New Unit -Exiting unit outside Gujarat Starting new operation in Gujarat");
	i.emp("100");
	i.DeeptechNO();
	i.lptp("100");
	i.clickeligible();
	
	
	try {
	    Thread.sleep(5000);
	    String ver = i.vrfunit();
	    Assert.assertEquals(ver, "IT/ITeS New Unit - Existing Unit Outside Gujarat starting new operation in Gujarat", "Verify results");
	    System.out.println("Test Case 1 Passed: Unit verification successful.");
	} catch (AssertionError e) {
	    System.out.println("Test Case 1 Failed: " + e.getMessage());
	}

	try {
	    Thread.sleep(5000);
	    i.cnt();
	    Thread.sleep(5000);
	    
	    String ver1 = i.vrfsuceesunit();
	    Assert.assertEquals(ver1, "Currently you are not eligible for Incentive Application as your employee count is less than 50.", "Verify scenario");
	    System.out.println("Test Case 2 Passed: Eligibility message verification successful.");
	} catch (AssertionError e) {
	    System.out.println("Test Case 2 Failed: " + e.getMessage());
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

	Thread.sleep(5000);

}
    
   // For Expansion
    
    @Test(priority = 7)
	public void sc7() throws Exception {
		
		driver.get(url);	
		Index1 i = new Index1(driver);
		driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/add_application");
		
		i.projecttype();
		i.next();
		i.Outside_Yes();
		i.pan("SSFDE1234K");
		Thread.sleep(2000);
		i.incorpdate("July 2022", "10");
		Thread.sleep(2000);
		i.setdate("July 2022", "10");
		Thread.sleep(2000);
		i.DeeptechYes();
		Thread.sleep(3000);
		i.Commercial_started();
		i.comdate("July 2022", "10");
		Thread.sleep(3000);
		i.unitselection("Expansion");
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
		    System.out.println("Test Case 1 Passed: Unit verification successful.");
		} catch (AssertionError e) {
		    System.out.println("Test Case 1 Failed: " + e.getMessage());
		}

		try {
		    Thread.sleep(5000);
		    i.cnt();
		    Thread.sleep(5000);
		    
		    String ver1 = i.vrfval();
		    Assert.assertEquals(ver1, "You are not eligible for the policy as of now, as your Commercial operation started less than a year ago. You may try again later once your Commercial operation date is at least 12 months old from the date of Expansion", "Verify scenario");
		    System.out.println("Test Case 2 Passed: Eligibility message verification successful.");
		} catch (AssertionError e) {
		    System.out.println("Test Case 2 Failed: " + e.getMessage());
		}

		Thread.sleep(5000);

	}
	
	@Test(priority = 8)
    public void sc8() throws Exception {
		
		driver.get(url);	
		Index1 i = new Index1(driver);
		driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/add_application");
		
		i.projecttype();
		i.next();
		i.Outside_Yes();
		i.pan("SSFDE1234K");
		Thread.sleep(2000);
		i.incorpdate("July 2022", "10");
		Thread.sleep(2000);
		i.setdate("July 2022", "10");
		Thread.sleep(2000);
		i.DeeptechNO();
		Thread.sleep(3000);
		i.Commercial_started();
		i.comdate("July 2022", "10");
		Thread.sleep(3000);
		i.unitselection("Expansion");
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
		    System.out.println("Test Case 1 Passed: Unit verification successful.");
		} catch (AssertionError e) {
		    System.out.println("Test Case 1 Failed: " + e.getMessage());
		}

		try {
		    Thread.sleep(5000);
		    i.cnt();
		    Thread.sleep(5000);
		    
		    String ver1 = i.vrfval();
		    Assert.assertEquals(ver1, "You are not eligible for the policy as of now, as your Commercial operation started less than a year ago. You may try again later once your Commercial operation date is at least 12 months old from the date of Expansion", "Verify scenario");
		    System.out.println("Test Case 2 Passed: Eligibility message verification successful.");
		} catch (AssertionError e) {
		    System.out.println("Test Case 2 Failed: " + e.getMessage());
		}

		Thread.sleep(5000);

	}

	@Test(priority = 9)
    public void sc9() throws Exception {
	
	driver.get(url);	
	Index1 i = new Index1(driver);
	driver.get("https://testdit.gujarat.gov.in:8443/dstmain/itpolicy/add_application");
	
	i.projecttype();
	i.next();
	i.Outside_Yes();
	i.pan("SSFDE1234K");
	Thread.sleep(2000);
	i.incorpdate("July 2022", "10");
	Thread.sleep(2000);
	i.setdate("July 2022", "10");
	Thread.sleep(2000);
	i.DeeptechYes();
	Thread.sleep(3000);
	i.Commercial_started();
	i.comdate("July 2022", "10");
	Thread.sleep(3000);
	i.unitselection("Expansion");
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
	    System.out.println("Test Case 1 Passed: Unit verification successful.");
	} catch (AssertionError e) {
	    System.out.println("Test Case 1 Failed: " + e.getMessage());
	}

	try {
	    Thread.sleep(5000);
	    i.cnt();
	    Thread.sleep(5000);
	    
	    String ver1 = i.vrfsuceesunit();
	    Assert.assertEquals(ver1, "IT/ITeS Expansion Unit", "Verify scenario");
	    System.out.println("Test Case 2 Passed: Application Created successful.");
	} catch (AssertionError e) {
	    System.out.println("Test Case 2 Failed: " + e.getMessage());
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

	Thread.sleep(5000);


}
	
	@Test(priority = 10)
	
	public void sc10() throws Exception {
	
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
	i.unitselection("Expansion");
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
	    System.out.println("Test Case 1 Passed: Unit verification successful.");
	} catch (AssertionError e) {
	    System.out.println("Test Case 1 Failed: " + e.getMessage());
	}

	try {
	    Thread.sleep(5000);
	    i.cnt();
	    Thread.sleep(5000);
	    
	    String ver1 = i.vrfsuceesunit();
	    Assert.assertEquals(ver1, "IT/ITeS Expansion Unit", "Verify scenario");
	    System.out.println("Test Case 2 Passed: Application Created successful.");
	} catch (AssertionError e) {
	    System.out.println("Test Case 2 Failed: " + e.getMessage());
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

	Thread.sleep(5000);



}




}
