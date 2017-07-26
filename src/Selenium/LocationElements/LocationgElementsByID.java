package Selenium.LocationElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocationgElementsByID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launching FireFox Driver
		
		
				WebDriver driver =new FirefoxDriver();
				
			driver.get("https://www.facebook.com/");
				
				
				//driver.navigate().to("https://www.facebook.com/");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.id("email")).sendKeys("hello");
				

	}

}
