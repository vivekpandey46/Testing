import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://www.popuptest.com/goodpopups.html");		
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();		
		java.util.Set<String> handler =driver.getWindowHandles();		
		java.util.Iterator<String> it = handler.iterator();		
		String parent  = it.next();		
		System.out.println(parent);		
		String Child = it.next();		
		System.out.println(Child);		
		driver.switchTo().window(Child);		
		System.out.println("Child Window POP UP title is "+driver.getTitle());				
		driver.close();	
		driver.switchTo().window(parent);		
		System.out.println("Parent Window POP UP title is "+driver.getTitle());
		driver.close();								
	}

}
