package stepDefinition;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.mst.advance.automation.browserfactory.BrowserFactory;
import com.mst.advance.automation.pages.EmployerFormPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;


public class StepDefintionFor4511Employerside extends BrowserFactory {
	
	
	@Severity(SeverityLevel.MINOR)	
	@Description("Verify the employer is able to complete the 4511 form........")
	@Epic("EP002")
	@Feature("Feature1: 4511 from employer side")
	@Step("Verify whether user is able to complete the 4511 form from employer side")
		
	@Then("^User should click view employees and click the start form button for the particular employee$") 
	public void user_should_click_view_employees_and_click_the_start_form_button_for_the_particular_employee() throws InterruptedException {
		
		employer = new EmployerFormPage(driver);
		Thread.sleep(20000);
	    employer.clickViewEmployees();
	    Thread.sleep(10000);
	    employer.startForm();
	    
	}
	
	@And("User enters the value in normalweeklywages as {string}")
	public void user_enters_the_value_in_the_initial_claim_form(String normalWeeklyWagesValue) throws InterruptedException {
		
		
		Thread.sleep(5000);
		employer.normalWeeklyWages(normalWeeklyWagesValue);
	}
	
	@And("User enters the value in totalwagespaid as {string}")
	public void user_enters_the_value_in_the_totalwagespaid(String totalWagesPaidValue) throws InterruptedException {
		
		Thread.sleep(3000);
		employer.totalWagesPaid(totalWagesPaidValue);
		Thread.sleep(2000);
	}
	
	@And("^User selects the value in otherpay$")
	public void user_selects_the_value_in_otherpay() throws InterruptedException {
		employer.otherPay();
		Thread.sleep(3000);
	}
	
	@And("User enters the value in totalhours as {string}")
	public void user_enters_the_value_in_totalhours(String totalHoursWorked) throws InterruptedException {

		employer.totalHours(totalHoursWorked);
		
		Thread.sleep(5000);
	}
	
	@And("^User selects the value in absenceofwork$")
	public void user_selects_the_value_in_absenceofwork() throws InterruptedException {
		employer.absenceOfWork();
		Thread.sleep(5000);
		
	}
		
	@And("^User selects the value in refusalwork$")
	public void user_selects_the_value_in_refusalwork() throws InterruptedException {
		
        employer.refusalOfWork();
        Thread.sleep(2000);
	}
	
	
	@And("User enters the value in  refusaldate as {string} and refusalhour as {string} and refusalreason as {string}")
	public void user_enters_the_value_in_refusaldate_as_and_refusalhour_as_and_refusalreason_as(String refusalDateValue, String refusalHourValue, String refusalReason) throws InterruptedException {
		employer.refusalDate(refusalDateValue);
		employer.refusalHour(refusalHourValue);
		employer.refusalReason(refusalReason);
		
        Thread.sleep(5000);
	}
		
	@And("^User selects the value in holiday in the week$")
	public void user_selects_the_value_in_holiday_in_the_week() throws InterruptedException {
		
		employer.holidayInTheWeek();
		Thread.sleep(2000);
		
		employer.acknowledgement();
		
		employer.nameOfSignee();
		employer.title();
		employer.telephoneNumber();
		
	    
	}
	
	@And("^User submits the form by clicking the submit button$")
	public void user_submits_the_form_by_clicking_the_submit_button() throws InterruptedException {
		
		Thread.sleep(3000);
		employer.clickSubmit();
		
		
	}
	
	

	@Then("User is on the participating employees details page")
	public void user_is_on_the_participating_employees_details_page() throws InterruptedException {
		
		
		System.out.println("User is on the employee details page");
	    Thread.sleep(2000);
	    
	}



}
