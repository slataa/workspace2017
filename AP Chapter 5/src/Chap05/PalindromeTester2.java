//********************************************************************
//  PalindromeTester2.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.5
//********************************************************************

import java.util.Scanner;

public class PalindromeTester2
{
   //-----------------------------------------------------------------
   //  Tests strings to see if they are palindromes, ignoring case
   //  differences, spaces, and punctuation.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      String str, str2, another = "y";
      int left, right;

      Scanner scan = new Scanner(System.in);

      while (another.equalsIgnoreCase("y")) // allows y or Y
      {
         System.out.println("Enter a potential palindrome:");
         str = scan.nextLine();

         str = str.toLowerCase();  // eliminate case issues

         //  eliminate punctuation and spaces
         str2 = "";
         for (int i=0; i < str.length(); i++)
            if (Character.isLetterOrDigit(str.charAt(i)))
               str2 += str.charAt(i);
         str = str2;

         left = 0;
         right = str.length() - 1;

         while (str.charAt(left) == str.charAt(right) && left < right)
         {
            left++;
            right--;
         }

         System.out.println();

         if (left < right)
            System.out.println("That string is NOT a palindrome.");
         else
            System.out.println("That string IS a palindrome.");

         System.out.println();
         System.out.print("Test another palindrome (y/n)? ");
         another = scan.nextLine();
      }
   }
}
