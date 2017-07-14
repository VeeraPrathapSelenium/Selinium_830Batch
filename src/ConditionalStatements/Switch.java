package ConditionalStatements;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		int day=sc.nextInt();
			
		//int day=1;
		
		switch(day) 
		{
		
		case 1:
			System.out.println("Sunday");
			
			break;
			
		case 2:
			System.out.println("Monday");
			break;
			
		case 3:
			System.out.println("Tuesday");
			break;
			
		case 4:
			System.out.println("Wed");
			break;
			
		case 5:
			System.out.println("Thr");
			break;
			
		case 6:
			System.out.println("Fri");
			break;
		case 7:
			System.out.println("Sat");
			break;
			
		default:
			
			System.out.println("Invalid input");
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
	}

}
