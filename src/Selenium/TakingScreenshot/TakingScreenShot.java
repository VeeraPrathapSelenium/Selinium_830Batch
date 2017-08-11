package Selenium.TakingScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class TakingScreenShot {
	
	public static WebDriver driver;
	
	public static int tcnum=1;
	
	@Test(priority=1)
	
	public static void launcgBrowser()
	{
		
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
	}
	
	
	
	
	
	
	@Test(priority=2)
	public static void takeScreenPrint() throws IOException
	{
		//step 1:
		TakesScreenshot sht=(TakesScreenshot)driver;
		
		
		//step2:
		
		File source=sht.getScreenshotAs(OutputType.FILE);
		
		String dest_Path="C:\\Users\\DELL\\workspace\\830_Batch\\ScreenPrints\\Tc"+tcnum+".png";
		tcnum++;
		
		File destination=new File(dest_Path);
		//step 3
		
		FileUtils.copyFile(source, destination);
		
		
		
	}
	
	

}
