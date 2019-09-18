package MavenCode.MavenCode;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;

public class TestCase1 {
	
	WebDriver driver;
	
	org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(TestCase1.class);
	
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		log.info("++++++++++++++++++++++++++++++++++Lunched Chrome Browser++++++++++++++++++++++++++++++++++++++++++++");
		
	}
	@Test
	public void Test1()
	{
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		log.fatal("++++++++++++++++++++++++++++++++++++++++Fired Google URL+++++++++++++++++++++++++++++++++++++++++");
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
		
		log.debug("+++++++++++++++++++++++++++++++++++++++Closing the Browser++++++++++++++++++++++++++++++++++++++++");
	}

}
