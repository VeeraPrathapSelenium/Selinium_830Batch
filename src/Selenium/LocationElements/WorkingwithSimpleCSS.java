package Selenium.LocationElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithSimpleCSS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
			
			
			//driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("input[id='u_0_2']")).sendKeys("Hello");
			
		
		
		

	}

}
