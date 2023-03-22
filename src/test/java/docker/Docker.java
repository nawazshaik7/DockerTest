package docker;

import java.io.IOException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;
//Adding logs 
//Generating html reports
//Screenshots on failure
//JEnkins integration
public class Docker extends base{
	public WebDriver driver;
	
	 public static Logger log =LogManager.getLogger(base.class.getName());

	
	@Test
	
	public void validateAppNavBar() throws IOException
	{

		//one is inheritance
		// creating object to that class and invoke methods of it
		
		//DesiredCapabilities dc=DesiredCapabilities.chrome();
		DesiredCapabilities dc=DesiredCapabilities.firefox();
		URL url=new URL("http://localhost:4444");
		RemoteWebDriver driver1=new RemoteWebDriver(url,dc);
		driver1.get("https://www.verizon.com");
		String ti=driver1.getTitle();
		
	
	
		//compare the text from the browser with actual text.- Error..
	    
	   
		 System.out.println(ti);
	 //   Assert.assertFalse(false);
		driver1.quit();
	
		
		}


	
}
