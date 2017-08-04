package Selenium.Syncronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait_DefaultTimeoutOfAnObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
WebDriver driver =new FirefoxDriver();

driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
			
			
			//driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			

	}

}
