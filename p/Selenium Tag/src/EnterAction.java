import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=-sAbWursEIXy8Af01Z7QDQ");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.RIGHT);
		
		System.out.println("Success");
		
		
	}

}
