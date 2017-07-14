package ClassAndObject;

public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Named object
//		
//		ClassA a=new ClassA();
//		a.generateAddress();
//		
//		
//		generatePhoneNumber();
//		
		
		//Name less object
		
//		new ClassA().generateAddress();
		
		
		
		//Accessing static members through class name
		
		ClassA.generateAddress();
		ClassB.generatePhoneNumber();
		
		
		

	}
	
	
	public static void generatePhoneNumber()
	{
		
		System.out.println("The phone number is"+"********");
	}

}
