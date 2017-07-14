package Strings;

public class MethodSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str="India is great country";
		
		
		//Syntax:--Stringvariable.split(index position);
		//Return:-It will split the given string with or without specific delimiter
		//Return Type:-Array
		

String[] arr=str.split(" ");

//for (String string : arr) {
//	
//	
//	System.out.println(string);
//}


for(int i=0;i<=arr.length-1;i++)
{
	
	System.out.println(arr[i]);
}



		
		
		
		

	}

}
