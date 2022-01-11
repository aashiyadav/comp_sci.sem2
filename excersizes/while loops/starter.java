import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	int c = 25;
	while(true)
	{
		if (c==4)
		{
		break;
		
		}
		System.out.println(c);
		c = c-1;
	}
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("Please input a integer.");
	int number = sc.nextInt();
	int factorial = number - 1;
	
	while(true)
	{
		//System.out.println(number);
		number = number * factorial;
		if(number == 0)
		{
			break;
		}
		factorial = factorial - 1; 
		System.out.println(number);
	}
	
		
	}
	
	System.out.println();
	System.out.println();
	System.out.println();
	
	
}
