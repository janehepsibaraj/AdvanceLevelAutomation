package com.mst.advance.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mst.advance.automation.abstractclass.DriverClass;

public class EmployerFormPage extends DriverClass{
	
	public EmployerFormPage(WebDriver driver) {
		super(driver);
		
	}
	

	
	By btn_viewEmployees = By.xpath("//button[@name ='View Employees']");
	
	By btn_startForm = By.xpath("//tbody/tr[1]/td[7]/lightning-primitive-cell-factory[1]/span[1]/div[1]/lightning-primitive-cell-button[1]/lightning-button[1]/button[1]");
	
	By txt_normalWeeklyWages = By.xpath("//input[@name = 'Normal_Weekly_Wages__c']");
	
	
	By txt_totalWagesPaid = By.xpath("//input[@name ='Total_Wages_Paid__c']");
	
	
	By select_otherPay = By.xpath("//button[@name ='Total_Wages_Paid_Include_Other__c']");
	
	
    By txt_normalHours = By.xpath("//input[@name ='Normal_Hours_of_Work_Per_Week__c' ]");
	
	
	By txt_totalHours = By.xpath("//input[@name ='Total_Hours_Worked__c' ]");
	
	
	By select_absenceofWork = By.xpath("//button[@name = 'Was_employee_absent_from_work__c']");
	
	
	By select_refusalOfWork = By.xpath("//button[@name = 'Did_the_employee_refuse_any_work__c']");
	
	
	By select_refusalDate = By.xpath("//input[@name = 'Refused_Work_Date_1__c']");
	
	
	By select_refusalHour = By.xpath("//input[@name='Refused_Work_Hours_1__c']");
	
	
	By select_refusalReason = By.xpath("//input[@name='Refused_Work_Reason_1__c']");
	
	
	By select_holidayDuringThisWeek = By.xpath("//button[@name = 'Was_there_a_holiday_during_this_week4511__c']");
	
	
	By btn_acknowledged = By.xpath("//body/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/c-form-employee[1]/c-employee-roster-payroll-table[1]/div[1]/c-section-a4511[1]/div[1]/div[3]/div[3]/lightning-record-edit-form[1]/lightning-record-edit-form-create[1]/form[1]/slot[1]/slot[1]/div[15]/div[1]/div[1]/lightning-input-field[1]/lightning-input[1]/div[1]/span[1]/label[1]/span[1]");
	
	By txt_nameOfSignee = By.xpath("//input[@name='Employer_Printed_Name_of_Signee__c']");
	
	
	By txt_title = By.xpath("//input[@name='Title__c']");
	
	
	By txt_telephoneNumber = By.xpath("//input[@name = 'Employer_Telephone_Number__c']");
	
	
	By btn_submit = By.xpath("//button[text()='Submit']");
	
	
    
    public void clickViewEmployees() {
    	driver.findElement(btn_viewEmployees).click();
    }
    
    public void startForm() {
    	driver.findElement(btn_startForm).click();
    }
    
    public void normalWeeklyWages(String normalWeeklyWagesValue) throws InterruptedException {
    	
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		System.out.println("pagedown One");
		Thread.sleep(5000);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
		System.out.println("pagedown two");

        driver.findElement(txt_normalWeeklyWages).sendKeys("500");
    	 
    
		
    }
    
    public void totalWagesPaid(String totalWagesPaidValue) {
    	driver.findElement(txt_totalWagesPaid).sendKeys(totalWagesPaidValue);
    }
    
    public void otherPay() {
    	driver.findElement(select_otherPay).click();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("pagedown three");
    }
    
    
    public void totalHours(String totalHoursWorked) {
    	
    	driver.findElement(txt_totalHours).sendKeys(totalHoursWorked);
    	
    	
    }
    
    public void absenceOfWork() throws InterruptedException {
    	
    	Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
    	WebElement element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_absenceofWork));
		element.click();
		Thread.sleep(2000);
		act.sendKeys("No").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
    	
    }
    
    public void refusalOfWork() throws InterruptedException {
    	WebElement elementTwo = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_refusalOfWork));
		elementTwo.click();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
    	
    }
    
    public void refusalDate(String refusalDateValue) {
    	driver.findElement(select_refusalDate).sendKeys(refusalDateValue);
    }
    
    public void refusalHour(String refusalHourValue) {
    	driver.findElement(select_refusalHour).sendKeys(refusalHourValue);
    }
    
    public void refusalReason(String refusalReason) {
    	driver.findElement(select_refusalReason).sendKeys(refusalReason);
    }
    
    public void holidayInTheWeek() throws InterruptedException {
    	
    	
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
    	WebElement elementThree = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_holidayDuringThisWeek));
		elementThree.click();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
    
    }
    
    public void acknowledgement() {
    	WebElement elementFour = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(btn_acknowledged));
		elementFour.click();
    	
    }
    
    public void nameOfSignee() {
    	
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
    	driver.findElement(txt_nameOfSignee).sendKeys("John Paul");
    }
    
    public void title() {
    	driver.findElement(txt_title).sendKeys("Manager");
    }
    
    public void telephoneNumber() {
    	driver.findElement(txt_telephoneNumber).sendKeys("9832717381");
    }
    
    public EmployeePage clickSubmit() {
    	driver.findElement(btn_submit).click();
    	return new EmployeePage(driver);
    }

}
