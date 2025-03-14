package com.ignite.optum;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Annotatio3 {
		
	@Test(invocationCount = 2)
	public void count()
	{
		System.out.println("Hello");
	}
	
	@Test()
	public void test2()
	{
		Assert.assertEquals("abc", "abc");;
		System.out.println("Test2 Passed sucessfully");
	}
	
	@Test(dependsOnMethods = {"test2"})	
	public void test3()
	{
		System.out.println("Test3 Passed sucessfully");
	}
	
	
	
	
	@Test(groups = "smoke")
	public void group()
	{
		System.out.println("I m groups");
	}
}
