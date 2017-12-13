package com.OHRMS.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OHRMS.Pages.LoginPage;
import com.OHRMS.baseclass.Baseclass;

//import Academy.HomePage;

public class HomePageTest extends Baseclass{

	com.OHRMS.Pages.HomePage hp;
	LoginPage lp;
	public String Homepageimg;

		public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws Exception{
		initialization();
		lp=new LoginPage();
		hp=lp.login(prop.getProperty("username"),prop.getProperty("password"));
		
		getScreenshot(driver, Homepageimg);
		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
	String homePageTitle=hp.verifyHomePageTitle();
	Assert.assertEquals(homePageTitle, "OrangeHRM","Homepage title not matched");
	}

	
	@AfterMethod
	public void teardown(){
		driver.quit();
		
	}
	
}
