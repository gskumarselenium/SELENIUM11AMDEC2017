package com.OHRMS.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OHRMS.Pages.AddEmployeePage;
import com.OHRMS.Pages.EmployeeListPage;
import com.OHRMS.Pages.LoginPage;
import com.OHRMS.Pages.PersonalDetailsPage;
import com.OHRMS.baseclass.Baseclass;

public class AddEmployeePageTest extends Baseclass {
	
	com.OHRMS.Pages.HomePage hp;
	LoginPage lp;
	EmployeeListPage emplist;
	AddEmployeePage addemp;
	PersonalDetailsPage personaldetails;

	public AddEmployeePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void setup() throws Exception{
		initialization();
		lp=new LoginPage();
		hp=lp.login(prop.getProperty("username"), prop.getProperty("password"));
		emplist=new EmployeeListPage();
		addemp=new AddEmployeePage();	
		personaldetails=new PersonalDetailsPage();
	}
	
	@Test(priority=0)
	public void clickPIMmodulelink() throws Exception{
		hp.Pimmodulelink();
		
	}
	@Test(priority=1)
	public void clickaddbutton() throws Exception{
		hp.Addbuttonlink();
		//emplist.clickonAddbutton();
	}
	@Test(priority=2)
	public void createnewuser() throws Exception{
		//hp=addemp.createnewuser(prop.getProperty("firstname"),prop.getProperty("middlename"),prop.getProperty("lastname"));
		personaldetails=addemp.createnewuser(prop.getProperty("firstname"),prop.getProperty("middlename"),prop.getProperty("lastname"));
	}
}
