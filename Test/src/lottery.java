import java.util.Scanner;
import java.util.Random;

public class lottery
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        Random rng = new Random();
        int coins = 100;
        boolean done = false;
        
        System.out.println("Welcome to the GV Lottery!");
        System.out.println("You have: 100 coins.");
        
        while(!done)
        {
            System.out.println("Enter a number between 0 and 99, inclusive.");
            int answer1 = input.nextInt();
            System.out.println("Enter a number between 0 and 99, inclusive.");
            int answer2 = input.nextInt();
            System.out.println("Enter a number between 0 and 99, inclusive.");
            int answer3 = input.nextInt();
            System.out.println("Enter a number between 0 and 99, inclusive.");
            int answer4 = input.nextInt();
            System.out.println("Enter a number between 0 and 99, inclusive.");
            int answer5 = input.nextInt();
            System.out.println("Enter a number between 0 and 99, inclusive.");
            int answer6 = input.nextInt();
            
            int number1 = rng.nextInt(100), number2 = rng.nextInt(100), number3 = rng.nextInt(100), number4 = rng.nextInt(100), number5 = rng.nextInt(100), number6 = rng.nextInt(100);
            System.out.println("The numbers are: " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5 + ", " + number6);
            
            if(answer1 == number1 && answer2 == number2 && answer3 == number3 && answer4 == number4 && answer5 == number5 && answer6 == number6)
            {
                coins = coins + 999999;
            }
            else
            {
                coins--;
            }
            System.out.println("You have: " + coins + " coins.");
            
            if(coins == 0)
            {
                done = true;
            }
            
            System.out.println();
        }
        
        System.out.println("You loser.");
    }
}