package QSpier_Demos;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.facebook.com/");
		
		WebElement em = driver.findElement(By.xpath("//input[@id='pass']"));
		
		org.openqa.selenium.Dimension s= em.getSize();
		
		System.out.println(s.getHeight());
		System.out.println(s.getWidth());
		
		

	}

}
