package Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.*; 

public class AppListener implements ITestListener
{
	
	WebDriver driver; 
	
	public void onSuccess(ITestResult test)
	{
		System.out.println("Test Passed");
	}
	
	public void onFailure(ITestResult test)
	{
		File scrFile = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File desFile = new File("Failue.PNG");
		
		try {
			FileHandler.copy(scrFile, desFile);
		} catch(Exception e)
		{
			e.getMessage();
		}
	}
}
