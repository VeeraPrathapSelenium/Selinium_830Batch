package GettingallVisibleLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllVisibleLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=gKOCWf6NGPGK8Qfjk4HYBQ");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
		
		List<WebElement> lst=driver.findElements(By.xpath("//a"));
		
		System.out.println(lst.size());
		
		
		for(int i=0;i<=lst.size()-1;i++)
		{
			
			if(lst.get(i).isDisplayed())
				
			{
				
				System.out.println(lst.get(i).getText());
				
			}
		}
		

	}

}
