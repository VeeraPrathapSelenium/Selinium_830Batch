package HandlingPropertiesFile;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class HandlingPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File f=new File("Projects.properties");
		
		FileInputStream fis=new FileInputStream(f);
		
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("Env"));
		
		System.out.println(prop.getProperty("Username"));
		
		
		
		

	}

}
