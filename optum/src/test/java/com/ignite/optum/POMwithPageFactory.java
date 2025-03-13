package com.ignite.optum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class POMwithPageFactory {
	
	WebDriver driver;
	
	public POMwithPageFactory(WebDriver driver)
	{
		this.driver = driver;
			PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@title='Get Started free']")
	WebElement getStartedButton;
	
	@FindBy(xpath = "//input[@id='user_full_name']")
	WebElement fullname;
	
	@FindBy(xpath = "//input[@id='user_email_login']")
	WebElement businessEmail;
	
	@FindBy(xpath = "//input[@id='user_password']")
	WebElement password;
	
	
	public void clickGetStartedButton()
	{	
		getStartedButton.click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Just a moment...");
		Assert.assertNotEquals(title,"Just a moment");
		Assert.assertTrue(false);
		Assert.assertFalse(false);
		Assert.assertNull(title);
		Assert.assertNotNull(title);
	}
	
	public void setFullName(String Fullname)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='user_full_name']")));
		fullname.sendKeys(Fullname);
		
		
	}
	
	public String getFullName()
	{
		return fullname.getText();
		
	}
	
	public void setEmail(String email)
	{
		businessEmail.sendKeys(email);
	}
	
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	
	

}
