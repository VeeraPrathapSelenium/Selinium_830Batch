package StringsandCommonExamples;

public class CountingtheOccuranceOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="India Is a great country india has large Population iNDia has large area ";
		String temp="";
		int counter=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			
			char c=str.charAt(i);
			
			temp=temp+c;
			
			if(Character.isSpace(c) )
			{
				temp=temp.trim().toUpperCase();
				if(temp.contains("INDIA"))
				{
				counter++;	
				temp="";
				}
//				else
//				{
//					
//					temp="";
//				}
			}
			
			
			
			
			
			
			
			
		}
		
		
		System.out.println("The word is repeated for "+counter+" Times");
		
		
		

	}

}
