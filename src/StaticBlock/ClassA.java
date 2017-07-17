package StaticBlock;

public class ClassA {
	
	//static blocks
	
	static
	{
		
		System.out.println("Hello i am a static block");
	
		
	}
	
	
	//instance blocks
	{
		
		System.out.println("Hello i am a instance block");
		
	}
	
	
	//constructor
	
	public ClassA()
	{
		
		System.out.println("i am a constructor");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA a=new ClassA();
		
		

	}

}
