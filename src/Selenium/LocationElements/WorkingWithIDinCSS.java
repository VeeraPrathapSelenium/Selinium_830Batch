package Selenium.LocationElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithIDinCSS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
			
			
			//driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#u_0_2")).sendKeys("Hello");
			
		
		

	}

}
