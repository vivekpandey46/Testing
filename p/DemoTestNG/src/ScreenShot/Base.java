package ScreenShot;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base {
	
	public static WebDriver driver;
	
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	
	public void failed()
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try{
		FileUtils.copyFile(scr, new File("C:\\Users\\pandevi\\Desktop\\CA Claro\\testfile.jpg"));
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
