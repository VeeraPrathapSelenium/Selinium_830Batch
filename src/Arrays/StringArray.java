package Arrays;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] strarr=new String[3];
		
		//Integer[] intarr=new Integer[3];
		
		strarr[0]="india";
		
		strarr[1]="Japan";
		
		strarr[2]="Tokyo";
				
		for(int i=0;i<=strarr.length-1;i++)
		{
			
			System.out.println(strarr[i]);
			
		}
		
		System.out.println("***********************************");
		for (String element : strarr) {
			
			
			System.out.println(element);
			
		}
		
		
		

	}

}
