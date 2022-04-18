package com.mst.advance.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SalesforceRecordPage {
	WebDriver driver;
	 public  void record() throws InterruptedException {
		
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("janehepsiba.a@edd.ca.gov.edddqa1");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("janeselvi@1709");
		 driver.findElement(By.xpath("//input[@id='Login']"));
		 
		 Thread.sleep(15000);
		 
		 driver.findElement(By.xpath("//header/div[2]/div[2]/div[1]/button[1]")).sendKeys("283931212");
		 Actions act = new Actions(driver);
		 act.sendKeys(Keys.ENTER).build().perform();
		 
		 driver.findElement(By.linkText("Britto Anchello")).click();
		 driver.findElement(By.xpath("//a[text()='Related']")).click();
		 
		 driver.findElement(By.xpath("//tbody/tr[1]/th[1]/lightning-primitive-cell-factory[1]/span[1]/div[1]/lightning-primitive-custom-cell[1]/force-lookup[1]/div[1]/records-hoverable-link[1]/div[1]/a[1]/slot[1]/slot[1]/span[1]")).click();
		 driver.findElement(By.xpath("//button[@name='Claim__c.Generate_PDF']")).click();
		 Thread.sleep(15000);
		 
		 driver.findElement(By.xpath("//a[text()='Additional Form Information']")).click();
		 driver.findElement(By.xpath("//a[@title='DE_4511WS.pdf']")).click();
		 
		
		 
	 }

}
