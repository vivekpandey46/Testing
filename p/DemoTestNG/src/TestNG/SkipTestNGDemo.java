package TestNG;

import org.testng.annotations.Test;

public class SkipTestNGDemo {
	
	
	@Test
	public void SkipDemo()
	{
		System.out.println("First Method");
	}
	
	@Test(enabled=false)
	public void SkipDemo1()
	{
		System.out.println("Second Mthods");
	}

}
