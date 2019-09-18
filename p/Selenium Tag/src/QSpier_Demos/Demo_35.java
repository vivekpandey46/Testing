package QSpier_Demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.facebook.com/");
		
		
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9066368762");
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("vivekpandey");
		
		System.out.println("Done");

	}

}
