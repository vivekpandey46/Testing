package TestNGRetry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Analyzer implements IRetryAnalyzer {

	int counter=0;
	int retry = 3;
	
	public boolean retry(ITestResult result) {
	
		if(counter<retry)
		{
			counter ++;
			return true;
		}
		
		return false;
	}
	

}
