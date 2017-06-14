
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Animation
{
   //-----------------------------------------------------------------
   //  Displays the main frame of the program.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("MegaMan");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


      frame.getContentPane().add(new AnimationPanel());
      frame.pack();
      frame.setVisible(true);
      
   }
}
