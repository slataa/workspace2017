//*********************************************************************
//  FileContrast.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.13
//*********************************************************************

import java.io.*;
import java.util.Scanner;

public class FileContrast
{
   //-----------------------------------------------------------------
   //  Contrasts two text files.
   //-----------------------------------------------------------------
   public static void main(String[] args) throws IOException
   {
      Scanner scan1 = new Scanner(new File("contrast1.txt"));
      Scanner scan2 = new Scanner(new File("contrast2.txt"));

      String line1, line2;
      int lineNum = 0;

      while (scan1.hasNext() && scan2.hasNext())
      {
         lineNum++;
         line1 = scan1.nextLine();
         line2 = scan2.nextLine();

         if (!line1.equals(line2))
         {
            System.out.println("Line " + lineNum + " in file 1: " + line1);
            System.out.println("Line " + lineNum + " in file 2: " + line2);
            System.out.println();
         }
      }
   }
}
