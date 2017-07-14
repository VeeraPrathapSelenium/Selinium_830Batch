package Strings;

public class MethodCharAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		String str="India is great country";
		
		
		//Syntax:--Stringvariable.charAt(index position);
		//Return:-It will return the charcater for given position
		//Return Type:-character
		
		//System.out.println("The character at the given position is "+str.charAt(56));
		
		
		//Example :--Retrive each and every character of a given string
		
		int length=str.length();
		
		for(int i=0;i<=length-1;i++)
		{
			
			char c=str.charAt(i);
			System.out.println(c);
			
		}
		
		

	}

}
