package com.mst.advance.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mst.advance.automation.abstractclass.DriverClass;

public class EmployeePage extends DriverClass {
	
	
	public EmployeePage(WebDriver driver) {
		super(driver);
		
	}
	
	By txt_ssn = By.xpath("//input[@id='input-41']");
	
	By btn_next = By.xpath("//button[text() = 'Next']");
	
	By select_otherEmployment = By.xpath("//button[@name = 'Any_other_Employment__c']");
	
	By select_federalIncomeTax = By.xpath("//button[@name = 'Federal_income_tax_withheld__c']");
	
	By btn_sectionBNext = By.xpath("//button[text() = 'Next']");
	
	By txt_birthDate = By.xpath("//input[@name = 'Birth_Date__c']");
	
	By select_gender = By.xpath("//button[@name ='Gender__c']");
	
	By select_SSNName = By.xpath("//button[@name = 'Same_Name_as_SSN__c']");
	
	By txt_mailingAddress = By.xpath("//input[@name = 'MailingAddress__c']");
	
	By txt_city = By.xpath("//input[@name = 'Claimant_City__c']");
	
	By select_state = By.xpath("//button[@name = 'Claimant_State__c']");
	
	By txt_zipCode = By.xpath("//input[@name = 'Claimant_Zip_Code__c']");
	
	By txt_phoneNumber = By.xpath("//input[@name = 'Claimant_Phone__c']");
	
	By select_sameMailingAdddress = By.xpath("//button[@name = 'Same_as_Mailing_Address__c']");
	
	By select_unemploymentClaim = By.xpath("//button[@name = 'Previous_Claim_Unemployment_Disability__c']");
	
	By select_federalGovernment = By.xpath("//button[@name = 'Worked_in_Federal_Served_in_Military__c']");
	
	By select_workInOtherState = By.xpath("//button[@name = 'Worked_in_any_other_state__c']");
	
	By select_unemploymentInsurance = By.xpath("//button[@name = 'Applied_for_benefits_in_other_state__c']");
	
	By select_drivingLicense = By.xpath("//button[@name = 'Do_you_have_a_driver_license_or_ID_card__c']");
	
	By select_otherCitizen = By.xpath("//button[@name = 'Are_you_a_U_S_citizen_or_national__c']");
	
	By select_pension = By.xpath("//button[@name = 'Receiving_Pension_other_than_SS_Railway__c']");
	
	By btn_addEmployer = By.xpath("//button[@title = 'Add Employer']");
	
	By txt_employerName = By.xpath("//input[@name='Name']");
	
	By select_payCycle = By.xpath("//button[@name = 'Payment_Cycle__c']");
	
	By txt_earnings = By.xpath("//input[@name = 'Earnings__c']");
	
	By txt_startDate = By.xpath("//input[@name = 'Start_Date__c']");
	
	By txt_endDate = By.xpath("//input[@name = 'End_Date__c']");
	
	By btn_submit = By.xpath("//button[@name = 'Save']");
	
	By txt_longestWorkedEmployer = By.xpath("//input[@name = 'Longest_worked_Employer_Name__c']");
	
	By select_sectorOfEmployer = By.xpath("//button[@name = 'Select_the_sector_best_describe_employer__c']");
	
	By select_businessCategory = By.xpath("//button[@name = 'Business_Category__c']");
	
	By select_businessType = By.xpath("//button[@name = 'Typeof_Work__c']");
	
	By txt_workingDays = By.xpath("//input[@name = 'How_Long_did_you_work_for_this_employer__c']");
	
	By select_corporateOfficer = By.xpath("//button[@name = 'Officer_of_Corp_Stockholder__c']");
	
	By select_workersCompensation = By.xpath("//button[@name = 'Receiving_Expecting_workers_comp__c']");
	
	By select_writtenLanguagePreference = By.xpath("//button[@name = 'Preferred_written_material_Eng_Spanish__c']");
	
	By select_spokenLanguagePreference = By.xpath("//button[@name = 'What_is_your_preferred_spoken_language__c']");
	
	By select_claimForAWeek = By.xpath("//button[@name = 'want_claim_to_be_filed_a_week_later__c']");
	
	By select_race = By.xpath("//button[@name = 'Race_Ethnic__c']");
	
	By select_anyDisability = By.xpath("//button[@name = 'Disability__c']");
	
	By select_acknowledgement = By.xpath("/html/body/div[3]/div[2]/div/div[3]/div/div/c-form4511-employee/c-form4511-cliament-information-one/div[3]/lightning-record-edit-form/lightning-record-edit-form-create/form/slot/slot/div[1]/lightning-layout[21]/slot/div/lightning-card/article/div[2]/slot/div/div/div[1]/lightning-input/div/span/label/span[1]");
	
	By txt_nameOfSignee = By.xpath("//input[@name = 'Printed_Name_of_Signee__c']");
	
	By btn_finalSubmit = By.xpath("//button[@name = 'Submit']");
	
	By txt_message = By.xpath("//h2[contains(text(),'Confirmation - Your Form Has Been Submitted')]");
	
	
	
	
	public void enterSSN(String employeeSSN) throws InterruptedException {
		
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);
		driver.findElement(txt_ssn).sendKeys(employeeSSN);
	}
	
	public void clickNext() {
		
		driver.findElement(btn_next).click();
	}
	
	public void otheremployment() throws InterruptedException {
		
		WebElement element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_otherEmployment));
		element.click();
		act.sendKeys("No").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
	}
	
	public void federalIncomeTax() throws InterruptedException {
		
		WebElement elementOne = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_federalIncomeTax));
		elementOne.click();
		act.sendKeys("No").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
	}
	
	public void nextButton() {
		
		driver.findElement(btn_sectionBNext).click();
	}
	
	public void birthDate(String employeeBirthDate) {
		
		driver.findElement(txt_birthDate).sendKeys(employeeBirthDate);
	}
	
	public void gender() throws InterruptedException {
		
		WebElement elementTwo = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_gender));
		elementTwo.click();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
	}
	
	public void SSNName() throws InterruptedException {
		
		WebElement elementTwo = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_SSNName));
		elementTwo.click();
		act.sendKeys("Yes").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void mailingAddress(String employeeMailingAddress) {
		

		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(txt_mailingAddress).sendKeys(employeeMailingAddress);
	}
	
	public void mailingCity(String employeeMailingCity) {
		
		driver.findElement(txt_city).sendKeys(employeeMailingCity);
		
	}
	
	public void mailingState() throws InterruptedException {
		
		WebElement elementThree = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_state));
		elementThree.click();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void zipcode(String zipCode) {
		
		driver.findElement(txt_zipCode).sendKeys(zipCode);
	}
	
	public void phoneNumber(String phoneNumber) {
		
		driver.findElement(txt_phoneNumber).sendKeys(phoneNumber);
	}
	
	public void sameMailingAddress() throws InterruptedException {
		
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		WebElement elementFour = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_sameMailingAdddress));
		elementFour.click();
		Thread.sleep(2000);
		act.sendKeys("Yes").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();

		
	}
	
	public void unemploymentClaim() throws InterruptedException {
		
		WebElement elementFive = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_unemploymentClaim));
		elementFive.click();
		Thread.sleep(2000);
		act.sendKeys("No").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	
	public void workForTheFederalGovernment() throws InterruptedException {
		
		WebElement elementSix = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_federalGovernment));
		elementSix.click();
		act.sendKeys("Yes").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
	}
	
	public void workInOtherState() throws InterruptedException {
		
		WebElement elementSeven = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_workInOtherState));
		elementSeven.click();
		act.sendKeys("No").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}
	

	public void unemploymentInsurance() throws InterruptedException {
		
		WebElement elementEight = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_unemploymentInsurance));
		elementEight.click();
		act.sendKeys("No").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void drivingLicense() throws InterruptedException {
		
		WebElement elementNine = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_drivingLicense));
		elementNine.click();
		Thread.sleep(2000);
		act.sendKeys("No").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("No driving license");
		
	}
	
	public void otherCitizen() throws InterruptedException {
		
		System.out.println("US citizen");
		
		WebElement elementNine = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_otherCitizen));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", elementNine);
		elementNine.click();
		act.sendKeys("Yes").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		
	}
	
	public void receivingPensionOtherThanWages() throws InterruptedException {
		
		WebElement elementTen = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_pension));
		elementTen.click();
		act.sendKeys("No").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void addEmployer() {
		
		WebElement addEmployer = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(btn_addEmployer));
		addEmployer.click();
		
		
	}
	
	public void employerName(String employerName) {
		
		driver.findElement(txt_employerName).sendKeys(employerName);
	}
	
	public void paycycle() {
		
		driver.findElement(select_payCycle).click();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void earnings(String earnings) {
		
		driver.findElement(txt_earnings).sendKeys(earnings);
	}
	
	public void dates(String startDate, String endDate) {
		
		driver.findElement(txt_startDate).sendKeys(startDate);
		driver.findElement(txt_endDate).sendKeys(endDate);
	}
	
	public void clickSubmit() {
		
		driver.findElement(btn_submit).click();
	}
	
	public void longestWorkedEmployer(String longestWorkedEmployerName) {
		
		driver.findElement(txt_longestWorkedEmployer).sendKeys(longestWorkedEmployerName);
	}
	
	public void SectorOfEmployer() throws InterruptedException {
		
		WebElement sector = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_sectorOfEmployer));
		sector.click();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		
	}

	public void businessCategory() throws InterruptedException {
		
		WebElement businesscategory = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_businessCategory));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",businesscategory );
		businesscategory.click();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void businessType() throws InterruptedException {
		
		WebElement businesstype = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_businessType));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",businesstype);
		businesstype.click();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		
	}
	
	public void workingDays(String workingDays) {
		
		driver.findElement(txt_workingDays).sendKeys(workingDays);
	}
	
	public void corporateOfficer() throws InterruptedException {
		
		WebElement corporateofficer = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_corporateOfficer));
		corporateofficer.click();
		Thread.sleep(1000);
		act.sendKeys("No").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
	}
	
	public void workerCompensation() throws InterruptedException {
		
		WebElement compensation  = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_workersCompensation));
		compensation.click();
		Thread.sleep(1000);
		act.sendKeys("No").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void writtenLanguagePreference() {
		
		WebElement writtenLanguagePreference  = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_writtenLanguagePreference));
		writtenLanguagePreference.click();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
	}
	
	public void spokenLanguagePreference() {
		
		WebElement spokenLanguagePreference  = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_spokenLanguagePreference));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",spokenLanguagePreference);
		spokenLanguagePreference.click();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void claimForAWeek() {
		
		WebElement claim  = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_claimForAWeek));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",claim);
		claim.click();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
	}
	
	public void employeeRace() {
		
		WebElement race  = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_race));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",race);
		race.click();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
	}
	
	public void employeeDisability() {
		
		WebElement employeeDisability  = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(select_anyDisability));
		employeeDisability.click();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
	}
	
	public void acknowledgement() {
		
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(select_acknowledgement).click();
		
	}
	
	public void NameOfTheSignee(String nameOfTheSignee) {
		
		driver.findElement(txt_nameOfSignee).sendKeys(nameOfTheSignee);
	}
	
	public void clickFinalSubmit() throws InterruptedException {
		
		driver.findElement(btn_finalSubmit).click();
		
		Thread.sleep(10000);
		WebElement successMessage = driver.findElement(txt_message);
		String expectedText = "Confirmation - Your Form Has Been Submitted";
		String actualText = successMessage.getText();
		System.out.println(actualText);
		Assert.assertEquals(expectedText, actualText);
		
	}
	
	
	
	
}
