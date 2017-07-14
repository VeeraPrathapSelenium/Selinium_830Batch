package Strings;

public class StringsComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="India is great country";
		String str2="india is great country";
		
		//Syntax:--Stringvariable 1.equals(Stringvariable 2);
		//Return:-It will verify two strings are equal or not
		//Return Type:-boolean
		
		
		if(str1.equals(str2))
		{
			System.out.println("Equals method:---Both the strings are equal");
			
		}
		else
			
		{
			System.out.println("Equals method:---Both the strings are not equal");
			
		}
		
		System.out.println("********************************");
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Equals Ignore Case method:---Both the strings are equal");
			
		}
		else
			
		{
			System.out.println("Equals Ignore Case:---Both the strings are not equal");
			
		}
		
		System.out.println("********************************");
		
		
		if(str1.contentEquals(str2))
		{
			System.out.println("Content Equals:---Both the strings are equal");
			
		}
		else
			
		{
			System.out.println("Content Equals:---Both the strings are not equal");
			
		}
		
		

	}

}
