package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		// driver.navigate().to("https://www.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.id("day"));

		// //Using select CLass with selectByIndex
		//
		// Select slct=new Select(ele);
		//
		// slct.selectByIndex(3);
		//

		// Using select CLass with selectByValue
		//
		// Select slct=new Select(ele);
		//
		// slct.selectByValue("5");

		// Using select CLass with visibleText
		//
		Select slct = new Select(ele);

		slct.selectByVisibleText("15");
	

	}

}
