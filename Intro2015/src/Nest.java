import java.util.Scanner;

public class Nest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int choice;
		int grade;
		
		System.out.print("Type 1 to play, 2 to leave: ");
		choice = input.nextInt();
		
		if(choice == 1)
		{
			System.out.println("\nLet's begin!");
			System.out.print("Enter the first grade: ");
			choice = input.nextInt();
			
			if(choice >= 90)
			{
				System.out.println("That is an A");
			}
			
			if(choice >= 80)
			{
				System.out.println("That is a B");
			}
			
			if(choice >= 70)
			{
				System.out.println("You should probably do better...");
			}
			
		}
		
		else
		{
			System.out.println("Then why did you start the program!? \nBye!");
		}
		

	}

}
