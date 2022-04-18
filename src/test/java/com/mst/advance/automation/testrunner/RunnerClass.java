package com.mst.advance.automation.testrunner;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions( features= {"C:\\Users\\MSTSYS\\eclipse-workspace\\AdvanceLevelAutomation\\Featurefile"},glue = {"stepDefinition"},plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, tags = "@SmokeSuite", monochrome = true, publish = true)

public class RunnerClass extends AbstractTestNGCucumberTests {
   
	
	
}
