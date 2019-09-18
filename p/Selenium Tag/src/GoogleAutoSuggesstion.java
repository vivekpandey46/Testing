import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleAutoSuggesstion {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role ='listbox']//li/descendant::div[@class = 'sbtc']"));
		
//		System.out.println(list.size());
//		for(int i = 0;i<list.size();i++)
//		{
//			System.out.println(list.get(i).getText());
//			if(list.get(i).getText().contains("selenium tutorial"))
//			{
//				list.get(i).click();
//				break;
//			}
//		}

		Iterator<WebElement> str = list.iterator();
		
		while(str.hasNext())
		{
			System.out.println(str.next().getText());
		}
		

	}

}
