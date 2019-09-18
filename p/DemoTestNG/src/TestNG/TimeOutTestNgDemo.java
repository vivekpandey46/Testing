package TestNG;

import org.testng.annotations.Test;

public class TimeOutTestNgDemo {
	
	@Test(timeOut=2000)
	public void timeout()
	{
		System.out.println("Time Out Testing");
		
		for (int i=1000;i>1;i++)
		{
			System.out.println(1);
		}
	}

}
