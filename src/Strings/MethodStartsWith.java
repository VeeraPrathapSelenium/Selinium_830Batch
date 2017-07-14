package Strings;

public class MethodStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
String str="India is great country";
		
		
		//Syntax:--Stringvariable.startsWith("word");
		//Return:-It will verify wheter the given string is starting with word specified by the user or not
		//Return Type:-boolean


boolean status=str.startsWith("india");

if(status)
{
	
	System.out.println("The given string starts with the word India");
	
}
else
	
{
	
	System.out.println("The given string not starts with the word India");
}


//endWith method

	
status=str.endsWith("country");


if(status)
{
	
	System.out.println("The given string end with with the word country");
	
}
else
	
{
	
	System.out.println("The given string not ends with the word country");
}





	}

}
