package StringsandCommonExamples;

public class WritingPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userval=10;
		
		int flag=0;
		for(int i=1;i<=userval;i++)
		{
			
			
			if(userval % i==0)
				
			{
				
				flag++;
				
			}
			
			
			if(flag==2)
			{
			 System.out.println("The number is prime");
				
			}
			else
			{
				 System.out.println("The number is not prime");	
				
			}
			
		}
		
		
		
		
		
		

	}

}
