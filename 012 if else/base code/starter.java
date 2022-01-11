import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number between 1-1000");
	int a = sc.nextInt(); 
	String cd = sc.nextLine();
	Random b = new Random();
		int rand_num1 = b.nextInt(1001)+1;
		System.out.println(rand_num1);
		
	
	if(rand_num1 == a) {
		System.out.println("Your number was the random number!! The number was "+rand_num1+".");
	}
	else{
	System.out.println("Your number wasn't the random number. The number was "+rand_num1+".");
	}
	
}
}
