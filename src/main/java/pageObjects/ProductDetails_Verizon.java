package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetails_Verizon {
	public WebDriver driver;
	//WebDriverWait wait= new WebDriverWait(driver, 20);

	public ProductDetails_Verizon(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@data-testid='customizeComponentId']/div[2]/descendant::p[2]")
	WebElement PriceDetails;
	
	public void PriceDetails()
	{
		//wait.until(ExpectedConditions.visibilityOf(PriceDetails));
		
		String []arr=PriceDetails.getText().split(",");
		String fin2=arr[1];
		String []arr2=fin2.split("/");
		System.out.println(arr2[0]);
		
	}
	

	

}
