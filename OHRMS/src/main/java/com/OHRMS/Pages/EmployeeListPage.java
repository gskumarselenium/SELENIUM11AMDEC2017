package com.OHRMS.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.OHRMS.baseclass.Baseclass;

public class EmployeeListPage extends Baseclass {

	public EmployeeListPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//object repository for employeelistpage
	
	@FindBy(xpath="//input[@value='Add'][@name='btnAdd']")
	WebElement Addbutton;
	
	@FindBy(xpath=".//*[@id='searchBtn'][@value='Search']")
	WebElement Searchbutton;
	
	@FindBy(xpath=".//*[@id='resetBtn'][@value='Reset']")
	WebElement Resetbutton;
	
	@FindBy(xpath=".//*[@id='btnDelete'][@value='Delete']")
	WebElement Deletebutton;
	
	@FindBy(xpath=".//*[@id='empsearch_employee_name_empName']")
	WebElement SearchEmployeeName;
	
	public String EmployeeListPageTitle(){
		return driver.getTitle();
	}
	
	public AddEmployeePage clickonAddbutton() throws Exception{
		Addbutton.click();
		return new AddEmployeePage();
	}
	
}
