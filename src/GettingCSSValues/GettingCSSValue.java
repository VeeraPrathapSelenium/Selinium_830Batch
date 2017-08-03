package GettingCSSValues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettingCSSValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver =new FirefoxDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
			
			
			//driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
		Thread.sleep(3000);
		
		
		String cssvalue=driver.findElement(By.xpath(".//*[@id='mp-tfa-h2']")).getCssValue("background-color");
		
		System.out.println(cssvalue);
		
		

	}

}
