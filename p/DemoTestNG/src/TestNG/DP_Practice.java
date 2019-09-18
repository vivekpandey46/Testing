package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_Practice {
	
	
	@Test (dataProvider = "TestData")
	public void T1(String a, String b)
	{
		System.out.println(a +" "+b);
				
	}
			
	
	@DataProvider(name  = "TestData")
	
	public Object[][] dp()
	{
		Object[][] obj = new Object[2][2];
		
		obj[0][0] = "Vivek";
		obj[0][1] = "Pandey";
		
		obj[1][0] = "Vicky";
		obj[1][1] = "Kumar";
		
		
		return obj;
		
	}

}
