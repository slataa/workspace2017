//********************************************************************
//  LeapYear.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.1 
//********************************************************************

import java.util.Scanner;

public class LeapYear
{
   //-----------------------------------------------------------------
   //  Reads an integer value representing a year. Determines if the
   //  year is a leap year
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      int year;
      boolean leap = false;
	  Scanner scan = new Scanner(System.in);

      System.out.print("Enter a year : ");
      year = scan.nextInt();

      if (year < 1582)
         System.out.println("ERROR: not valid in Gregorian calendar");
      else
      {
         if (year % 4 == 0)  // divisible by 4
         {
            leap = true;
            //  Unless it is divisible by 100 but not 400
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
}