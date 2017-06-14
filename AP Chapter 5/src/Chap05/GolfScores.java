package Chap05;
import java.io.*;
import java.util.*;

public class GolfScores
{
   //-----------------------------------------------------------------
   //  Reads golf score information and produces a summary.
   //-----------------------------------------------------------------
   public static void main(String [] args) throws IOException
   {
      final int HOLES = 18, VALUES_PER_LINE = 5;

      // Par total at index 0, player totals at indexes 1-4
      ArrayList<Integer> scores = new ArrayList<Integer>(VALUES_PER_LINE);

      // Fill list with zeros initially
      int index = 0;
      while (index < VALUES_PER_LINE)
      {
         scores.add(0);
         index++;
      }

      Scanner scan = new Scanner(new File("src/Chap05/golf.txt"));

      // Sum par and scores for all holes
      int hole = 0;
      while (hole < HOLES)
      {
         index = 0;
         while (index < VALUES_PER_LINE)
         {
            scores.set(index, scores.get(index) + scan.nextInt());
            index++;
         }
         hole++;
      }

      // Print results and determine winner
      System.out.println("Par for the course: " + scores.get(0));
      int player = 1, minPlayer = 1;
      while (player < VALUES_PER_LINE)
      {
         System.out.println("Player " + player + ": " + scores.get(player));
         if (scores.get(player) < scores.get(minPlayer))
            minPlayer = player;
         player++;
      }

      System.out.println("The winner is Player " + minPlayer + "!");
   }
}
