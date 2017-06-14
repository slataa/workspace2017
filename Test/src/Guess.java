import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int guess = -1;
		int answer;
		answer = rand.nextInt(100);
		int counter = 0;
		
		while(guess != answer)
		{
			System.out.println("Please enter your guess between 0 and 99: ");
			guess = input.nextInt();
			if(guess > answer)
				System.out.println("\nToo high.  Guess again.");
			if(guess < answer)
				System.out.println("\nToo low.  Guess again.");
			counter++;
		}
		
		System.out.println("You guessed it! It took "+counter+" tries.");

	}

}
