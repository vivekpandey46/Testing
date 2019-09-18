import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class IsEnable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/register/");
		
		
System.out.println("========================IsDisplayed=====================");
		boolean b = driver.findElement(By.id("submitButton")).isDisplayed();
		
		
		System.out.println(b);
		
System.out.println("========================IsEnable=====================");		
		boolean b1 = driver.findElement(By.id("submitButton")).isEnabled();
		
		
		
		System.out.println(b1);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		
		System.out.println(b2);
		
System.out.println("========================IsSelected=====================");

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean b3 = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		
		System.out.println(b3);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		boolean b4 = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		
		System.out.println(b4);
		driver.close();
		
		System.out.println("Test Case Execution Done");

	}

}
