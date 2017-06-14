//Name
//Date
//Different Control Statements

import java.util.Scanner;

public class ControlStatements
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		//Counter Controlled loop - has a set limit to the number of repetitions, either user entered or initially set
		int counter = 1;

		
		System.out.print("Please enter the number of repetitions: ");
		int limit = input.nextInt();
		
		while(counter <= limit)
		{
			System.out.print(counter);
			counter++;
			System.out.println();
		}
		
		
		//Sentinel Controlled loop - infinite loop until the sentinel value is altered
		
		int sentinel = 0;
		String word = "go";
		while( sentinel != -1)
		{
			System.out.print("\nMake me stop:  ");
			//word = input.nextLine();
			sentinel = input.nextInt();
		}
	}
}

















