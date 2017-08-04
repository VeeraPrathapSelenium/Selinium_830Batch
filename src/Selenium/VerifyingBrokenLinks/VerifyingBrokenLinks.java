package Selenium.VerifyingBrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class VerifyingBrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
			
			
			//driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			
			
		
				
		//System.out.println("************************************");
		//System.out.println(driver.getPageSource());
		
		
		driver.findElement(By.partialLinkText("Terms")).click();
		
		String myurl=driver.getCurrentUrl();
		
	URL  url=new URL(myurl);
	
	HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	connection.setRequestMethod("GET");
	connection.connect();
	
	int val=connection.getResponseCode();
	
	System.out.println(val);
	
	
	
	

	
		
		
		
		

	}

}
