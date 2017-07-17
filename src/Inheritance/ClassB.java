package Inheritance;

public class ClassB  extends ClassA {
	
	int myamount=1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB a=new ClassB();
		
		System.out.println("***************Before Changing*******************");
		System.out.println("My father car is "+a.Car);
		
		System.out.println("My father given amount is "+a.amount);
		
		System.out.println("My own money is "+a.myamount);
		
		a.Car="Ford";
		a.nohouses=6;
		
		a.amount=50000;
		
		System.out.println("***************After Changing*******************");
        System.out.println("My father car is "+a.Car);
		
		System.out.println("My father given amount is "+a.amount);

	}
	
	
	
	public static void dosomething()
	{
		
		System.out.println("do some thing from child class");
		
	}

}
