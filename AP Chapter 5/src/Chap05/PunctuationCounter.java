//********************************************************************
//  PunctuationCounter.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.15
//********************************************************************

import java.io.*;
import java.util.*;

public class PunctuationCounter
{
   //-----------------------------------------------------------------
   //  Counts the number of punctuation marks in an input file.
   //-----------------------------------------------------------------
   public static void main(String[] args) throws IOException
   {
      Scanner input = new Scanner(new File("punctuationFile.txt"));

      ArrayList<PunctuationMark> list = new ArrayList<PunctuationMark>();

      int listIndex;
      PunctuationMark mark;

      while (input.hasNext())  // process entire file
      {
         String line = input.nextLine();
         int index = 0;
         while (index < line.length())  // process every character in line
         {
            char ch = line.charAt(index);
            if (!Character.isLetterOrDigit(ch) &&
                !Character.isWhitespace(ch))
            {
               listIndex = 0;
               mark = null;
               while (listIndex < list.size())  // look for symbol in list
               {
	              if (list.get(listIndex).getSymbol() == ch)
                     mark = list.get(listIndex);
                  listIndex++;
	           }
               if (mark == null)
                  list.add(new PunctuationMark(ch));
               else
                  mark.incrementCount();
            }
            index++;
         }
      }

      // Print results
      listIndex = 0;
      while (listIndex < list.size())
      {
         mark = list.get(listIndex);
         System.out.println (mark.getSymbol() + "\t" + mark.getCount());
         listIndex++;
      }
   }
}
