package com.entry.pageobject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Index1 {

	WebDriver ldriver;

	public Index1(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "project_type")
	WebElement ptype;

	@FindBy(xpath = ".//*[@class='btn btn-secondary']")
	WebElement nextclick;

	@FindBy(id = "is_reg_out_gujarat_yes")
	WebElement Oyes;

	@FindBy(id = "is_reg_out_gujarat_no")
	WebElement Ono;

	@FindBy(id = "pan_number")
	WebElement pan;

	@FindBy(id = "incorporation_date")
	WebElement incorpdt;

	@FindBy(id = "settingup_gujarat_date")
	WebElement settingdt;

	@FindBy(id = "yes")
	WebElement Com_yes;

	@FindBy(id = "no")
	WebElement Com_no;

	@FindBy(id = "com_op_date")
	WebElement comdt;

	@FindBy(id = "tent_com_op_date")
	WebElement tent;

	@FindBy(id = "employee_count")
	WebElement empcnt;

	@FindBy(id = "addentitySubmit")
	WebElement checkeligibility;

	@FindBy(xpath = "//div[@id='swal2-content']//span[3]")
	WebElement verifyunit;

	@FindBy(id = "unit_type")
	WebElement Unit_type;

	@FindBy(id = "expansion_year")
	WebElement Exp_Year;

	@FindBy(id = "expansion_month")
	WebElement Exp_Month;

	@FindBy(id = "has_deeptech_service_yes")
	WebElement deepYES;

	@FindBy(id = "has_deeptech_service_no")
	WebElement deepNO;

	@FindBy(id = "workstation_laptop_count")
	WebElement Laptop;

	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	WebElement conti;

	@FindBy(xpath = "//*[@id='applicantcontent']/div/section/div[2]/div")
	WebElement varify;

	@FindBy(xpath = "//*[@id='annexureoneform']/div[1]/div[4]/div[1]/label[2]/b")
	WebElement varifysucessunit;

	@FindBy(id = "revokemodalbtn")
	WebElement openrevoke;

	@FindBy(xpath = "//button[@type='submit' and contains(@class, 'btn-primary') and text()='Revoke']")
	WebElement Clickrevoke;

	public void projecttype() {
		Select pti = new Select(ptype);
		pti.selectByVisibleText("IT/ITeS Unit (Category I - GFCI < INR 250 Cr.)");
	}

	public void next() {
		nextclick.click();
	}

	public void Outside_Yes() {
		Oyes.click();
	}

	public void Outside_No() {
		Ono.click();
	}

	public void pan(String pno) {
		pan.sendKeys(pno);
	}

	
	public void incorpdate(String targetYear, String targetMonthYear) throws Exception { // Open the date picker 
		  incorpdt.click();
	  
	  // Wait for the date picker to be visible
		  WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'datepicker-switch')]")));
	  
	  // Navigate to the correct year 
	  while (true)
	  { 
		  String displayedYearOrMonthYear =ldriver.findElement(By.xpath("//*[contains(@class, 'datepicker-switch')]")).getText();
	  
	  // Check if the displayed element contains the target year 
		  if(displayedYearOrMonthYear.contains(targetYear)) { 
			  break;
			  
		  }
	  
	  
	  
	  // Navigate to previous or next based on targetYear 
	  if(displayedYearOrMonthYear.matches("\\d{4}-\\d{4}"))
	  { 
		  // Handles year ranges(e.g., "2020-2029")
	  
	  int startYear = Integer.parseInt(displayedYearOrMonthYear.split("-")[0]); if
	  (startYear > Integer.parseInt(targetYear)) {
	  ldriver.findElement(By.xpath("//*[contains(@class, 'prev')][1]")).click(); }
	  else {
	  ldriver.findElement(By.xpath("//*[contains(@class, 'next')][1]]")).click(); }
	  } else { 
		  // Navigate if the element shows a specific year (e.g.,"January 2025")
	  ldriver.findElement(By.xpath("//*[contains(@class, 'prev')]")).click(); } }
	  
	  Thread.sleep(3000); // Click on the desired year if available
	  
	//  ldriver.findElement(By.xpath("//*[contains(@class, 'datepicker-years')]")).click(); Thread.sleep(3000); 
	  // Navigate to the correct month
	 // ldriver.findElement(By.xpath("//*[contains(@class, 'datepicker-months')]")).click();
	  
	  Thread.sleep(3000); 
	  // Select the target date
		/*
		 * WebElement dateElement
		 * =ldriver.findElement(By.xpath("//*[contains(@class, 'day')]"));
		 * dateElement.click();
		 */ 
	  WebElement dateElement = ldriver.findElement(By.xpath("//td[@class='day' and text()='" + targetMonthYear + "']"));
	    dateElement.click();
	  
}
	  
	 	   



public void setdate(String targetYear, String targetMonthYear) throws Exception { // Open the date picker 
settingdt.click();

// Wait for the date picker to be visible
WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'datepicker-switch')]")));

// Navigate to the correct year 
while (true)
{ 
String displayedYearOrMonthYear =ldriver.findElement(By.xpath("//*[contains(@class, 'datepicker-switch')]")).getText();

// Check if the displayed element contains the target year 
if(displayedYearOrMonthYear.contains(targetYear)) { 
	  break;
	  
}



// Navigate to previous or next based on targetYear 
if(displayedYearOrMonthYear.matches("\\d{4}-\\d{4}"))
{ 
// Handles year ranges(e.g., "2020-2029")

int startYear = Integer.parseInt(displayedYearOrMonthYear.split("-")[0]); if
(startYear > Integer.parseInt(targetYear)) {
ldriver.findElement(By.xpath("//*[contains(@class, 'prev')][1]")).click(); }
else {
ldriver.findElement(By.xpath("//*[contains(@class, 'next')][1]]")).click(); }
} else { 
// Navigate if the element shows a specific year (e.g.,"January 2025")
ldriver.findElement(By.xpath("//*[contains(@class, 'prev')]")).click(); } }

Thread.sleep(3000); // Click on the desired year if available

//  ldriver.findElement(By.xpath("//*[contains(@class, 'datepicker-years')]")).click(); Thread.sleep(3000); 
// Navigate to the correct month
// ldriver.findElement(By.xpath("//*[contains(@class, 'datepicker-months')]")).click();

Thread.sleep(3000); 
// Select the target date
/*
* WebElement dateElement
* =ldriver.findElement(By.xpath("//*[contains(@class, 'day')]"));
* dateElement.click();
*/ 
WebElement dateElement = ldriver.findElement(By.xpath("//td[@class='day' and text()='" + targetMonthYear + "']"));
dateElement.click();

}



public void Commercial_started() {
Com_yes.click();
}

public void Commercial_Notstarted() {
Com_no.click();
}

public void comdate(String targetYear, String targetMonthYear) throws Exception { // Open the date picker 
comdt.click();

// Wait for the date picker to be visible
WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'datepicker-switch')]")));

// Navigate to the correct year 
while (true)
{ 
String displayedYearOrMonthYear =ldriver.findElement(By.xpath("//*[contains(@class, 'datepicker-switch')]")).getText();

// Check if the displayed element contains the target year 
if(displayedYearOrMonthYear.contains(targetYear)) { 
	  break;
	  
}



// Navigate to previous or next based on targetYear 
if(displayedYearOrMonthYear.matches("\\d{4}-\\d{4}"))
{ 
// Handles year ranges(e.g., "2020-2029")

int startYear = Integer.parseInt(displayedYearOrMonthYear.split("-")[0]);
if
(startYear > Integer.parseInt(targetYear)) {
ldriver.findElement(By.xpath("//*[contains(@class, 'prev')][1]")).click(); }
else {
ldriver.findElement(By.xpath("//*[contains(@class, 'next')][1]]")).click(); }
} else { 
	  // Navigate if the element shows a specific year (e.g.,"January 2025")
ldriver.findElement(By.xpath("//*[contains(@class, 'prev')]")).click();

}}
Thread.sleep(3000); // Click on the desired year if available

//  ldriver.findElement(By.xpath("//*[contains(@class, 'datepicker-years')]")).click(); Thread.sleep(3000); 
// Navigate to the correct month
// ldriver.findElement(By.xpath("//*[contains(@class, 'datepicker-months')]")).click();

Thread.sleep(3000); 
// Select the target date
/*
* WebElement dateElement
* =ldriver.findElement(By.xpath("//*[contains(@class, 'day')]"));
* dateElement.click();
*/ 
WebElement dateElement = ldriver.findElement(By.xpath("//td[@class='day' and text()='" + targetMonthYear + "']"));
dateElement.click();


}


public void tentdate(String targetYear, String targetMonthYear) throws Exception { // Open the date picker 
tent.click();

// Wait for the date picker to be visible
WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'datepicker-switch')]")));

// Navigate to the correct year 
while (true)
{ 
String displayedYearOrMonthYear =ldriver.findElement(By.xpath("//*[contains(@class, 'datepicker-switch')]")).getText();

// Check if the displayed element contains the target year 
if(displayedYearOrMonthYear.contains(targetYear)) { 
	  break;
	  
}



// Navigate to previous or next based on targetYear 
if(displayedYearOrMonthYear.matches("\\d{4}-\\d{4}"))
{ 
// Handles year ranges(e.g., "2020-2029")

int startYear = Integer.parseInt(displayedYearOrMonthYear.split("-")[0]); 
if
(startYear > Integer.parseInt(targetYear)) {
ldriver.findElement(By.xpath("//*[contains(@class, 'next')][1]")).click(); }
else {
ldriver.findElement(By.xpath("//*[contains(@class, 'prev')][1]]")).click(); }
} else { 
	  // Navigate if the element shows a specific year (e.g.,"January 2025")
ldriver.findElement(By.xpath("//*[contains(@class, 'next')]")).click();

}}

Thread.sleep(3000); 

WebElement dateElement = ldriver.findElement(By.xpath("//td[@class='day' and text()='" + targetMonthYear + "']"));
dateElement.click();

}

	
	

	public void emp(String cnt) {
		empcnt.sendKeys(cnt);
	}

	public void clickeligible() {
		checkeligibility.click();
	}

	public String vrfunit() {
		return verifyunit.getText();
	}

	public void Exp_Yr(String year) {
		Exp_Year.sendKeys(year);
	}

	public void Exp_Mon(String month) {
	//	Select pti = new Select(Exp_Month);
	//	pti.selectByVisibleText("December");
		Exp_Month.sendKeys(month);
	}
	
	public void unitselection(String unit) {
		//	Select pti = new Select(Exp_Month);
		//	pti.selectByVisibleText("December");
			Unit_type.sendKeys(unit);
		}

	public void DeeptechYes() {
		deepYES.click();
	}

	public void DeeptechNO() {
		deepNO.click();
	}

	public void lptp(String lptp) {
		Laptop.sendKeys(lptp);
	}

	public void cnt() {
		conti.click();
	}

	public String vrfval() {
		return varify.getText();
	}

	public String vrfsuceesunit() {
		return varifysucessunit.getText();
	}

	public void revokeopen() {
		openrevoke.click();
	}

	public void revokeapp() {
		Clickrevoke.click();
	}

}
