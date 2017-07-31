package Selenium.LocationElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FollowingSiblings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
			
			
			//driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			
			Thread.sleep(9000);
			
			
			
			List<WebElement> listofitems=driver.findElements(By.xpath(".//select[@id='day']/option/following-sibling::option"));
		//System.out.println(listofitems.size());
			
			
			for(int i=0;i<=listofitems.size()-1;i++)
				
			{	
				
				System.out.println(listofitems.get(i).getText());
			}
				
		
		
		
		

	}

}
