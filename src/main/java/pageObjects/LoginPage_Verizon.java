package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Verizon {
	public WebDriver driver;

	public LoginPage_Verizon(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="")
	WebElement username;
	
	public WebElement username()
	{
		return username;
		
	}
	
	@FindBy(xpath="")
	WebElement password;
	
	public WebElement password()
	{
		return password;
		
	}
	
	
	@FindBy(xpath="")
	WebElement SignInButton;
	
	public WebElement SignInButton()
	{
		return SignInButton;
		
	}
	

}
