package ExceptionHandling;

public class CustomizeException extends Exception{
	
	
	public String message;
	
	public CustomizeException(String message)
	{
		
		this.message=message;
	}
	
	public String toString()
	{
		
		return message;
	}

}
