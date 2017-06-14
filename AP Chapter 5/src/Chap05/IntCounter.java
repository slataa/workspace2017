package Chap05;
//********************************************************************
//  IntCounter.java       
//
//  Solution to Programming Project 5.14
//********************************************************************

import java.io.*;
import java.util.Scanner;

public class IntCounter
{
   //-----------------------------------------------------------------
   //  Counts the number of integers read from a text file and then
   //  prints a table of the integers and a total count of integers
   //  found in the file.
   //-----------------------------------------------------------------
   public static void main(String[] args) throws IOException
   {
      int count = 0;

      Scanner input = new Scanner(new File("src/Chap05/input.txt"));
      System.out.println();
      System.out.println("Integers found: ");

      while (input.hasNextInt())
      {
         System.out.print(input.nextInt() + "\t");
         count++;
         if (count%5 == 0)
            System.out.println();
      }

      System.out.println();
      System.out.println();
      System.out.println(count + " total integers found.");
   }
}
