import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AuthenticationPoppup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Vivek//Selenium//chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth/");
		Thread.sleep(5000);
		
	}

}
