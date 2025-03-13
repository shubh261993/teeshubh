package com.ignite.optum;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//beforeTest
//before method test
//Test1
//before method test
//test2
// suite, test, class, method, test
public class TestNGAnnotation {
	
	
	@BeforeMethod()
	public void beforeMethod()
	{
		System.out.println("Before Method Test");
	}
	
	@BeforeTest()
	public void beforetest()
	{
		System.out.println("Before Test");
	}
	
	@Test()
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test()
	public void test2()
	{
		System.out.println("Test2");
	}
	
	
	
	
//	
//	@Test(groups={"smoke"},description="I am simple test case")
//	public void simple()
//	{
//		System.out.println("Test simple");	 
//	}
//	
////	@Test(dependsOnMethods= {"simple2"},timeOut=200)
////	public void simple2()
////	{
////		System.out.println("Test simple2");	 
////	}
////	
//	@Test(groups={"smoke"},invocationCount=3,enabled = false)
//	public void simple3()
//	{
//		System.out.println("Test simple3");	 
//	}
//	
	
	

}
