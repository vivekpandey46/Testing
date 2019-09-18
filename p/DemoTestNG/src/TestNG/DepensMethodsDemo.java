package TestNG;

import org.testng.annotations.Test;

public class DepensMethodsDemo {
	
	@Test(priority=1)
	public void DependsMethods()
	{
		System.out.println("First Mehtods");
		
		int i=9/0;
	}
	
	@Test(dependsOnMethods = "DependsMethods")
	public void DepndsMethod1()
	{
		System.out.println("Second Method");
	}

}
