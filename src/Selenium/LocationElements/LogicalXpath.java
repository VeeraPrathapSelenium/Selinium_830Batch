package Selenium.LocationElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogicalXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
			
			
			//driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			
			
			
			driver.findElement(By.xpath("//input[@id='email' and @name='email']")).clear();
			driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("9626272284");
			
			
		
		

	}

}
