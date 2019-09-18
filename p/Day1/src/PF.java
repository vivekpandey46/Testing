import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PF {
	
	@FindBy(xpath = "//input[@name='uid']") WebElement uname;
	
	
	@FindBy(xpath = "//input[@name='password']") WebElement pwd;
	

	@BeforeMethod
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	@Test
	public void test1()
	{
		

		uname.sendKeys("Vivek");
		pwd.sendKeys("Vivek");
	}

}
