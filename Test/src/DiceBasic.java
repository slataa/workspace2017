import java.util.Random;
import java.util.Scanner;

public class DiceBasic 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random rn = new Random();
		int counter;
		int dice1;
		int dice2;
		
		System.out.println("Enter the number of rolls: ");
		counter = input.nextInt();
		
		while(counter > 0)
		{
			dice1 = rn.nextInt(6)+1;
			dice2 = rn.nextInt(6)+1;
			System.out.println("Dice #1: "+ dice1);
			System.out.println("Dice #2: "+ dice2);
			System.out.println("Total: " + (dice1 + dice2));
			System.out.println();
			counter--;
		}

	}

}
