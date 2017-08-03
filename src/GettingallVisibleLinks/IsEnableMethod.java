package GettingallVisibleLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnableMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=gKOCWf6NGPGK8Qfjk4HYBQ");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.name("btnK"));
		
		if(ele.isEnabled())
		{
			
			System.out.println(true);
			
			
		}
		else
		{
			
			System.out.println(false);
		}

	}

}
