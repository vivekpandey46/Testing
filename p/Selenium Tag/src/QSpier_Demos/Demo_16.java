package QSpier_Demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("file:///C:/Users/pandevi/Desktop/Demo.html");
		
		
		String title = driver.getTitle();
		
		if (title.equals("/C:/Users/pandevi/Desktop/Demo.htm"))
		{
			System.out.println("Title is" + title);
		}
		else 
		{
			System.out.println("Its not google Page");
		}
		
		String url = driver.getCurrentUrl();

		if (url.contains("file:///C:/Users/pandevi/Desktop/Demo.html"))
		{
			System.out.println("Its Google URL");
		}
		
		else
		{
			System.out.println("not a google URL");
		}
	}

}
