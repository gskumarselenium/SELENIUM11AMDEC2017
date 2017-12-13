package com.OHRMS.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OHRMS.baseclass.Baseclass;

public class AddEmployeePage extends Baseclass {

	public AddEmployeePage() throws Exception{
		super();
		}
	
	@FindBy(name="firstName")
	WebElement firstname;
	
	@FindBy(name="middleName")
	WebElement middlename;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy(xpath=".//*[@id='btnSave']")
	WebElement savebutton;
	
		
	public String AddEmployeePageTitle(){
		return driver.getTitle();
		
	}
	public PersonalDetailsPage createnewuser(String fname,String mname,String lname){
		firstname.sendKeys(fname);
		middlename.sendKeys(mname);
		lastname.sendKeys(lname);
		savebutton.click();
		return new PersonalDetailsPage();
		
	}
}

