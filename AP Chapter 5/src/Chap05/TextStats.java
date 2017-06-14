//********************************************************************
//  TextStats.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.17
//********************************************************************

import javax.swing.JFrame;

public class TextStats
{
   //-----------------------------------------------------------------
   //  Creates and presents the program frame.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Text Statistics");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(new TextStatsPanel());
      frame.pack();
      frame.setVisible(true);
   }
}
