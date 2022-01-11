import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your first name?");
		String nm = sc.nextLine(); 
		
		System.out.println("how old are you?");
		int a = sc.nextInt(); 
		String ge = sc.nextLine();
		
		System.out.println("which month were you born in?");
		String bd = sc.nextLine(); 
		
		System.out.println("what date were you born on?");
		int b = sc.nextInt(); 
		
		System.out.println("which year were you born in?");
		int c = sc.nextInt(); 
		
		System.out.println("how much is a buck fifty?");
		double d = sc.nextDouble();
		
		System.out.println("Your name is "+nm+ " and you are born in 0"+bd+ "/" +b+ "/"+c+ ".");
		System.out.println("You are "+a+ " years old!!");
		System.out.println("You have a $"+d+ " in your wallet.");
	
	}
}
