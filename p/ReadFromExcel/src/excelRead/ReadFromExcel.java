package excelRead;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadFromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://172.20.39.115:8080/ce-admin/");
		
		File fl = new File("C:\\Users\\pandevi\\ExcelData\\TestData.xlsx");
		
		FileInputStream fis= new FileInputStream(fl);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
	
		String data=sheet1.getRow(0).getCell(0).getStringCellValue();
		String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		String data2=sheet1.getRow(1).getCell(0).getStringCellValue();
		String data3=sheet1.getRow(1).getCell(1).getStringCellValue();
		String data4=sheet1.getRow(2).getCell(0).getStringCellValue();
		
		
		WebElement web=driver.findElement(By.xpath(data));
		web.sendKeys(data1);
		
		WebElement web1=driver.findElement(By.xpath(data2));
		web1.sendKeys(data3);
		
		WebElement web2=driver.findElement(By.xpath(data4));
		web2.click();
		
		
		
		
		try{
			 Alert alert = driver.switchTo().alert();
			 alert.accept();
			}
			
			catch(Exception e)
			{
				
			}
		
		
		WebDriverWait wait = new WebDriverWait(driver,30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='banner']/h1")));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(".//*[@id='myslidemenu']/ul/li[2]/a"))).perform();
		
		File fll = new File("C:\\Users\\pandevi\\ExcelData\\TestData.xlsx");
		
		FileInputStream fiss= new FileInputStream(fll);
		
		XSSFWorkbook wb5=new XSSFWorkbook(fiss);
		
		XSSFSheet sheet2=wb.getSheetAt(1);
		
		String data5=sheet2.getRow(1).getCell(0).getStringCellValue();
		String data6=sheet2.getRow(2).getCell(0).getStringCellValue();
		String data7=sheet2.getRow(3).getCell(0).getStringCellValue();
		String data8=sheet2.getRow(3).getCell(1).getStringCellValue();
		String data9=sheet2.getRow(4).getCell(0).getStringCellValue();
		String data10=sheet2.getRow(4).getCell(1).getStringCellValue();
		String data11=sheet2.getRow(5).getCell(0).getStringCellValue();
		String data12=sheet2.getRow(5).getCell(1).getStringCellValue();
		String data13=sheet2.getRow(6).getCell(0).getStringCellValue();
		String data14=sheet2.getRow(6).getCell(1).getStringCellValue();
		String data15=sheet2.getRow(7).getCell(0).getStringCellValue();
		String data16=sheet2.getRow(8).getCell(0).getStringCellValue();
		
		
		WebElement web3=driver.findElement(By.xpath(data5));
		web3.click();
		
		WebElement web4=driver.findElement(By.xpath(data6));
		web4.click();
		
		WebElement web5=driver.findElement(By.xpath(data7));
		web5.sendKeys(data8);
		
		WebElement web6=driver.findElement(By.xpath(data9));
		web6.sendKeys(data10);
		
		WebElement web7=driver.findElement(By.xpath(data11));
		web7.sendKeys(data12);
		
		WebElement web8=driver.findElement(By.xpath(data13));
		web8.sendKeys(data14);
		
		WebElement web9=driver.findElement(By.xpath(data15));
		web9.click();
		
		WebElement web10=driver.findElement(By.xpath(data16));
		web10.click();
		
		
	
		
		
		
		
		
		
	}

}
