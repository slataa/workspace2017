//********************************************************************
//  PunctuationMark.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.15
//********************************************************************

public class PunctuationMark
{
   private char symbol;  // the symbol itself, such as ';'
   private int count;    // the number of this symbol encountered

   //-----------------------------------------------------------------
   //  Constructor: Sets the symbol and an initial count of 1.
   //-----------------------------------------------------------------
   public PunctuationMark(char mark)
   {
      symbol = mark;
      count = 1;
   }

   //-----------------------------------------------------------------
   //  Increments the count.
   //-----------------------------------------------------------------
   public char getSymbol()
   {
      return symbol;
   }

   //-----------------------------------------------------------------
   //  Increments the count.
   //-----------------------------------------------------------------
   public void incrementCount()
   {
      count++;
   }

   //-----------------------------------------------------------------
   //  Returns the current count.
   //-----------------------------------------------------------------
   public int getCount()
   {
      return count;
   }
}
