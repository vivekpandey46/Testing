import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CalanderHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("vivekpandey");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("vivek46");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		System.out.println("Success");
		
		String date = "3/July/2018";
		
		String dateArray[] = date.split("/");
		
		String day = dateArray[0];
		String month = dateArray[1];
		String year = dateArray[2];
		
		
		org.openqa.selenium.support.ui.Select select  = new Select(driver.findElement(By.xpath("//*[@name = 'slctMonth']"))); 
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.xpath("//*[@name = 'slctYear']")));
		select1.selectByVisibleText(year);
		
		driver.findElement(By.xpath("//td[contains(text(),'"+day+"')]")).click(); 		
		
	}

}
