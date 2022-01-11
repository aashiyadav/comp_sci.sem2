import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int a = sc.nextInt(); 
		String nm = sc.nextLine(); 
		
		System.out.println("enter another number");
		int b = sc.nextInt();
		String op = sc.nextLine();
		
		boolean one;
		one=(a==b);
		System.out.println(one);
		
		if(one){
			System.out.println("the nubers are the same");
		}
		
		if(one==false){
			System.out.println("your numbers are different!");
		}

	}
}
