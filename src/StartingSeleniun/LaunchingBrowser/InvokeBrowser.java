package StartingSeleniun.LaunchingBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrowser {

	public static void main(String[] args) {
		// Launching FireFox Driver
		
		
		WebDriver driver =new FirefoxDriver();
		
	driver.get("https://www.facebook.com/");
		
		
		//driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("hello");
		
		
		

	}

}
