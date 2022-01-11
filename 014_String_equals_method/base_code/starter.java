import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in); 
	System.out.println("Would you like to be a wizard, warrior or a rogue, type your answer in lower case");
	String a=sc.nextLine();
	boolean x=(a.equals("wizard"));
	boolean y=(a.equals("rogue")); 
	boolean z=(a.equals("warrior"));
	if(x)
	{
		System.out.println("You have chose the wizard! Excelsior! ");
	}
	else if(z)
	{
		System.out.println("You have chosen the warrior! For honor!!"); 
	}
	else if(y)
	{ 
		System.out.println("You've chosen the Rogue! How cunning!");
	}
	else{
		System.out.println("You have not chosen an option, please choose an options");
	}
}
}