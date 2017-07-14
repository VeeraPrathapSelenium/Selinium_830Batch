package Strings;

public class MethodSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
String str="India is great country";
		
		
		//Syntax:--Stringvariable.subString(index position,index+1(length));
		//Return:-It will return the some specific number of charcaters or part of a given position
		//Return Type:-string


		String sbstr=str.substring(0, 9);
		
		System.out.println(sbstr);
		
		
		
String sbstr2=str.substring(4);
		
		System.out.println(sbstr2);

	}

}
