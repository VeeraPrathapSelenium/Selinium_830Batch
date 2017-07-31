package Selenium.LocationElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetValueFromaTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
			
			
			//driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			
			Thread.sleep(9000);
			
			
			
			String innertext=driver.findElement(By.xpath("//*[@id='u_0_2']")).getAttribute("name");
		System.out.println(innertext);
		

	}

}
