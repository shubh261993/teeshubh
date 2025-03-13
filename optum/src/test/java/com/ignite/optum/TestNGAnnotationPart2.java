package com.ignite.optum;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAnnotationPart2 {
	
	@Test
	@Parameters({"browser"})
	public void testAnn1(String browser)
	{
		switch(browser)
		{
		case "Chrome":
			
				WebDriverManager.chromedriver().setup();
				break;
		case "Edge":
			
				WebDriverManager.edgedriver().setup();
				break;
		}
	
	}
	
	@Test
	public void testAnn2()
	{
		System.out.println("Test2");
	}

}
