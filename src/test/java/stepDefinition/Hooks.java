package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mst.advance.automation.browserfactory.BrowserFactory;
import com.mst.advance.automation.pages.EmployeePage;
import com.mst.advance.automation.pages.EmployerFormPage;
import com.mst.advance.automation.pages.LoginPage;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;




public class Hooks {
	
	public static WebDriver driver;
	protected static  LoginPage login;
	protected static EmployerFormPage employer;
	protected static EmployeePage employee;
	private static Logger log = LogManager.getLogger(Hooks.class);
 

	@Before
	
	public void beforeTest() throws InterruptedException, IOException {
		
				
    	driver = BrowserFactory.browserinvoke("chrome"); 
    	log.info("Launching chrome browser");
    	log.warn("Hey this just a warning message");
		log.fatal("hey this is just fatal error message");
		log.debug("this is debug message");
   
    	Thread.sleep(5000);
    	
    }
	


     
     @After(order = 0)
     
     public void after() {
    	 
    	 //driver.quit();
    	 log.info("Closing the browser");
    	 
    	 
     }
     
     @After(order = 1)
 	public void addScreenshot(Scenario scenario) throws IOException {
 		  File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 		  byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
 		  scenario.attach(fileContent, "image/png", "screenshot");
 		
 	}

    

}
