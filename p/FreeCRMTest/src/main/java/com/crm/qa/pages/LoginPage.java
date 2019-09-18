package com.crm.qa.pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

//	Page Factory - OR
	@FindBy(name = "username")
	WebElement username;
	@CacheLookup
	
	@FindBy(name= "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type= 'submit']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	

}
