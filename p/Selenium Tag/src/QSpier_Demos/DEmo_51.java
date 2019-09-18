package QSpier_Demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEmo_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		WebElement el=driver.findElement(By.xpath("//input[@value='Log In']"));
		
		if (el.isEnabled())
		{
			System.out.println("Log In field enable");
		}
		
		else
		{
			System.out.println("Its Disable");
		}
		
		

}

}