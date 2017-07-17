package StaticBlock;

public class ClassB {
	static
	{
	System.out.println("Hello i am a static block from classB");	
		
	}
	
	
	
	{
		
		System.out.println("Hello i am a instance block from classB");
	}

}
