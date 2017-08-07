package Selenium.Handling.WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWebtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver =new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
				
				driver.navigate().to("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
					
					
					//driver.navigate().to("https://www.facebook.com/");
					
					driver.manage().window().maximize();
					
					
					//Login to the application
					
					driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("user01");
					driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("pass1234");
					
					driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
					
					
					//Click on my leave
					
					driver.findElement(By.xpath(".//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[2]/div/a/img")).click();
					
					
					Thread.sleep(5000);
					
					//Configure the webtable
					
					
					List<WebElement> tablerows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
					
					
					
					
					System.out.println("The total number of rows available in a webtable is "+tablerows.size());
					
					
					
					//How to get the data from each cell of the webtable
					
					String partialcol=".//*[@id='resultTable']/tbody/tr[";
					
					
					for (int r=1;r<=tablerows.size();r++)
					{
						
						String compltecol=partialcol+r+"]/td";
						
						
						List <WebElement> colcount=driver.findElements(By.xpath(compltecol));
						
						System.out.println(colcount.size());
						
						for(int c=1;c<=1;c++ )
						{
							
							
							driver.findElement(By.xpath(compltecol+"["+c+"]/a")).click();
							
							driver.navigate().back();
						}
						
						
						
					}
					
					
					
					
					
					
					
		
		
		

	}

}
