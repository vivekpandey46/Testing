import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class CE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("http://172.20.39.43:8080/ce-admin/login.htm");
		
		driver.findElement(By.xpath(".//*[@id='main']/form/div[1]/div/table/tbody/tr[1]/td/input")).sendKeys("MdxAdmin");
		driver.findElement(By.xpath(".//*[@id='main']/form/div[1]/div/table/tbody/tr[2]/td/input")).sendKeys("769Es$12");
		driver.findElement(By.xpath(".//*[@id='main']/form/div[1]/div/table/tbody/tr[3]/td/input")).click();
		
		try{
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		}
		
		catch(Exception e)
		{
			
		}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
		
		
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(".//*[@id='myslidemenu']/ul/li[2]/a"))).perform();
		
		
		driver.findElement(By.xpath(".//*[@id='myslidemenu']/ul/li[2]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='main']/div/form/div/div[4]/table/tbody/tr/td/input")).click();
		
		driver.findElement(By.xpath(".//*[@id='main']/div/form/div[1]/table/tbody/tr[1]/td[1]/input")).sendKeys("Docomooo");
		driver.findElement(By.xpath(".//*[@id='main']/div/form/div[1]/table/tbody/tr[1]/td[2]/input")).sendKeys("Docomooo");
		driver.findElement(By.xpath(".//*[@id='main']/div/form/div[1]/table/tbody/tr[2]/td[1]/input")).sendKeys("1234567890");
		driver.findElement(By.xpath(".//*[@id='main']/div/form/div[1]/table/tbody/tr[2]/td[2]/input")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath(".//*[@id='main']/div/form/div[1]/table/tbody/tr[7]/td[1]/label[1]")).click();
		driver.findElement(By.xpath(".//*[@id='cpTypeId']/td[1]/div/a/div/b")).click();
		driver.findElement(By.xpath(".//*[@id='cpTypeId']/td[1]/div/div/ul/li[2]")).click();
		driver.findElement(By.xpath(".//*[@id='cpTypeId']/td[2]/div/a/div/b")).click();
		driver.findElement(By.xpath(".//*[@id='cpTypeId']/td[2]/div/div/ul/li[2]")).click();
		driver.findElement(By.xpath(".//*[@id='cpTypeId2']/td[2]/input")).sendKeys("0");
		
		
		
		
		String text = driver.findElement(By.xpath(".//*[@id='header']/div[2]/span")).getText();
		
		System.out.println(text);
		System.out.println(driver.getTitle());
		
		//driver.close();
		
	}

}
