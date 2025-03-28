package com.ignite.optum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	WebDriver driver;
	
	@Test()
	public void assertVerify()
	{
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("abc", "abc");
		softAssert.assertNotEquals("abc", "abc");
		softAssert.assertNotEquals("abc", "abcd");
	    softAssert.assertAll();
	    
	    
//		driver.manage().timeouts().implicitlyWait(driver,Duration.ofSeconds(30));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
//		FluentWait wait = new FluentWait(driver);
//		wait.withTimeout(Durations.ofSeceonds(30));
//		wait.pollingEvery(5);
//		wait.ignoring(ElementNotFoundException);
//		
//		wait.until(ExpectedConditions.elementToBeClickable(null));
		
		
		
	}

}
