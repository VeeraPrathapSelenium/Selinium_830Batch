package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub
		
WebDriver driver =new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
			
			
			//driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.xpath(".//*[@id='menu-top']/li[1]/a"));
		
		Actions acc=new Actions(driver);
		
		
		acc.moveToElement(ele).build().perform();
		
		acc.contextClick(ele).build().perform();
		
		
		
		
		
		
		

	}

}
