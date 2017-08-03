package HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
			
			
			//driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
		Thread.sleep(3000);
			
			WebElement ele=driver.findElement(By.cssSelector("#loginbutton"));
			
		ele.click();
		
		Alert alert=driver.switchTo().alert();
		
		Thread.sleep(3000);
		alert.accept();
		
		
		
		
		
		
		
		

	}

}
