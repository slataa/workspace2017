//********************************************************************
//  StyleOptions2.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.16
//********************************************************************

import javax.swing.JFrame;

public class StyleOptions2
{
   //-----------------------------------------------------------------
   //  Creates and presents the program frame.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Style Options 2");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      StyleOptionsPanel2 panel = new StyleOptionsPanel2();
      frame.getContentPane().add(panel);

      frame.pack();
      frame.setVisible(true);
   }
}
