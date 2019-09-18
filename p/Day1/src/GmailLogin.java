import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailLogin {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.xpath(".//*[@id='login_Layer']")).click();
		
		driver.findElement(By.xpath("//*[@id='eLogin']")).sendKeys("engineervpandey@gmail.com");
		driver.findElement(By.xpath("//*[@id='pLogin']")).sendKeys("");
		driver.findElement(By.xpath("//*[@id='lgnFrm']/div[8]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.findElement(By.xpath("//*[@id='colL']/div[2]/div[1]/a[1]")).click();
		
		driver.findElement(By.xpath("//*[@id='rPanel']/div/div[1]/div[2]/h1/a")).click();
		
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Vivek Pandey");
		
		driver.findElement(By.xpath(".//*[@id='rPanel']/div/div/form/div[5]/div/button")).click();
		
		
		
	}

}
