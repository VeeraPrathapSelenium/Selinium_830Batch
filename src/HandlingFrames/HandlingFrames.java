package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
WebDriver driver =new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
			
			
			//driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
		Thread.sleep(3000);
		
		
		//Step1:-
		
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe")));
		
		
		WebElement src=driver.findElement(By.id("draggable"));
		
		WebElement dest=driver.findElement(By.id("droppable"));
		
		//step2:-
		Actions acc=new Actions(driver);
		
		acc.dragAndDrop(src, dest).build().perform();
		
		
		//Step3:-
		driver.switchTo().defaultContent();
		
			
		
		
		

	}

}
