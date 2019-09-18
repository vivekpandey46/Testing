import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class HeadLessBrowser {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("window-size =1400,800");
		option.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(option);	
		
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		System.out.println("Success");
		
		System.out.println(driver.getTitle());
		
	}

}
