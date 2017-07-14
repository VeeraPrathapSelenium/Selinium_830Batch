package StringsandCommonExamples;

public class RetrivingNumericsFromaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="my account number is:-1234";
		
		String temp="";
		
		for(int i=0;i<=str.length()-1;i++)
		{
			
			char c=str.charAt(i);
			
			if((int)c>=(int)'0' && (int)c<=(int)'9')
			{
				
				temp=temp+c;
			
			}

		}
		
		System.out.println("The Numeric part of the given String is:-->"+temp);
	
	}

}
