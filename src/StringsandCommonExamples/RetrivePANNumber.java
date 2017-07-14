package StringsandCommonExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RetrivePANNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str="My Pan Number is HJIPM3600D";
		
		//String str="my email id is abc.xyz@dfg.com";
		
	
		String pattern="[A-Z]{5}[0-9]{4}[A-Z]{1}";
		
		//Regular Expression code
		Pattern ptrn=Pattern.compile(pattern);
		
		Matcher mtch=ptrn.matcher(str);
		
		//System.out.println("Pattern is  available");
			
			while(mtch.find())
			{
				
				System.out.println(mtch.group(0));
				
				
			}
			
		
		

	}

}
