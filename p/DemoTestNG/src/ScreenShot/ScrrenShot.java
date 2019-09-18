package ScreenShot;


import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListner.class)
public class ScrrenShot extends Base{

	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	
	@Test(priority = 1)
	public void takeScreenshot()
	{
		Assert.assertEquals(true, false);
	}
	@Test(priority = 2)
	public void takeScreenshot1()
	
	{
		Assert.assertEquals(true, false);
	}
	
}
