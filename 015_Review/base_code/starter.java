import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in); 
	
	System.out.println("what is your name?");
	String b=sc.nextLine();
	
	System.out.println("what is your title? ex: slayer of dragons");
	String c=sc.nextLine();
	
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
	
	System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
	System.out.println("Strength (1-10)");
	int e=sc.nextInt();
	int points = 25;

	if ( e <= 10 && e >= 1 ) 
	{
	System.out.println();
	points=25;
	points = points - e;
	System.out.println("You have " + points + " left to spend.");
	System.out.println();
	}
	else{
		System.out.println("You have not chosen the correct amount, please choose a number within 10");
		System.out.println("Strength (1-10)");
		e=sc.nextInt();
		if ( e <= 10 && e >= 1 ) 
		{
		System.out.println();
		points = points - e;
		System.out.println("You have " + points + " left to spend.");
		System.out.println();
		}
	}
		
	
	
	System.out.println("Dexterity (1-10)");
	int	dex=sc.nextInt();


	if ( dex <= 10 && dex >= 1 ) 
	{
	System.out.println();
    points =points - dex;
	System.out.println("You have " + points + " left to spend.");
	System.out.println();
	}
	else{
		System.out.println("You have not chosen the correct amount, please choose a number within 10");
		System.out.println("Dexterity (1-10)");
		dex=sc.nextInt();
		points = points - dex;
		if ( dex <= 10 && dex >= 1 ) 
		{
		System.out.println();
		points = points - dex;
		System.out.println("You have " + points + " left to spend.");
		System.out.println();
		}
	}
		
	
	System.out.println("Intelligence (1-10)");
	int intel=sc.nextInt();

	if ( intel <= 10 && intel >= 1 ) 
	{
	System.out.println();
    points =points - intel;
	System.out.println("You have " + points + " left to spend.");
	System.out.println();
	}
	else{
		System.out.println("You have not chosen the correct amount, please choose a number within 10");
		System.out.println("Intelligence (1-10)");
		intel=sc.nextInt();
		points = points - intel;
		if ( intel <= 10 && intel >= 1 ) 
		{
		System.out.println();
		points = points - intel;
		System.out.println("You have " + points + " left to spend.");
		System.out.println();
		}
	}
	
	System.out.println("Constitution (1-10)");
	int cons=sc.nextInt();


	if ( cons <= 10 && cons >= 1 ) 
	{
	System.out.println();
    points =points - cons;
	System.out.println("You have " + points + " left to spend.");
	System.out.println();
	}
	else{
		System.out.println("You have not chosen the correct amount, please choose a number within 10");
		System.out.println("Constitution (1-10)");
		cons=sc.nextInt();
		points = points - cons;
		if ( cons <= 10 && cons >= 1 ) 
		{
		System.out.println();
		points = points - cons;
		System.out.println("You have " + points + " left to spend.");
		System.out.println();
		}
	}
	System.out.println("Charisma (1-10)");
		int charisma=sc.nextInt();
		
		
	if ( charisma <= 10 && charisma >= 1 ) 
	{
	System.out.println();
    points =points - charisma;
	System.out.println("You have " + points + " left to spend.");
	System.out.println();
	}
	else{
		System.out.println("You have not chosen the correct amount, please choose a number within 10");
	}
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("------------------------------------------------------------------------------------");
	System.out.println("You are " + b + ", the " + c + " of CVHS. ");
	System.out.println("You're a " + a + " with the following stats!");
	System.out.println("Strength - " + e + ".");
	System.out.println("Dexterity - " + dex + ".");
	System.out.println("Intelligence - " + intel + ".");
	System.out.println("Constitution - " + cons + '.');
	System.out.println("Constitution - " + charisma + '.');
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("Good luck on your quest " + b + " !");
	
}
}