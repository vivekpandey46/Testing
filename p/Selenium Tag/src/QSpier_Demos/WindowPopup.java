package QSpier_Demos;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class WindowPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.linkText("Multi-PopUp Test")).click();
		
		java.util.Set<String>   st = driver.getWindowHandles();
		
		Iterator<String> it = st.iterator();
		
		while(it.hasNext()){
			
			
			
			driver.switchTo().window(it.next());
			
			System.out.println(driver.getTitle());

				
		}
//		String parent = it.next();
//		
//		System.out.println(parent);
//		
//		String child = it.next();
//		
//		System.out.println(child);
//		
//		
//		driver.switchTo().window(child);
//		
//		System.out.println(driver.getTitle());
//		
//		driver.close();
//		
//		
//		driver.switchTo().window(parent);
//		
//		
//		System.out.println(driver.getTitle());
//		
//		driver.close();
		

	}

}
