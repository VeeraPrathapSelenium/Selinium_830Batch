package CheckBoxAndRadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioAndCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
			
			
			//driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
		Thread.sleep(3000);
			
		
		//Identifying the radio Button
			WebElement ele=driver.findElement(By.cssSelector("#u_0_h"));
			
		
			ele.click();
		
		
		
		
		
		
		

	}

}
