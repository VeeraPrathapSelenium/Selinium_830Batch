package Constructors;

public class Constructors {
	
	
	//Constructor non paratmerized
	
	public int a;
	public int b;
	
	public Constructors()
	{
		
		//this(12,56);
		System.out.println("I am zero argument constructortor");
		
	}
	
	
	//Parametrized constructor
	
	public Constructors(int a,int b)
	{
		
		
		System.out.println("I am 2 argument constructortor");
		
		this.a=a;
		
		this.b=b;
		
			
	}
	
	public static void main(String[] args) {
			
		
		//Object creation
		
		Constructors cons=new Constructors(34,56);
		
		
		System.out.println("The value of a is "+cons.a);
		
		System.out.println("The value of a is "+cons.b);

	}

}
