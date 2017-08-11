package Selenium.TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UnderStandingAnnotationsInTestNg {
	@Test
	public static void startTest()
	{		
		System.out.println("I am Starting my test");		
	}
	
	@BeforeClass
	public static void connectToDataBase()
	{
		
		System.out.println("Connected to the database");
	}
	
	
	

}
