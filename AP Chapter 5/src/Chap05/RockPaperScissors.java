//********************************************************************
//  RockPaperScissors.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.7
//********************************************************************

import java.util.Scanner;

public class RockPaperScissors
{
   //-----------------------------------------------------------------
   //  Plays the Rock-Paper-Scissors game with the user.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      final int OPTIONS = 3;
      final int ROCK = 1, PAPER = 2, SCISSORS = 3;
      final int COMPUTER = 1, PLAYER = 2, TIE = 3;

      int computerChoice, playerChoice, winner = 0;
      int wins = 0, losses = 0, ties = 0;
      String again;

	  Scanner scan = new Scanner(System.in);

      again = "y";
      while (again.equalsIgnoreCase("y"))
      {
         computerChoice = (int) (Math.random() * OPTIONS) + 1;

         System.out.println();
         System.out.print("Enter your choice - 1 for Rock, 2 for " +
                          "Paper, and 3 for Scissors: ");
         playerChoice = scan.nextInt();
         scan.nextLine();

         System.out.print("My choice was ");

         // Determine the winner
         if (computerChoice == ROCK)
         {
            System.out.println("Rock.");
            if (playerChoice == SCISSORS)
               winner = COMPUTER;
            else
               if (playerChoice == PAPER)
                  winner = PLAYER;
               else
                  winner = TIE;
         }
         else if (computerChoice == PAPER)
         {
            System.out.println("Paper.");
            if (playerChoice == ROCK)
               winner = COMPUTER;
            else
               if (playerChoice == SCISSORS)
                  winner = PLAYER;
               else
                  winner = TIE;
         }
         else  // must be scissors
         {
            System.out.println("Scissors.");
            if (playerChoice == PAPER)
               winner = COMPUTER;
            else
               if (playerChoice == ROCK)
                  winner = PLAYER;
               else
                  winner = TIE;
         }

         // Print results and increment appropriate counter
         if (winner == COMPUTER)
         {
            System.out.println("I win!");
            losses++;
         }
         else
            if (winner == PLAYER)
            {
               System.out.println("You win!");
               wins++;
            }
            else
            {
               System.out.println("We tied!");
               ties++;
            }

         System.out.println();
         System.out.print("Play again (y/n)? ");
         again = scan.nextLine();
      }

      // Print final results
      System.out.println();
      System.out.println("You won " + wins + " times.");
      System.out.println("You lost " + losses + " times.");
      System.out.println("We tied " + ties + " times.");
   }
}
