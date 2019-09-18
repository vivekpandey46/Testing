import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class AmazonPriceFetch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-shopall']"))).build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'TV, Appliances, Electronics')]"))).build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'DSLR Cameras')]"))).build().perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'DSLR Cameras')]")).click();
		
		
		
		driver.findElement(By.xpath("//input[@name='s-ref-checkbox-Nikon']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@name='sort']")));
		
		sel.selectByVisibleText("Newest Arrivals");
		
		String price = driver.findElement(By.xpath("//span[@class='a-size-base a-color-price s-price a-text-bold']")).getAttribute("innerText");
		
		System.out.println("Price is " +price);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
