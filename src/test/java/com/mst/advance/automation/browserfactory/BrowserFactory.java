package com.mst.advance.automation.browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.mst.advance.automation.pages.EmployeePage;
import com.mst.advance.automation.pages.EmployerFormPage;
import com.mst.advance.automation.pages.LoginPage;
import com.mst.advance.automation.utilsclass.EmailUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	protected LoginPage login;
	protected static EmployerFormPage employer;
	protected static EmployeePage employee;
	protected static WebDriver driver;
	protected static EmailUtils emailUtils;
	
	public static WebDriver browserinvoke(String browser) {

		System.out.println("browser value is: " + browser);

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		} else if (browser.equals("internetexplorer")) {
			WebDriverManager.iedriver().setup();        
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			
		} else {
			System.out.println("Please pass the correct browser value: " + browser);
		}

		
		return driver;

	}
	

}
