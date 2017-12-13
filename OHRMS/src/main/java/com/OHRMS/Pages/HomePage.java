package com.OHRMS.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OHRMS.baseclass.Baseclass;

public class HomePage extends Baseclass{

	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	//object repository or page factory
		@FindBy(linkText="Welcome Admin")
		WebElement Welcomeadmin;
		
		@FindBy(xpath="//b[contains(text(),'Admin')]")
		WebElement AdminModule;
		
		@FindBy(xpath="//b[contains(text(),'PIM')]")
		WebElement PIMModule;
		
				
		@FindBy(xpath="//b[contains(text(),'Leave')]")
		WebElement LeaveModule;
		
		@FindBy(xpath="//b[contains(text(),'Time')]")
		WebElement TimeModule;
		
		@FindBy(xpath="//b[contains(text(),'Recruitment')]")
		WebElement RecruitmentModule;
		
		@FindBy(xpath="//b[contains(text(),'Performance')]")
		WebElement PerformanceModule;
		
		@FindBy(xpath="//b[contains(text(),'Dashboard')]")
		WebElement DashboardModule;
		
		@FindBy(xpath="//b[contains(text(),'Directory')]")
		WebElement DirectoryModule;
		
		@FindBy(xpath="//input[@value='Add'][@name='btnAdd']")
		WebElement Addbutton;
		
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}
		
		public UsersPage Adminmodulelink() throws Exception{
			AdminModule.click();
			return new UsersPage();
		}
		
		public EmployeeListPage Pimmodulelink() throws Exception{
			PIMModule.click();
			return new EmployeeListPage();
		}
		public AddEmployeePage Addbuttonlink() throws Exception{
			Addbutton.click();
			return new AddEmployeePage();
		}
		

		
}
