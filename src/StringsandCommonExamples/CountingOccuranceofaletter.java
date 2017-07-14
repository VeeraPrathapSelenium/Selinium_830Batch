package StringsandCommonExamples;

public class CountingOccuranceofaletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Java is a programming language";
		
		int counter=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			
			char c=str.charAt(i);
			
			if(c=='a')
			{
				
				counter++;
				
			}
			
			
			
		}
		
		
		System.out.println("The character a is repeated :-"+counter+" Times");
		

	}

}
