import java.util.Scanner;
class test {
	public static String multiply(int a, int b){
		int num1 = x;
		int num2 = y;
		int product = num1 * num2;
		if (product%3 == 0 ){
			return "it's divisible by 3";
		}
		else{
			return "it's not divisible by 3";
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number");
		int x = sc.nextInt();
		System.out.println("please enter another number");
		int y = sc.nextInt();
		System.out.println(multiply(num1,num2));
		
		
		
		
	}
}
