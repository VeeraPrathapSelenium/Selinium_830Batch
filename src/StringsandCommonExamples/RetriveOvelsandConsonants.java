package StringsandCommonExamples;

public class RetriveOvelsandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="java is a programming language";
		
		int vowels=0;
		
		int consonants=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			
			char c=str.charAt(i);
			
			if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u' )
			{
				vowels++;
				
				
			}
			else
			{
				
				consonants++;
			}
		
			
		}
		
		System.out.println("The total number od vowels are"+vowels);
		
		System.out.println("The total number of consonats are"+consonants);
		
		
		

	}

}
