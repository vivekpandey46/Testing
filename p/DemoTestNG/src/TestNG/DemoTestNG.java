package TestNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNG {
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void BeforeMthods()
	{
		
		System.out.println("Before Mehtods");
		
	}
	
	@Test(priority=1)
	public void test1()
	{
		System.out.println("Test1");
		
		
	}
	
	@Test(priority=2)
	public void test2()
	{
		System.out.println("Test2");
	}
	
	@Test(priority=3)
	public void test3()
	{
		System.out.println("Test3");
	}
	@AfterMethod
	public void AfterMthod()
	{
		System.out.println("After Mthods");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After Test");
	}
//	@AfterSuite
//	public void AfterSuite()
//	{
//		System.out.println("After Suite");
//	}
}
