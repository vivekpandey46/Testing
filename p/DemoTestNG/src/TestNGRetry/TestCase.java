package TestNGRetry;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestCase {
	
	@Test(retryAnalyzer = Analyzer.class)
	public void test1()
	{
		Assert.assertEquals(true , true);
	}
	
	

}
