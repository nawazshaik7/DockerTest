package Academy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage_Verizon;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ProductDetails_Verizon;
import resources.base;

public class SearchForProductInVerizonAndSelectIt extends base{
	public WebDriver driver;
	 public Logger log =LogManager.getLogger(SearchForProductInVerizonAndSelectIt.class.getName());
	@BeforeMethod
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 log.info("Driver is initialized");
			
		driver.get(prop.getProperty("url"));
		 log.info("Navigated to Home page");
	}
	@Test(dataProvider = "testdata")
	
	public void SearchForProductInVerizonAndSelectItTC(String key1,String key2) throws IOException, InterruptedException
 
	{
		
		
	
		HomePage_Verizon hp = new HomePage_Verizon(driver);
		ProductDetails_Verizon pd= new ProductDetails_Verizon(driver);
		
		log.info("Entered Verizon");
	
		
		 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("document.getElementById('gnav20-search-icon-mobile').click();");
		js.executeScript("arguments[0].click();", hp.SignIn());
		log.info("Clicked on search button");
		
		hp.whatAreYouLookingFor_type(key1);
		log.info("Entered the product name  in search bar");
		
		hp.whatAreYouLookingForSearchList_Select(key2);
		log.info("selected the product from search list");
		System.out.println(key2);
		pd.PriceDetails();
		log.info("Printed th price details");
		
	
		
		}
	@AfterMethod
	public void teardown()
	{
		
		driver.close();
	
		
	}
	
	
	@DataProvider(name="testdata")
	public Object[][] data() throws IOException
	{
		return excel("Sheet1");
		
	}

	

	
}
