package com.entry.util;

import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.entry.testcases.Baseclass;
import com.github.dockerjava.api.model.Driver;

public class Extentreport extends Baseclass implements ITestListener{
	
	
	ExtentSparkReporter htmlrpts;
	   ExtentReports reports;
	   ExtentTest test;
	   
	   	
		public void configurereport() {
			
			htmlrpts = new ExtentSparkReporter("Extent.html");
			reports = new ExtentReports();
			reports.attachReporter(htmlrpts);
			
			reports.setSystemInfo("Application", "IT Policy");
			reports.setSystemInfo("Author", "Mitesh");
			reports.setSystemInfo("Browser", "Chrome");
			reports.setSystemInfo("OS", "Windows 11");
			
			
			htmlrpts.config().setDocumentTitle("Validation Report Details");
			htmlrpts.config().setReportName("Validation Report");
			htmlrpts.config().setTheme(Theme.STANDARD);
			htmlrpts.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
			
			
		}
	 

		 public void onStart(ITestContext result) {  
           // TODO Auto-generated method stub  
      	configurereport();
      	 System.out.println("start method invoked"); 
       }  
     
    
       public void onFinish(ITestContext result) {  
           // TODO Auto-generated method stub  
      	 System.out.println("finish Method invoked");
             reports.flush();
       }
     
       public void onTestStart(ITestContext result) {  
           // TODO Auto-generated method stub 
      	 System.out.println("Success of test cases and its details are : "+result.getName()); 
             
       }  
     
       
       public void onTestSuccess(ITestResult result) {  
      	 
      	 
           // TODO Auto-generated method stub  
           System.out.println("Success of test cases and its details are : "+result.getName());  
           test = reports.createTest(result.getName());
           test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "Passed", ExtentColor.GREEN));
       }  
     
  
       public void onTestFailure(ITestResult result) {  
      	 
      	 String testname = result.getName();
			try {
				capture(driver,testname);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           // TODO Auto-generated method stub  
           System.out.println("Failure of test cases and its details are : "+result.getName());  
           test = reports.createTest(result.getName());
       	   test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Failed", ExtentColor.RED));
       	   test.skip(result.getThrowable());
       	   
       	   String path = System.getProperty("user.dir") + "//Screenshots//" + result.getName() + ".png";
       	   File screen = new File(path);
       	
       	   if(screen.exists()) {
       	   test.fail("Captured:" + test.addScreenCaptureFromPath(path));
       	   }
       	
       }  
     
         
       public void onTestSkipped(ITestResult result) {  
           // TODO Auto-generated method stub  
           System.out.println("Skip of test cases and its details are : "+result.getName());  
           test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Skip", ExtentColor.ORANGE));
		   test.skip(result.getThrowable());
          
       }  
     
       
       public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
           // TODO Auto-generated method stub  
           System.out.println("Failure of test cases and its details are : "+result.getName());  
         
       }  


}
