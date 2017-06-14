//John Fitzpatrick
//10/27/15
//Plays Hi-low

import java.util.Random;
import java.util.Scanner;
public class HiLow 
{

	public static void main(String[] args)
	{
		int correct;
		int guess = 0;
		String response;
		
		Scanner input = new Scanner(System.in);
		Random randy = new Random();
		
		correct = randy.nextInt(10000) +1;
		System.out.print("Would you like to play hi-low (yes or no): ");
		String answer = input.next();
		if(answer.equalsIgnoreCase("yes"))
		{
		System.out.print("Guess a number between 1 and 10000: ");
		guess = input.nextInt();
		}
		else
		{
			System.out.print("Oh. Well, I guess I'll just play against myself then *cough cough loser.");
			
			
			int counter = 0;
			
			System.out.print("Guess a number between 1 and 10000: ");
			
			//System.out.print(boy.getFirstGuess(10000, 0 , correct));
			
			TheGuesser boy = new TheGuesser(correct);
			
			//while(counter < 10)
			while(guess != correct)
			{
				if(boy.getGuess() > correct)
				{
					response = "The correct answer is lower.";
					System.out.println(response);
					boy.setGuess(response);
				}
				if(guess < correct)
				{
					response = "The correct answer is higher.";
					System.out.println(response);
					boy.setGuess(response);
				}
				
				System.out.print(correct + " Guess again:" + boy.getGuess() + "\n");
				
				guess = boy.getGuess();
				
				counter++;
			}
			System.out.println("CONGRATULATIONS!!! That was right. And it only took The Guesser " + counter + " guesses.");
			System.out.print("The correct value was "+correct);
		}
		int counter = 0;
		
		
		while(answer.equalsIgnoreCase("yes"))
		{
		while(guess != correct)
		{
			if(guess > correct)
			{
				System.out.println("The correct answer is lower.");
			}
			if(guess < correct)
			{
				System.out.println("The correct answer is higher");
			}
			
			System.out.print("Guess again:");
			guess = input.nextInt();
			
			counter++;
		}
		
		
		System.out.print("CONGRATULATIONS!!! That was right. And it only took you " + counter + " guesses." +
		 " Would you like to play again");
		answer = input.next();
			if(answer.equalsIgnoreCase("yes"))
			{	
				
				System.out.print("Ok, what is your first guess: ");
				correct =randy.nextInt(10000) + 1;
				guess = input.nextInt();
				counter =0;
			}
			else
			{
				System.out.print("Ok have a nice day.");
			}
		
		
		}
	}

}
