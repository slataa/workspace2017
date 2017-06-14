//********************************************************************
//  Decode.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of the Stack class.
//********************************************************************

import java.util.Scanner;
import java.util.Stack;

public class Decode
{
   //-----------------------------------------------------------------
   //   Decodes a message by reversing each word in a string.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {  
      Stack<Character> word = new Stack<Character>();
      String message;
      int index = 0;
      Scanner scan = new Scanner (System.in);

      System.out.println ("Enter the coded message:");
      message = scan.nextLine();
      System.out.println ("The decoded message is:");

      while (index < message.length())
      {
         // Push word onto stack
         while (index < message.length() && message.charAt(index) != ' ')
         {
            word.push (new Character(message.charAt(index)));
            index++;
         }

         // Print word in reverse
         while (!word.isEmpty())
            System.out.print (word.pop());
         System.out.print (" ");
         index++;
      }

      System.out.println();
   }
}
