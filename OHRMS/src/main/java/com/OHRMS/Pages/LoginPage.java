package com.OHRMS.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OHRMS.baseclass.Baseclass;

//import Academy.HomePage;

public class LoginPage extends Baseclass {

	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}

	//object repository or page factory
	
	@FindBy(name="txtUsername")
	WebElement txtUsername;
	
	@FindBy(name="txtPassword")
	WebElement txtPassword;
	
	@FindBy(xpath=".//*[@id='btnLogin'][@value='LOGIN']")
	WebElement LoginButton;
	
	public String validateloginPageTitle(){
		return driver.getTitle();
		
	}
	
	public HomePage login(String un,String pwd) throws Exception{
		txtUsername.sendKeys(un);
		txtPassword.sendKeys(pwd);
	    LoginButton.click();
		return new HomePage(); // navigating to home page once login was success
	    	   
	}
}
