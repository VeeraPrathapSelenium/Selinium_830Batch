package ExceptionHandling;

public class SimpleTryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			System.out.println("i am starting my execution");
			System.out.println(10/0);
			
			System.out.println("Execution completed");
			
		}
			catch(Exception e)
		{
			
			System.out.println(e);
			
		}
	
		finally
		{
			
			System.out.println("i am from finally block");
			
		}
		
		

	}

}
