package com.mst.advance.automation.abstractclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class DriverClass {
	
	protected static WebDriver driver;
	 
    public DriverClass(WebDriver driver) {
			this.driver = driver;
			//PageFactory.initElements(driver, this);      
			
		}                                                 
		    

}
