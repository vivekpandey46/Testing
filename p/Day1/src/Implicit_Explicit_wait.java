import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Implicit_Explicit_wait {

	public static void main(String[] args) {
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		/*Implicit Wait*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
/*Explicit Wait*/		
		WebDriverWait wait= new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id=':ya']/div/div")));
		
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		
		driver.close();
		
		

		

	}

}
