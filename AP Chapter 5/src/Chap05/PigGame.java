//********************************************************************
//  PigGame.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.11
//********************************************************************

public class PigGame
{
   private int goal;
   private PairOfDice dice;
   private PigPlayer computer, human, currentPlayer;

   //-----------------------------------------------------------------
   //  Sets up the game including the point goal for the game.
   //-----------------------------------------------------------------
   public PigGame(int target)
   {
      goal = target;

      dice = new PairOfDice();

      computer = new PigPlayer(20);
      human = new PigPlayer(PigPlayer.ASK);
   }

   //-----------------------------------------------------------------
   //  This method contains the primary game loop, which terminates
   //  only once a player has won the game.
   //-----------------------------------------------------------------
   public void play()
   {
      boolean noWinnerYet = true;
      currentPlayer = computer;

      while (noWinnerYet)
      {
         takeTurn();

         // Check for winner; otherwise switch players and continue
         if (currentPlayer.getPoints() >= goal)
            noWinnerYet = false;
         else
            if (currentPlayer == computer)
               currentPlayer = human;
            else
               currentPlayer = computer;
      }

      announceWinner();
   }

   //-----------------------------------------------------------------
   //  Plays one player's complete turn, allowing the player to
   //  roll the dice multiple times.
   //-----------------------------------------------------------------
   private void takeTurn()
   {
      boolean stillRolling = true;

      System.out.println("****************************************");
      System.out.println("Current Status:");
      System.out.println("   Computer: " + computer.getPoints());
      System.out.println("   You: " + human.getPoints());

      while (stillRolling)
         stillRolling = currentPlayer.roll(dice, goal);
   }

   //-----------------------------------------------------------------
   //  Announces the winner and prints the results.
   //-----------------------------------------------------------------
   private void announceWinner()
   {
      System.out.println();

      if (currentPlayer == computer)
         System.out.println("The computer has won!");
      else
         System.out.println("Congratulations, you have won!");

      System.out.println();
      System.out.println("Final Results:");
      System.out.println("   Computer: " + computer.getPoints());
      System.out.println("   You: " + human.getPoints());
   }
}
