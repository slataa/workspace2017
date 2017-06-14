//********************************************************************
//  DirectionPanel.java       Author: Lewis/Loftus
//
//  Represents the primary display panel for the Direction program.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DirectionPanel extends JPanel
{
   private final int WIDTH = 300, HEIGHT = 200;
   private final int JUMP = 10;  // increment for image movement

   private final int IMAGE_SIZE = 31;

   private ImageIcon up, down, right, left, currentImage;
   private ImageIcon up2, down2, right2, left2, currentImage2;
   private int x, y;
   private int x2, y2;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this panel and loads the images.
   //-----------------------------------------------------------------
   public DirectionPanel()
   {
      addKeyListener(new DirectionListener());

      x = WIDTH / 2;
      y = HEIGHT / 2;
      
      x2 = 10;
      y2 = 10;

      up2 = new ImageIcon("src/arrowUp.gif");
      down2 = new ImageIcon("src/arrowDown.gif");
      left2 = new ImageIcon("src/arrowLeft.gif");
      right2 = new ImageIcon("src/arrowRight.gif");
      
      

      up = new ImageIcon("src/arrowUp.gif");
      down = new ImageIcon("src/arrowDown.gif");
      left = new ImageIcon("src/arrowLeft.gif");
      right = new ImageIcon("src/arrowRight.gif");

      currentImage = right;
      currentImage2 = left2;
      

      setBackground(Color.black);
      setPreferredSize(new Dimension(WIDTH, HEIGHT));
      setFocusable(true);
   }

   //-----------------------------------------------------------------
   //  Draws the image in the current location.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics page)
   {
      super.paintComponent(page);
      currentImage.paintIcon(this, page, x, y);
  
      currentImage2.paintIcon(this, page, x2, y2);
   }

   //*****************************************************************
   //  Represents the listener for keyboard activity.
   //*****************************************************************
   private class DirectionListener implements KeyListener
   {
      //--------------------------------------------------------------
      //  Responds to the user pressing arrow keys by adjusting the
      //  image and image location accordingly.
      //--------------------------------------------------------------
      public void keyPressed(KeyEvent event)
      {
    	 switch(event.getKeyCode())
    	 {
    	 case KeyEvent.VK_W:
    		   currentImage2 = up2;
               y2 -= JUMP;
               break;
            case KeyEvent.VK_S:
               currentImage2 = down2;
               y2 += JUMP;
               break;
            case KeyEvent.VK_A:
               currentImage2 = left2;
               x2 -= JUMP;
               break;
            case KeyEvent.VK_D:
               currentImage2 = right2;
               x2 += JUMP;
               break;
    	 }
         switch (event.getKeyCode())
         {
            case KeyEvent.VK_UP:
               currentImage = up;
               y -= JUMP;
               break;
            case KeyEvent.VK_DOWN:
               currentImage = down;
               y += JUMP;
               break;
            case KeyEvent.VK_LEFT:
               currentImage = left;
               x -= JUMP;
               break;
            case KeyEvent.VK_RIGHT:
               currentImage = right;
               x += JUMP;
               break;
         }

         repaint();
      }

      //--------------------------------------------------------------
      //  Provide empty definitions for unused event methods.
      //--------------------------------------------------------------
      public void keyTyped(KeyEvent event) {}
      public void keyReleased(KeyEvent event) {}
   }
}
