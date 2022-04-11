Feature: To submit the Initial Claim and Payment Certification for the employee
@SmokeSuite
Scenario: Login to the community portal with valid credentials
 Given user navigate to community url
 When user enters the username as "janeqaedd1+03@gmail.com" and password as "Janeeddproject@0003"
 Then user should be able to login
 
#Scenario: Click the start form of particular employee and complete the Initial claim form for that employee
#Given User is on the portal login page
#When User enters the username as "janeqaedd1+03@gmail.com" and password as "Janeeddproject@0003"
Then  User should click view employees and click the start form button for the particular employee
And  User enters the value in normalweeklywages as "500"
And  User enters the value in totalwagespaid as "200"
And  User selects the value in otherpay
And  User enters the value in totalhours as "40.00"
And  User selects the value in absenceofwork
And  User selects the value in refusalwork
And  User enters the value in  refusaldate as "Jan 28, 2022" and refusalhour as "2" and refusalreason as "NA"
And  User selects the value in holiday in the week
And  User submits the form by clicking the submit button
Then User is on the participating employees details page

#Scenario: Click the email link from the claimant email and complete the 4511 form
Then  User receives the email and submits 4511 
Then  User clicks the link in the email and redirected to the portal page
And   User enters the valid SSN as "283931212" and clicks next
And   User selects the value in sectionb and clicks next
And   User enters the birthdate as "Feb 15, 1993" and selects the gender
And   User selects whether they have the same name as SSN name
And   User enters the value in mailingaddress as "Testaddress134" and mailingcity as "testcity" and mailingstate and zipcode as "54321" and phonenumber as "9822213393"
And   User selects whether they have same mailingaddress as mentioned
And   User selects whether they have filed for an unemploymentclaim
And   User selects whether they have worked for the federal government 
And   User selects whether they have worked in other state than california
And   User selects whether they have filed for unemployment insurance
And   User selects whether they have driving license
And   User selects whether they belong to other state
And   User selects whether they are receiving pension other than wages
And   User clicks the add employer button and gives the employer name as "Techinfoland" and selects the paycycle and gives the earnings as "700" and gives the startdate as "Jul 5, 2021" and enddate as "Feb 27, 2022" and then clicks submit
And   User selects to which employer the employee worked for the longest as "Hyundai"
And   User selects the sector of the employer
And   User selects the business category and business type of the employer
And   User enters the value in workingdays as "5"
And   User selects whether they worked as corporate officer
And   User selects whether they have received the worker compensation
And   User selects the written language preference and spoken language preference
And   User selects whether they have filed a claim for that week
And   User selects the race and whether they are disable or not 
And   User checks the acknowledgement and enters the name of the signee as "John Abraham" and clicks submit

