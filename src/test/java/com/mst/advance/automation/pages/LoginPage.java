package com.mst.advance.automation.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mst.advance.automation.abstractclass.DriverClass;

public class LoginPage extends DriverClass{
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	
	By txt_userName = By.xpath("//input[@id = 'input-0']");
	
	By txt_password = By.xpath("//input[@id = 'input-1']");
	
	By btn_login = By.xpath("//button [@class ='slds-button slds-button_neutral sfdc_button']");
	
	public void navigateCommunity() {
		
		driver.get("https://eddqa1-ca-edd.cs32.force.com/workshareemployer/s/login/");
	}
	
	
      public void enterUsername(String userName) {
    	  
    	  driver.findElement(txt_userName).sendKeys(userName);
    	 
      }
      
      public void enterPassword(String password) {
    	  
    	  driver.findElement(txt_password).sendKeys(password);
      }
      
      public EmployerFormPage clickLogin() {
    	  
    	  driver.findElement(btn_login).click();
    	  return new EmployerFormPage(driver);
      }





}
