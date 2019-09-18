

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=bNsiWpvsKsb08wediKyAAw&gws_rd=ssl");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[2]")).click();
		
		

		//For Scroll Down
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		
		driver.findElement(By.xpath(".//*[@id='archive-list']/li[5]/div[1]/div[1]/a/img")).click();
		
		driver.close();
		
		System.out.println("Success");

	}

}
