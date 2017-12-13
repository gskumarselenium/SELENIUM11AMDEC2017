package grid_scenarios;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class Seleniumgridexmaple {
	WebDriver driver;
	String baseUrl,nodeUrl;
	
	public void setup () throws MalformedURLException, Exception
	  {
		 
		 nodeUrl="http://192.168.0.4:5679/wd/hub";
		 baseUrl="http://www.fb.com/";
	// System.setProperty("webdriver.chrome.driver","E:\\SELENIUM SOFTWARES 2017\\chromedriver.exe");
//			driver=new ChromeDriver();
		 DesiredCapabilities capability = DesiredCapabilities.chrome(); // browser capability intitialization
		 capability.setBrowserName("chrome"); // browser name setup
		 capability.setPlatform(Platform.ANY); // operating system initialization
		 driver=new RemoteWebDriver(new URL(nodeUrl),capability);
		 Thread.sleep(2000);
		 }

public void simpletest() {
	  driver.get(baseUrl);
	  Assert.assertEquals("Facebook – log in or sign up",driver.getTitle());
}

	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub
		Seleniumgridexmaple s=new Seleniumgridexmaple();
		s.setup();
		s.simpletest();
	}
	}
