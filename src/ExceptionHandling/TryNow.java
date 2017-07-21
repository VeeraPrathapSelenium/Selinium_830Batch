package ExceptionHandling;

public class TryNow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int y=2;
				
				try
		{
				if(y>1)	
				{
					
					throw new CustomizeException("Hello my own exception");
				}
					
		}
		catch(Exception e)
		{
			
			System.out.println(e);
		}

	}

}
