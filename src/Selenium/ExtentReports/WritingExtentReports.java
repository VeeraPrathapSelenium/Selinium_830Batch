package Selenium.ExtentReports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WritingExtentReports {
	
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static WebDriver driver;
	
	static int tcnum=1;
	
	
	
	
	@BeforeTest
	
	public static void intializeExtentReport()
	{
		extent=new ExtentReports("ExtentReports\\Tc_01.html");
		extent.addSystemInfo("Test Region","QA")
		.addSystemInfo("User","Prathap");
		
		extent.loadConfig(new File("extent-config.xml"));
		
	}
	
	
	
	@BeforeMethod
	
	public static void startReport()
	{
		
		test=extent.startTest("Invoking Browser Name");
		
		
		
	}
	
	
	
	@Test(priority=1)
	
	public static void invokeBrowser() throws IOException
	{
		
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		takeScreenPrint();
		test.log(LogStatus.PASS, "Browser has launched sucessfully"+test.addScreenCapture("C:\\Users\\DELL\\workspace\\830_Batch\\ScreenPrints\\Tc"+tcnum+".png"));
		
		
	}
	
	@AfterMethod
	
	public static void endTest()
	{
		
		extent.endTest(test);
	}
	
	
	@AfterTest
	
	public static void publishResult()
	{
		extent.flush();
		
	}
	
	
	

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
