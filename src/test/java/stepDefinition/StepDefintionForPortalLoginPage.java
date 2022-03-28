package stepDefinition;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mst.advance.automation.browserfactory.BrowserFactory;
import com.mst.advance.automation.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;


public class StepDefintionForPortalLoginPage extends BrowserFactory {
	
    private static Logger log = LogManager.getLogger(StepDefintionForPortalLoginPage.class);
    
	
    @Severity(SeverityLevel.MINOR)	
	@Description("Verify Login functionality of the portal........")
	@Epic("EP001")
	@Feature("Feature1: Login")
	@Story("Story:Login functionality")
	@Step("Verify whether user is able to login to the community portal")
    
    @Given("^user navigate to community url$")
	public void user_navigate_to_community_url() {
		
		        
    	login = new LoginPage(driver);
    	login.navigateCommunity();
	    
		log.info("User is on the portal page");
	   
	}
    

	
	@When("user enters the username as {string} and password as {string}")
	public void user_enters_the_username_and_password(String userName, String password) throws InterruptedException {
		
		
		
		Thread.sleep(5000);
		login.enterUsername(userName);
		Thread.sleep(3000);
		login.enterPassword(password);
		
	   
	    
	}
	
	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() {
		 
		
		login.clickLogin();
		log.info("User got logged in");
		
		
	 }


}
