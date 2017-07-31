package Selenium.LocationElements;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementsWithProperties {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("OR.properties");
		
		FileInputStream fis=new FileInputStream(f);
		
		
		Properties prop=new Properties();
		
		
		prop.load(fis);
		
		
WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
			
			
			//driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath(prop.getProperty("Usename"))).sendKeys("hello");
		
		
		
		
		
		
		

	}

}
