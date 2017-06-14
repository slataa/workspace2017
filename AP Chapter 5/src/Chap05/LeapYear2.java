//********************************************************************
//  LeapYear2.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.2 
//********************************************************************

import java.util.Scanner;

public class LeapYear2
{
   //-----------------------------------------------------------------
   //  Reads an integer value representing a year. Determines if the
   //  year is a leap year. Processes multiple years.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      int year;
      boolean leap = false;
	  Scanner scan = new Scanner(System.in);

      System.out.print("\nEnter a year (0 to quit): ");
      year = scan.nextInt();

      while (year != 0)
      {

         if (year != 0)
         {
            if (year < 1582)
               System.out.println("ERROR: not valid in Gregorian calendar");
            else
            {
               if (year % 4 == 0) // divisible by 4
               {
                  leap = true;
                  //  Unless it is also divisible by 100 but not 400
                  if ((year % 100 == 0) && (year % 400 != 0))
                  {
                     leap = false;
                  }
               }
               if (leap)
                  System.out.println(year + " is a leap year");
               else
                  System.out.println(year + " is not a leap year");
            }
         }
         leap = false;

         System.out.print("\nEnter a year (0 to quit): ");
         year = scan.nextInt();
      }
   }
}