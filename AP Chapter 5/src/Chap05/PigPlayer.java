//********************************************************************
//  PigPlayer.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.11
//
//  The PigPlayer class represents one player of the game, either the
//  human player or the computer.  Each player tracks his total points
//  and the points accumulated this round. The player's limit is the
//  number of points he is willing to accumulate in one round before
//  passing to the next player. This is dynamic for the human player.
//********************************************************************

import java.util.Scanner;
import java.util.*;

public class PigPlayer
{
   public final static int ASK = -1;  // prompt for round termination

   private int total;  // total points accumulated in game
   private int round;  // points accumulated in current round
   private int limit;  // pass tolerance

   //-----------------------------------------------------------------
   //  Initializes the point accumulators to zero, and the round
   //  limit as specified.
   //-----------------------------------------------------------------
   public PigPlayer(int max)
   {
      total = 0;
      round = 0;
      limit = max;
   }

   //-----------------------------------------------------------------
   //  Rolls the dice once and deals with the results. Returns true
   //  if the player should roll again and false otherwise. The
   //  player will not roll again if he busts or wins, or if his
   //  round limit is reached.
   //-----------------------------------------------------------------
   public boolean roll(PairOfDice dice, int goal)
   {
      boolean rollAgain = true;

      dice.roll();
      System.out.println (dice);

      int die1 = dice.getDie1FaceValue();
      int die2 = dice.getDie2FaceValue();

      if (die1 == 1 || die2 == 1)
      {
         System.out.println("Busted!!!");
         rollAgain = false;
         round = 0;
         if (die1 == 1 && die2 == 1)
            total = 0;
      }
      else
      {
         round += die1 + die2;
         System.out.println("Current Round: " + round);
         System.out.println("Potential Total: " + (total+round));

         if ((total+round) >= goal)
            rollAgain = false;
         else
            if (limit == ASK)
            {
               System.out.print("Take another turn (y/n)? ");
			   Scanner scan = new Scanner(System.in);
               String again = scan.nextLine();
               rollAgain = again.equalsIgnoreCase("y");
            }
            else
               if (round >= limit)
                  rollAgain = false;

         if (! rollAgain)
         {
            total += round;
            round = 0;
         }
      }

      return rollAgain;
   }

   //-----------------------------------------------------------------
   //  Returns the total number of points accumulated by this player.
   //-----------------------------------------------------------------
   public int getPoints()
   {
      return total;
   }
}
