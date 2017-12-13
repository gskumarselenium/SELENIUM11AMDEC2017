package com.OHRMS.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OHRMS.Pages.EmployeeListPage;
import com.OHRMS.Pages.LoginPage;
import com.OHRMS.baseclass.Baseclass;

public class EmployeeListPageTest extends Baseclass {
	
	com.OHRMS.Pages.HomePage hp;
	LoginPage lp;
	EmployeeListPage emplist;

	public EmployeeListPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void setup() throws Exception{
		initialization();
		lp=new LoginPage();
		hp=lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
		
	@Test(priority=0)
	public void clickonPIMmodule() throws Exception{
		hp.Pimmodulelink();
	}
	@Test(priority=1)
	public void clickonAddbuttonmodule() throws Exception{
		emplist.clickonAddbutton();
	}
}
