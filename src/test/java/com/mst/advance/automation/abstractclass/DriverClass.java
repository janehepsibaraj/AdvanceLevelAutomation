package com.mst.advance.automation.abstractclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public abstract class DriverClass {
	
	protected static WebDriver driver;
	protected static Actions act;
	 
    public DriverClass(WebDriver driver) {
			this.driver = driver;
			act = new Actions(driver);
			    
			     
			     
			
		}                                                 
		    

}
