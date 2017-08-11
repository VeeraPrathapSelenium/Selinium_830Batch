package Selenium.ClosingAlreadyOpenExcelandBrowser;

import java.io.IOException;
import java.util.Date;

public class CloseExlAndBrowser {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//String str="taskkill /F /IM firefox.exe";
		
		String str="taskkill /F /IM Excel.exe";
		
		Runtime.getRuntime().exec(str);
		
		System.out.println(new Date());
		
		
		
		
		
	}

}
