package com.OHRMS.testcases;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OHRMS.Pages.Dashboardpage;
import com.OHRMS.Pages.LoginPage;
import com.OHRMS.baseclass.Baseclass;
import com.OHRMS.util.Testutil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

//import Academy.HomePage;

public class LoginPageTest extends Baseclass {

	
	com.OHRMS.Pages.HomePage hp;
	LoginPage lp;
	private String loginpageimg;
   
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws Exception{
		
		initialization();
		lp=new LoginPage();		//login page initialization
	}
		@BeforeTest
		public void setextent(){
				
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html", true);
		extent.addSystemInfo("Host Name", "sudheer windows");
		extent.addSystemInfo("User Name", "sudheer pc");
		extent.addSystemInfo("Environment", "QA Automation");
		}
	
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		extentTest = extent.startTest("loginpagetitletest");
		String title=lp.validateloginPageTitle();
		Assert.assertEquals(title, "OrangeHRM");
		
	}
	

	@Test(priority=2)
	public void LoginTest() throws Exception{
		extentTest = extent.startTest("loginpagevalidationtest");
	
		getScreenshot(driver, loginpageimg);
		hp=lp.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	

	@AfterTest
			public void endReport(){
			extent.flush();
			extent.close();
		}
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		
		if(result.getStatus()==ITestResult.FAILURE){
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
			
			String screenshotPath = Baseclass.getScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); //to add screenshot in extent report
			//extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath)); //to add screencast/video in extent report
		}
		else if(result.getStatus()==ITestResult.SKIP){
			extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());

		}
		
		
		extent.endTest(extentTest); //ending test and ends the current test and prepare to create html report
		driver.quit();
	}
	}

