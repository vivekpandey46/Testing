package QSpier_Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.facebook.com/");
		
		WebElement logo = driver.findElement(By.xpath("//i[@class='fb_logo img sp_DY93Eu6Ccry sx_c84875]"));
		
		if (logo.isDisplayed())
		{
			System.out.println("Logo Displayed");
		}
		
		else 
		{
			System.out.println("Logo not Displayed");
		}

	}

}
