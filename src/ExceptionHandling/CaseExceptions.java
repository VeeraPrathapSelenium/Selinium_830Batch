package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CaseExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			
			handleFile();
		
			
		}
		
		
		catch(FileNotFoundException e)
		{
			System.out.println("Controller code case ");
			
		}
		
		catch(Exception e)
		{
			
			System.out.println("Controller code from general case");
			
		}
		
		finally
		{
			
			System.out.println("completed");
		}
		
		
		
		

	}
	
	
	public static void handleFile() throws FileNotFoundException
	{
		File f=new File("OR.properties");
		
			FileInputStream fis=new FileInputStream(f);
		
		
			System.out.println("Controller code");
			
			
		
		
	}
	

}
