package Selenium.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutor_HandleHiddenEleemnts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
			
			
			//driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
		Thread.sleep(3000);
			
			WebElement ele=driver.findElement(By.cssSelector("#loginbutton"));
			
			
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			
			jse.executeScript("arguments[0].click();", ele);
		
		

	}

}
