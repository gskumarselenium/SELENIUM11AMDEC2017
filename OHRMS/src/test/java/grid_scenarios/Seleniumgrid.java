package grid_scenarios;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

//import com.opera.core.systems.OperaSettings.Capability;

public class Seleniumgrid {
	WebDriver driver;
	String baseUrl,nodeUrl;
 
  @BeforeTest
  public void setup () throws MalformedURLException, Exception
  {
	 baseUrl="http://www.newtours.demoaut.com/";
	 nodeUrl="http://192.168.0.4:5679/wd/hub";
// System.setProperty("webdriver.chrome.driver","E:\\SELENIUM SOFTWARES 2017\\chromedriver.exe");
//		driver=new ChromeDriver();
	 DesiredCapabilities capability = DesiredCapabilities.chrome(); // browser capability intitialization
	 capability.setBrowserName("chrome"); // browser name setup
	 capability.setPlatform(Platform.VISTA); // operating system initialization
	 driver=new RemoteWebDriver(new URL(nodeUrl),capability);
	 Thread.sleep(10000);
	 }

  @AfterTest
  public void afterTest() {
	 // driver.quit();
  }
  @Test
  public void simpletest() {
	  driver.get(baseUrl);
	  Assert.assertEquals("Welcome: Mercury Tours",driver.getTitle());
  }
}