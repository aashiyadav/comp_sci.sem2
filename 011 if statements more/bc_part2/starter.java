import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter your first number");
		int a = sc.nextInt(); 
		String nm = sc.nextLine(); 
		
		System.out.println("please enter your second number");
		int b = sc.nextInt(); 
		String op = sc.nextLine(); 
		
		System.out.println("please enter your third number");
		int c = sc.nextInt(); 
		String qr = sc.nextLine(); 
		
		if((a > b) && (a > c)){
			System.out.println("your first number is the largest out of the three!");
			System.out.println("the number was "+a+"");
		}
		
		if((b > a) && (b > c)){
			System.out.println("your second number is the largest out of the three!");
			System.out.println("the number was "+b+"");
		}
		
		if((c > b) && (c > a)){
			System.out.println("your third number is the largest out of the three!");
			System.out.println("the number was "+c+"");
		}
		
		if((a < b) && (a < c)){
			System.out.println("your first number is the smallest out of the three!");
			System.out.println("the number was "+a+"");
		}
		
		if((b < a) && (b < c)){
			System.out.println("your second number is the smallest out of the three!");
			System.out.println("the number was "+b+"");
		}
		
		if((c < b) && (c < a)){
			System.out.println("your third number is the smallest out of the three!");
			System.out.println("the number was "+c+"");
		}
	}
}
