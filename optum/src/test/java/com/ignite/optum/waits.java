package com.ignite.optum;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waits {
	
	public WebDriver driver;
	public Wait wait;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	
	@Test
	public void fluentsWait()
	{
		try {
		driver.get("https://www.flipkart.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return document.readyState").equals("complete");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='menu-main-menu']/li[4]/a")));
		//String text = driver.findElement(By.xpath("//ul[@id='mobile_menu1']/li[4]/a")).getText();
		//System.out.println(text);
		//wait = new FluentWait(driver)
		//.withTimeout(Duration.ofSeconds(30))
		//.pollingEvery(Duration.ofSeconds(5))
		//.ignoring(NoSuchElementException.class);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='menu-main-menu']/li[4]/a")));
		//driver.findElement(By.xpath("//ul[@id='menu-main-menu']/li[4]/a")).click();
		//Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='_16rZTH']"));
		//System.out.println(list);
		for(WebElement w : list)
		{
			//String k = w.getText();
			System.out.println(w.getText());
		}
		
//		String text2 = driver.findElement(By.xpath("(//ul[@class='sub-menu'])[1]/li[2]")).getText();
//		System.out.println(text2);
//		String title = driver.getTitle();
//		System.out.println(title);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		driver.close();
	}

}
