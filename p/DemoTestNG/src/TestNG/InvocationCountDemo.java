package TestNG;

import org.testng.annotations.Test;

public class InvocationCountDemo {
	
	@Test(invocationCount = 10)
	public void Invocation()
	{
		System.out.println("Invocation TestNG Testing");
	}

}
