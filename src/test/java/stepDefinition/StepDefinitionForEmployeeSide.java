package stepDefinition;

import javax.mail.Message;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.mst.advance.automation.browserfactory.BrowserFactory;
import com.mst.advance.automation.pages.EmployeePage;
import com.mst.advance.automation.testrunner.RunnerClass;
import com.mst.advance.automation.utilsclass.EmailUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;



public class StepDefinitionForEmployeeSide extends BrowserFactory {
	
//	public WebDriver driver ;
//	EmployeePage employee;
	//private static EmailUtils emailUtils;
	
	@Severity(SeverityLevel.MINOR)	
	@Description("Verify the employee is able to complete the 4511 form........")
	@Epic("EP003")
	@Feature("Feature1: 4511 from employee side")
	@Step("Verify whether user is able to complete the 4511 form from employee side")
	
	@Then("^User receives the email and submits 4511$")
	public void user_receives_the_email_and_submits_4511() throws InterruptedException {
		
		
			Thread.sleep(15000);
		    try {
		      emailUtils = new EmailUtils("janeautomationqa1799@gmail.com", "janeselvi@1799", "smtp.gmail.com", EmailUtils.EmailFolder.INBOX);
		    } catch (Exception e) {
		      e.printStackTrace();
		      Assert.fail(e.getMessage());
		    }
		  
		
		
	}
	
	@Then("^User clicks the link in the email and redirected to the portal page$")
	public void user_clicks_the_link_in_the_email_and_redirected_to_the_portal_page() {
		
	    
	    
	    try{
	      Message email = emailUtils.getMessagesBySubject("Sandbox: Initial Claim and Payment Certification", true,5)[0];
	      String link = emailUtils.getUrlsFromMessage(email, " complete your Initial Claim and Payment Certification").get(0);
	      System.out.println(link);
	      String newlink =link.replace("&amp;", "&");
	      System.out.println(newlink);
	      
	      driver.get(newlink);
	      Thread.sleep(5000);
	      
	      
	     
	    } catch (Exception e) {
	      e.printStackTrace();
	      Assert.fail(e.getMessage());
	    }
	  }
	
		
	
	
	@And("User enters the valid SSN as {string} and clicks next")
	public void user_enters_the_SSN_and_complete_the_Sectionb_in_the_employee_form(String ssnValue) throws InterruptedException {
		
		employee = new EmployeePage(driver);
		
		
		employee.enterSSN(ssnValue);
		employee.clickNext();
		Thread.sleep(2000);
		
	}
		
	@And("^User selects the value in sectionb and clicks next$")	
	public void user_selects_the_value_in_sectionb_and_clicks_next() throws InterruptedException {
		
		employee.otheremployment();
		
		employee.federalIncomeTax();

		employee.nextButton();
		Thread.sleep(2000);
		
	}
	
	@And("User enters the birthdate as {string} and selects the gender")
	public void user_enters_the_birthdate_as_and_selects_the_gender(String employeeBirthDate) throws InterruptedException {
		
		
		employee.birthDate(employeeBirthDate);
		
		employee.gender();
		Thread.sleep(3000);
	}
	
	@And("^User selects whether they have the same name as SSN name$") 
	public void user_selects_whether_they_have_the_same_name_as_SSN_name() throws InterruptedException {
		employee.SSNName();
		
		Thread.sleep(3000);
	}
	
	@And("User enters the value in mailingaddress as {string} and mailingcity as {string} and mailingstate and zipcode as {string} and phonenumber as {string}")
	public void user_enters_the_value_in_mailingaddress_as_and_mailingcity_as_and_mailingstate_and_zipcode_as_and_phonenumber_as(String employeeMailingAddress, String employeeMailingCity, String zipCode, String phoneNumber) throws InterruptedException {
		employee.mailingAddress(employeeMailingAddress);
		employee.mailingCity(employeeMailingCity);
		employee.mailingState();
		
		employee.zipcode(zipCode);
		employee.phoneNumber(phoneNumber);
	}
		
	@And("^User selects whether they have same mailingaddress as mentioned$")
	public void user_selects_whether_they_have_same_mailingaddress_as_mentioned() throws InterruptedException {
		
		Thread.sleep(3000);
		employee.sameMailingAddress();
		
	}
	
	@And("^User selects whether they have filed for an unemploymentclaim$")
	public void user_selects_whether_they_have_filed_for_an_unemploymentclaim() throws InterruptedException {
	     Thread.sleep(3000);
		employee.unemploymentClaim();
	}
	
	@And("^User selects whether they have worked for the federal government$")
	public void user_selects_whether_they_have_worked_for_the_federal_government() throws InterruptedException {
		
		Thread.sleep(3000);
		employee.workForTheFederalGovernment();
	}
	
	@And("^User selects whether they have worked in other state than california$")
	public void user_selects_whether_they_have_worked_in_other_state_than_california() throws InterruptedException {
		
		Thread.sleep(3000);
		employee.workInOtherState();
		
	}
		
	
	@And("^User selects whether they have filed for unemployment insurance$")
	public void user_selects_whether_they_have_filed_for_unemployment_insurance() throws InterruptedException {
		Thread.sleep(3000);
		employee.unemploymentInsurance();
		
	}
	
	@And("^User selects whether they have driving license$")
	public void user_selects_whether_they_have_driving_license() throws InterruptedException {
		
		Thread.sleep(3000);
		employee.drivingLicense();
	}
		
	
	@And("^User selects whether they belong to other state$")
	public void user_selects_whether_they_belong_to_other_state() throws InterruptedException {
		Thread.sleep(3000);
		employee.otherCitizen();
		
	}
	
	@And("^User selects whether they are receiving pension other than wages$")
	public void user_selects_whether_they_are_receiving_pension_other_than_wages() throws InterruptedException {
		
		Thread.sleep(3000);
		employee.receivingPensionOtherThanWages();
		
	}
	
	@And("User clicks the add employer button and gives the employer name as {string} and selects the paycycle and gives the earnings as {string} and gives the startdate as {string} and enddate as {string} and then clicks submit")
	public void user_clicks_the_add_employer_button_and_gives_the_employer_name_as_and_selects_the_paycycle_and_gives_the_earnings_as_and_gives_the_startdate_as_and_enddate_as_and_then_clicks_submit(String employerName, String earnings, String startDate, String endDate) throws InterruptedException {
		
		employee.addEmployer();
		Thread.sleep(3000);
		
		employee.employerName(employerName);
		
		employee.paycycle();
		
		
		employee.earnings(earnings);
		
		employee.dates(startDate,endDate);
		
		employee.clickSubmit();
	}
	
	@And("User selects to which employer the employee worked for the longest as {string}")
	public void user_selects_to_which_employer_the_employee_worked_for_the_longest_as(String longestWorkedEmployer) throws InterruptedException {
		Thread.sleep(2000);
		
		employee.longestWorkedEmployer(longestWorkedEmployer);
	}
	
	@And("^User selects the sector of the employer$")
	public void user_selects_the_sector_of_the_employer() throws InterruptedException {
		
		employee.SectorOfEmployer();
	}
	
	@And("^User selects the business category and business type of the employer$")
	public void user_selects_the_business_category_and_business_type_of_the_employer() throws InterruptedException {
		
		
		employee.businessCategory();
		
		employee.businessType();
		
	}
	
	@And("User enters the value in workingdays as {string}")
	public void user_enters_the_value_in_workingdays_as(String workingDays) {
		
		employee.workingDays(workingDays);
		
	}
	
	@And("^User selects whether they worked as corporate officer$")
	public void user_selects_whether_they_worked_as_corporate_officer() throws InterruptedException {
		
		employee.corporateOfficer();
		
	}
	
	@And("^User selects whether they have received the worker compensation$")
	public void user_selects_whether_they_have_received_the_worker_compensation() throws InterruptedException {
		
		employee.workerCompensation();
		
	}
	
	@And("^User selects the written language preference and spoken language preference$")
	public void user_selects_the_wriiten_language_preference_and_spoken_language_preference() {
		
		
		employee.writtenLanguagePreference();
	
		employee.spokenLanguagePreference();
	}
	
	@And("^User selects whether they have filed a claim for that week$")
	public void user_selects_whether_they_have_filed_a_claim_for_that_week() {
		
		employee.claimForAWeek();
	}
	
	@And("^User selects the race and whether they are disable or not$")
	public void user_selects_the_race_and_whether_they_are_disable_or_not() {
		
		employee.employeeRace();
		
		employee.employeeDisability();
	}
	
	@And("User checks the acknowledgement and enters the name of the signee as {string} and clicks submit")
	public void user_checks_the_acknowledgement_and_enters_the_name_of_the_signee_as_and_clicks_submit(String nameOfTheSignee) throws InterruptedException {
		
		
		employee.acknowledgement();
	
		employee.NameOfTheSignee(nameOfTheSignee);
		
		employee.clickFinalSubmit();
		
		
		
	}

}
