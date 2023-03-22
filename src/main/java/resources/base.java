package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class base {

	public  WebDriver driver;
	public Properties prop;
	String dir = System.getProperty("user.dir");
public WebDriver initializeDriver() throws IOException
{
	
 prop= new Properties();
 
FileInputStream fis=new FileInputStream(dir+"/src/main/java/resources/data.properties");

prop.load(fis);
String browserName=prop.getProperty("browser");
System.out.println(browserName);

if(browserName.equals("chrome"))
{
	 System.setProperty("webdriver.chrome.driver", dir+"/src/main/java/resources/chromedriver.exe");
	driver= new ChromeDriver();
		//execute in chrome driver
	
}
else if (browserName.equals("firefox"))
{
	 System.setProperty("webdriver.gecko.driver", dir+"/src/main/java/resources/geckodriver.exe");
	 driver= new FirefoxDriver();
	
}
else if (browserName.equals("IE"))
{
	 System.setProperty("webdriver.ie.driver", dir+"/src/main/java/resources/IEDriverServer.exe");
	 driver= new InternetExplorerDriver();
}

else if (browserName.equals("edge"))
{
	 System.setProperty("webdriver.edge.driver", dir+"/src/main/java/resources/msedgedriver.exe");
	 driver= new EdgeDriver();
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;


}


public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source =ts.getScreenshotAs(OutputType.FILE);
	String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	FileUtils.copyFile(source,new File(destinationFile));
	return destinationFile;


}

public String[][] excel(String sheetname) throws IOException
{
	FileInputStream fis=new FileInputStream(dir+"/src/main/java/resources/Data.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sh=wb.getSheet(sheetname);
	int rowCount=sh.getLastRowNum();
	int colCount=sh.getRow(0).getLastCellNum();
	
	String[][] td=new String[rowCount][colCount];
	
	
	for(int i=1;i<rowCount;i++)
	{
		
		for(int j=0;j<colCount;j++)
		{
			td[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
		}
		
		
	}
	
	
	/*for(int i=0;i<colCount;i++)
	{
		String val=sh.getRow(0).getCell(i).getStringCellValue();
		if(val.equalsIgnoreCase(n))
		{
			for(int j=1;j<rowCount;j++)
			{
				sh.getRow(j).getCell(i).getStringCellValue();
			}
		}
	}*/
	
	
	
	return td;
	
}

}
