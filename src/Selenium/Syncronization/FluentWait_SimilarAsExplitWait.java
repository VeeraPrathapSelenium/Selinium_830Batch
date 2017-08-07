package Selenium.Syncronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWait_SimilarAsExplitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver =new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
				
				driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
					
					
					//driver.navigate().to("https://www.facebook.com/");
					
					driver.manage().window().maximize();
					
					WebElement ele=driver.findElement(By.cssSelector("#loginbutton"));
					
					
					FluentWait wait=new FluentWait(driver);
					wait.withTimeout(35000, TimeUnit.MILLISECONDS);
					wait.pollingEvery(2, TimeUnit.SECONDS);
					wait.until(ExpectedConditions.alertIsPresent());
					
		
		
		

	}

}
