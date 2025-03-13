package com.ignite.optum;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserstack {
	WebDriver driver;
	

	
	@BeforeMethod()
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/read-data-from-excel-using-selenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@Test()
	public void login()
	{
		POMwithPageFactory obj = new POMwithPageFactory(driver);
		obj.clickGetStartedButton();
		
			//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		obj.setFullName("Shubham Mittal");
		obj.setEmail("shubham@gmail.com");
		obj.setPassword("As123");
		
		String fullname = obj.getFullName();
		System.out.println(fullname);
		driver.close();
		
	}

}
