package docker;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Docker_setup {
	@BeforeSuite
	public void dockerStart() throws IOException, InterruptedException
	{
		
		Runtime.getRuntime().exec("cmd /c start_docker.bat");
		Thread.sleep(15000);
		
	}
	@AfterSuite
	public void dockerStop() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c stop_docker.bat");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
		
	}

}
