import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Right_Click {

	public static  void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.google.com/");
		
		Actions action = new Actions(driver);
		
		WebElement rightclick=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
		
		action.contextClick(rightclick).build().perform();
		
		
		System.out.println("Success fully worked right click");
	
		
	}

}
