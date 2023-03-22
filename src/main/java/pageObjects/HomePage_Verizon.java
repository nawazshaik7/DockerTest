package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage_Verizon {
	public WebDriver driver;
	//WebDriverWait wait= new WebDriverWait(driver, 20);

	public HomePage_Verizon(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="")
	WebElement personal;
	
	//@FindBy(how=How.PARTIAL_LINK_TEXT, using="Register")
	//WebElement pr;
	
	public WebElement personal()
	{
		return personal;
		
	}
	
	@FindBy(xpath="")
	WebElement Business;
	
	public WebElement Business()
	{
		return Business;
		
	}
	
	@FindBy(xpath="")
	WebElement Stores;
	
	public WebElement Stores()
	{
		return Stores;
		
	}
	
	@FindBy(xpath="")
	WebElement Shop;
	
	public WebElement Shop()
	{
		return Shop;
		
	}
	
	@FindBy(xpath="")
	WebElement WhyVerizon;
	
	public WebElement WhyVerizon()
	{
		return WhyVerizon;
		
	}
	
	@FindBy(xpath="")
	WebElement Support;
	
	public WebElement Support()
	{
		return Support;
		
	}
	
	@FindBy(xpath ="//button[@id='gnav20-search-icon-mobile']")
	WebElement SignIn;
	
	public WebElement SignIn()
	{
		return SignIn;
		
	}
	
	@FindBy(xpath="")
	WebElement Search_Icon;
	
	public WebElement Search_Icon()
	{
		return Search_Icon;
		
	}
	
	
	
	@FindBy(xpath="//input[@placeholder='What are you looking for?']")
	WebElement whatAreYouLookingFor;
	
	public void whatAreYouLookingFor_type(String text)
	{
		//wait.until(ExpectedConditions.visibilityOf(whatAreYouLookingFor));
		whatAreYouLookingFor.sendKeys(text);
		
	}
	
	@FindBy(xpath="//div[@class='list_container']/li/a/div/span")
	List<WebElement> whatAreYouLookingForSearchList;
	
	
public void whatAreYouLookingForSearchList_Select(String text)
{
	//wait.until(ExpectedConditions.visibilityOfAllElements(whatAreYouLookingForSearchList));
	for(int i=0;i<whatAreYouLookingForSearchList.size();i++)
	{
		if(whatAreYouLookingForSearchList.get(i).getText().equalsIgnoreCase(text))
		{
		  whatAreYouLookingForSearchList.get(i).click();
		  break;
		}
		}
	}
	/*public List<WebElement> whatAreYouLookingForSearchList()
	{
		return whatAreYouLookingForSearchList;
		
	}*/
	
	@FindBy(xpath="")
	WebElement Cart_Icon;
	
	public WebElement Cart_Icon()
	{
		return Cart_Icon;
		
	}
	
	@FindBy(xpath="")
	WebElement ShopNow;
	
	public WebElement ShopNow()
	{
		return ShopNow;
		
	}
	
	@FindBy(xpath="")
	WebElement Shop_Devices;
	
	public WebElement Shop_Devices()
	{
		return Shop_Devices;
		
	}
	
	@FindBy(xpath="")
	WebElement Shop_Accessories;
	
	public WebElement Shop_Accessories()
	{
		return Shop_Accessories;
		
	}
	
	@FindBy(xpath="")
	WebElement Shop_Plans;
	
	public WebElement Shop_Plans()
	{
		return Shop_Plans;
		
	}
	
	@FindBy(xpath="")
	WebElement Shop_HomeInternetTV;
	
	public WebElement Shop_HomeInternetTV()
	{
		return Shop_HomeInternetTV;
		
	}
	
	@FindBy(xpath="")
	WebElement Shop_Entertainment;
	
	public WebElement Shop_Entertainment()
	{
		return Shop_Entertainment;
		
	}
	
	@FindBy(xpath="")
	WebElement Shop_Deals;
	
	public WebElement Shop_Deals()
	{
		return Shop_Deals;
		
	}
	
	@FindBy(xpath="")
	WebElement Shop_TracFone;
	
	public WebElement Shop_TracFone()
	{
		return Shop_TracFone;
		
	}
	
	@FindBy(xpath="")
	WebElement TopDeviceBrands_Samsung;
	
	public WebElement TopDeviceBrands_Samsung()
	{
		return TopDeviceBrands_Samsung;
		
	}
	
	@FindBy(xpath="")
	WebElement TopDeviceBrands_Apple;
	
	public WebElement TopDeviceBrands_Apple()
	{
		return TopDeviceBrands_Apple;
		
	}
	
	@FindBy(xpath="")
	WebElement TopDeviceBrands_Motorolaa;
	
	public WebElement TopDeviceBrands_Motorolaa()
	{
		return TopDeviceBrands_Motorolaa;
		
	}
	
	@FindBy(xpath="")
	WebElement TopDeviceBrands_Google;
	
	public WebElement TopDeviceBrands_Google()
	{
		return TopDeviceBrands_Google;
		
	}
	
	@FindBy(xpath="")
	WebElement TopDeviceBrands_Amazon;
	
	public WebElement TopDeviceBrands_Amazon()
	{
		return TopDeviceBrands_Amazon;
		
	}
	
	@FindBy(xpath="")
	WebElement Support_SupportOverview;
	
	public WebElement Support_SupportOverview()
	{
		return Support_SupportOverview;
		
	}
	
	@FindBy(xpath="")
	WebElement Support_ReturnPolicy;
	
	public WebElement Support_ReturnPolicy()
	{
		return Support_ReturnPolicy;
		
	}
	
	@FindBy(xpath="")
	WebElement Support_ContactUS;
	
	public WebElement Support_ContactUS()
	{
		return Support_ContactUS;
		
	}
	
	@FindBy(xpath="")
	WebElement Support_SignIn;
	
	public WebElement Support_SignIn()
	{
		return Support_SignIn;
		
	}
	
	@FindBy(xpath="")
	WebElement Support_DownloadMyVerizon;
	
	public WebElement Support_DownloadMyVerizon()
	{
		return Support_DownloadMyVerizon;
		
	}
	
	@FindBy(xpath="")
	WebElement Support_Lifeline;
	
	public WebElement Support_Lifeline()
	{
		return Support_Lifeline;
		
	}
	
	@FindBy(xpath="")
	WebElement AboutVerizon_AboutUs;
	
	public WebElement AboutVerizon_AboutUs()
	{
		return AboutVerizon_AboutUs;
		
	}
	
	@FindBy(xpath="")
	WebElement AboutVerizon_Carrers;
	
	public WebElement AboutVerizon_Carrers()
	{
		return AboutVerizon_Carrers;
		
	}
	
	@FindBy(xpath="")
	WebElement AboutVerizon_News;
	
	public WebElement AboutVerizon_News()
	{
		return AboutVerizon_News;
		
	}
	
	@FindBy(xpath="")
	WebElement AboutVerizon_Responsibility;
	
	public WebElement AboutVerizon_Responsibility()
	{
		return AboutVerizon_Responsibility;
		
	}
	
	@FindBy(xpath="")
	WebElement AboutVerizon_VerizonInnovativeLearning;
	
	public WebElement AboutVerizon_VerizonInnovativeLearning()
	{
		return AboutVerizon_VerizonInnovativeLearning;
		
	}
	
	@FindBy(xpath="")
	WebElement AboutVerizon_ConsumerEducation;
	
	public WebElement AboutVerizon_ConsumerEducation()
	{
		return AboutVerizon_ConsumerEducation;
		
	}
	
	@FindBy(xpath="")
	WebElement AboutVerizon_brochures;
	
	public WebElement AboutVerizon_brochures()
	{
		return AboutVerizon_brochures;
		
	}
	
	@FindBy(xpath="")
	WebElement MostPopular_AppleIphone13Pro;
	
	public WebElement MostPopular_AppleIphone13Pro()
	{
		return MostPopular_AppleIphone13Pro;
		
	}
	
	@FindBy(xpath="")
	WebElement MostPopular_AppleIPhoneSE;
	
	public WebElement MostPopular_AppleIPhoneSE()
	{
		return MostPopular_AppleIPhoneSE;
		
	}
	
	@FindBy(xpath="")
	WebElement MostPopular_SamsungGalaxyS22Ultra;
	
	public WebElement MostPopular_SamsungGalaxyS22Ultra()
	{
		return MostPopular_SamsungGalaxyS22Ultra;
		
	}
	
	@FindBy(xpath="")
	WebElement MostPopular_AppleAirPodsMax;
	
	public WebElement MostPopular_AppleAirPodsMax()
	{
		return MostPopular_AppleAirPodsMax;
		
	}
	
	@FindBy(xpath="")
	WebElement MostPopular_Disney;
	
	public WebElement MostPopular_Disney()
	{
		return MostPopular_Disney;
		
	}
	
	@FindBy(xpath="")
	WebElement MostPopular_AppleWatchSeries7;
	
	public WebElement MostPopular_AppleWatchSeries7()
	{
		return MostPopular_AppleWatchSeries7;
		
	}
	
	@FindBy(xpath="")
	WebElement MostPopular_Fios;
	
	public WebElement MostPopular_Fios()
	{
		return MostPopular_Fios;
		
	}
	
	@FindBy(xpath="")
	WebElement MostPopular_VerizonVisaCard;
	
	public WebElement MostPopular_VerizonVisaCard()
	{
		return MostPopular_VerizonVisaCard;
		
	}
	


	@FindBy(xpath="")
	WebElement TopAccessoryBrand_Otterbox;
	
	public WebElement TopAccessoryBrand_Otterbox()
	{
		return TopAccessoryBrand_Otterbox;
		
	}
	
	@FindBy(xpath="")
	WebElement TopAccessoryBrand_ZAGG;
	
	public WebElement TopAccessoryBrand_ZAGG()
	{
		return TopAccessoryBrand_ZAGG;
		
	}
	
	@FindBy(xpath="")
	WebElement TopAccessoryBrand_Beats;
	
	public WebElement TopAccessoryBrand_Beats()
	{
		return TopAccessoryBrand_Beats;
		
	}
	
	@FindBy(xpath="")
	WebElement TopAccessoryBrand_Mophine;
	
	public WebElement TopAccessoryBrand_Mophine()
	{
		return TopAccessoryBrand_Mophine;
		
	}
	
	@FindBy(xpath="")
	WebElement TopAccessoryBrand_JBL;
	
	public WebElement TopAccessoryBrand_JBL()
	{
		return TopAccessoryBrand_JBL;
		
	}
	
	@FindBy(xpath="")
	WebElement TopAccessoryBrand_FITBit;
	
	public WebElement TopAccessoryBrand_FITBit()
	{
		return TopAccessoryBrand_FITBit;
		
	}
	
	@FindBy(xpath="")
	WebElement TopAccessoryBrand_Gear4;
	
	public WebElement TopAccessoryBrand_Gear4()
	{
		return TopAccessoryBrand_Gear4;
		
	}
	
	@FindBy(xpath="")
	WebElement ImportantConsumerVerification_TermsConditions;
	
	public WebElement ImportantConsumerVerification_TermsConditions()
	{
		return ImportantConsumerVerification_TermsConditions;
		
	}
	
	@FindBy(xpath="")
	WebElement ImportantConsumerVerification_DevicePaymentTermsConditions;
	
	public WebElement ImportantConsumerVerification_DevicePaymentTermsConditions()
	{
		return ImportantConsumerVerification_DevicePaymentTermsConditions;
		
	}
	
	@FindBy(xpath="")
	WebElement ImportantConsumerVerification_ReportSecurityVulnerability;
	
	public WebElement ImportantConsumerVerification_ReportSecurityVulnerability()
	{
		return ImportantConsumerVerification_ReportSecurityVulnerability;
		
	}
	
	@FindBy(xpath="")
	WebElement ImportantConsumerVerification_MobileConsumerAgreement;
	
	public WebElement ImportantConsumerVerification_MobileConsumerAgreement()
	{
		return ImportantConsumerVerification_MobileConsumerAgreement;
		
	}
	
	@FindBy(xpath="")
	WebElement ImportantConsumerVerification_Announcements;
	
	public WebElement ImportantConsumerVerification_Announcements()
	{
		return ImportantConsumerVerification_Announcements;
		
	}
	
	@FindBy(xpath="")
	WebElement ImportantConsumerVerification_RadioFreuencyEmmisions;
	
	public WebElement ImportantConsumerVerification_RadioFreuencyEmmisions()
	{
		return ImportantConsumerVerification_RadioFreuencyEmmisions;
		
	}
	
	@FindBy(xpath="")
	WebElement ImportantConsumerVerification_Taxessurcharges;
	
	public WebElement ImportantConsumerVerification_Taxessurcharges()
	{
		return ImportantConsumerVerification_Taxessurcharges;
		
	}
	
	@FindBy(xpath="")
	WebElement ImportantConsumerVerification_Recall;
	
	public WebElement ImportantConsumerVerification_Recall()
	{
		return ImportantConsumerVerification_Recall;
		
	}
	
	@FindBy(xpath="")
	WebElement ImportantConsumerVerification_LegalNotices;
	
	public WebElement ImportantConsumerVerification_LegalNotices()
	{
		return ImportantConsumerVerification_LegalNotices;
		
	}
	

}
