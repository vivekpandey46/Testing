package com.crm.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	

	TestBase()
	{
		try{
		prop = new Properties();
		FileInputStream ip =new FileInputStream("C:/p/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
		
		prop.load(ip);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void intialization()
	{
			String browserName = prop.getProperty("browser");
			if (browserName.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			else {
				System.out.println("Given Browse will not support");
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
	}

}
