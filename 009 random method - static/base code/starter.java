import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random a = new Random();
		int rand_num1 = a.nextInt(10);
		System.out.println(rand_num1);
		
		Random b = new Random();
		int rand_num2 = b.nextInt(100);
		rand_num2 = rand_num2+1;
		System.out.println(rand_num2);
		
		Random c = new Random();
		double rand_num3 = c.nextDouble();
		rand_num3 = rand_num3+2.5;
		System.out.println(rand_num3);
		
		Random d = new Random();
		double rand_num4 = d.nextDouble();
		rand_num4 = rand_num4-14+589;
		System.out.println(rand_num4);
		
	
		
	
		
		
		
		
		
		
		
		
	}
}
