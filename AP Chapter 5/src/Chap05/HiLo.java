//********************************************************************
//  HiLo.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.4
//********************************************************************

import java.util.Scanner;

public class HiLo
{
   //-----------------------------------------------------------------
   //  Randomly selects a number in a particular range, which the
   //  user attempts to guess.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      final int MAX = 100;
      int target, count, guess;
      String again = "y";

	  Scanner scan = new Scanner(System.in);
	  
      while (again.equalsIgnoreCase("y"))
      {
         System.out.println();
         System.out.println("Guess a number between 1 and " + MAX);

         target = (int) (Math.random() * MAX) + 1;

         count = 0;
         guess = 1;
         while (guess != target && guess > 0)
         {
            System.out.println();
            System.out.print("Enter your guess (0 to quit): ");
            guess = Integer.parseInt(scan.nextLine());
            count = count + 1;

            if (guess > 0)
               if (guess == target)
                  System.out.println("Right! Guesses: " + count);
               else
                  if (guess < target)
                     System.out.println("Your guess was too LOW.");
                  else
                     System.out.println("Your guess was too HIGH.");
         }

         System.out.println();
		 System.out.print("Play again (y/n)?: ");
         again = scan.nextLine();
      }
   }
}
