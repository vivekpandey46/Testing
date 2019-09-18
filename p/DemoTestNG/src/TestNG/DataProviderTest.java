package TestNG;

import org.testng.annotations.Test;


public class DataProviderTest {

	@Test(dataProvider = "DataProvider")
	public void Test1(String Uname)
	{
		
System.out.println(Uname);
	}
	
	@Test(dataProvider = "DataProvider")
	public void Test2(String Uname)
	{
	
		System.out.println(Uname);

	}
	
	@org.testng.annotations.DataProvider
	public Object[] DataProvider()
	{
		Object[] obj = new Object[1];
//		obj[0][0]= "User1";
//		obj[0][1]="Pass1";
//		obj[1][0]="User2";
//		obj[1][1]="Pass2";
//		obj[2][0]="User3";
//		obj[2][1]="Pass3";
//		obj[3][0]="USer4";
//		obj[3][1]="PAss4";
		
		obj[0]="Vivek";
		
		
		return obj;
		
		
	}
}
