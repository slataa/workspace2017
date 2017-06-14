//********************************************************************
//  Die2Test.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.9
//********************************************************************

public class Die2Test
{
   //-----------------------------------------------------------------
   //  Creates a Die2 object and tests the face mutator.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      Die2 die = new Die2();

      System.out.println("Original value: " + die);

      die.setFaceValue(3);
      System.out.println("After setting to 3: " + die);

      die.setFaceValue(0);
      System.out.println("After setting to 0: " + die);

      die.setFaceValue(7);
      System.out.println("After setting to 7: " + die);
   }
}
