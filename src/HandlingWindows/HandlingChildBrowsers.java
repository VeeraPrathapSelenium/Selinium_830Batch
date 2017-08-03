package HandlingWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingChildBrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
WebDriver driver =new FirefoxDriver();
		
		driver.get("http://www.rediff.com/");
			
			
			//driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
		Thread.sleep(3000);
			
		
		
		
		Set<String> st=driver.getWindowHandles();
		
		
		
		Iterator itr=st.iterator();
		
		st.remove(itr.hasNext());
		
		while(itr.hasNext())
		{
			
			
			driver.switchTo().window(itr.next().toString());
			driver.close();
			
		}
		
		
		
		
		
		
		
		
			
		
		
		
		

	}

}
