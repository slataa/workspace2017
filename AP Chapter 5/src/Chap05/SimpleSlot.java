//********************************************************************
//  SimpleSlot.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.8
//********************************************************************

import java.util.Scanner;

public class SimpleSlot
{
   //-----------------------------------------------------------------
   //  Plays a simple slot machine using digits.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      final int DIGITS = 10;
      int slot1, slot2, slot3;
      String again;

	  Scanner scan = new Scanner(System.in);

      again = "y";
      while (again.equalsIgnoreCase("y"))
      {
         slot1 = (int) (Math.random() * DIGITS);
         slot2 = (int) (Math.random() * DIGITS);
         slot3 = (int) (Math.random() * DIGITS);

         System.out.println (slot1 + "  " + slot2 + "  " + slot3);

         if (slot1 == slot2 && slot2 == slot3)
            System.out.println("Jackpot!!!");
         else
            if (slot1 == slot2 || slot2 == slot3 || slot1 == slot3)
               System.out.println("Matched 2!!");

         System.out.println();
         System.out.print("Play again (y/n)?: ");
         again = scan.nextLine();
      }
   }
}
