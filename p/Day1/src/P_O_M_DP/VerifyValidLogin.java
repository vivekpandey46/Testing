package P_O_M_DP;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
 
public class VerifyValidLogin 
{
 
 
@Test
public void checkValidUser()
{
 
// This will launch browser and specific url 

	System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("http://demosite.center/wordpress/wp-login.php");
	
 
// Created Page Object using Page Factory
LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
 

// Call the method
login_page.login_wordpress("admin", "demo123");
 
	}
 
}