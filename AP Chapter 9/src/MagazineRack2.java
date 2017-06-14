//*******************************************************************
//  MagazineRack2.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of the LinkedList class.
//*******************************************************************

import java.util.LinkedList;

public class MagazineRack2
{
   //----------------------------------------------------------------
   //  Creates a LinkedList, adds several magazines to the
   //  list, then prints it.
   //----------------------------------------------------------------
   public static void main (String[] args)
   {    
      LinkedList<Magazine> rack = new LinkedList<Magazine>();
      
      rack.add (new Magazine("Time"));
      rack.add (new Magazine("Wired"));
      rack.add (new Magazine("Communications of the ACM"));
      rack.add (new Magazine("House and Garden"));
      rack.add (new Magazine("GQ"));
      
      System.out.println (rack); 
   }
}
