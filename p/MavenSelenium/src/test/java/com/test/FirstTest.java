package com.test;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest {

		
		@Test
		public void TC_1()
		{
		
			System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize(); 
			driver.get("http://www.google.com");
			driver.findElement(By.name("q")).sendKeys("Selenium");
			

		}
		
		
		
	}


