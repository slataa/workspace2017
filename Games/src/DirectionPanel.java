//********************************************************************
//  DirectionPanel.java       Author: Lewis/Loftus
//
//  Represents the primary display panel for the Direction program.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Time;
import java.util.Random;
public class DirectionPanel extends JPanel
{
	
   private final int WIDTH = 800, HEIGHT = 600;
   private final int MOVE = 2;  // increment for image movement

   private final int IMAGE_SIZE = 31;
   private ImageIcon face;
   private ImageIcon door;
   
   private int x, y;
   private int x2, y2;
   
   private int dx, dy, total;
   private int totalDistance = WIDTH/2+HEIGHT/2; //If player stays in bounds, this id the total distance they can achieve
   private int red, blue, green;
   
   private Random rand = new Random();
   private int numDoorFound = 0;
   private boolean doorFound = false;
   private final int TOLERANCE = 25;
   
   private String strNumDoors = "Doors Found: " + numDoorFound;
   JLabel textField = new JLabel();
   
   //-----------------------------------------------------------------
   //  Constructor: Sets up this panel and loads the images.
   //-----------------------------------------------------------------
   public DirectionPanel()
   {
      addKeyListener(new DirectionListener());
      
      x = WIDTH / 2;
      y = HEIGHT / 2;

      face = new ImageIcon("src/happyface.gif");
      door = new ImageIcon("src/Door.png");
      
      setDoorPos();
      getDistance();
      
      setPreferredSize(new Dimension(WIDTH, HEIGHT));
      setFocusable(true);
      
      textField.setBounds(0, 0, 95, 15);
      textField.setOpaque(true);
      textField.setBackground(new Color(245, 245, 245));
   }

   
   
   
   //-----------------------------------------------------------------
   //  Draws the image in the current location.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics page)
   {
      super.paintComponent(page);
      background();
      
      if(doorFound)
    	  door.paintIcon(this, page, x2, y2);
      
      face.paintIcon(this, page, x, y);
      
      strNumDoors = "Doors Found: " + numDoorFound;
      textField.setText(strNumDoors);
      textField.paint(page);
   }
   
   
   
   
   public void getDistance()
   {
	   dx = (int) Math.sqrt(Math.pow((x - x2), 2));
	   dy = (int) Math.sqrt(Math.pow((y - y2), 2));
	   
	   total = dx + dy;
	   
	  //System.out.println(dx + "|" + dy + "|" + total);
	   
	   red =(int)(((totalDistance)-total)/(((double)totalDistance)/255));
	   blue = (int)((total)/(((double)totalDistance)/255));
	   green = (int)((total)/(2*((double)totalDistance)/255));
	   
	   
	   //Just in case player goes out of bounds. 
	   red = (red > 255) ? 255:red;
	   red = (red < 0) ? 0:red;
	   
	   blue = (blue > 255) ? 255:blue;
	   blue = (blue < 0) ? 0:blue;
	   
	   green = (green > 255) ? 255:green;
	   green = (green < 0) ? 0:green;
	   
	   //System.out.println(red + " | " + blue + " | " + green );
   }
   
   public void background()
   {
	   setBackground(new Color(red, green, blue));
   }
   
   public void setDoorPos()
   {
	   x2 = rand.nextInt(WIDTH);
	   y2 = rand.nextInt(HEIGHT);
   }
   
   public void checkForDoor()
   {
	   if(x > (x2 - TOLERANCE) 
		    && x < (x2 + TOLERANCE)
		    && y > (y2 - TOLERANCE)
		    && y < (y2 + TOLERANCE))
	   {
		   doorFound = true;
	   }
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
         switch (event.getKeyCode())
         {
            case KeyEvent.VK_UP:
               y -= MOVE;
               break;
            case KeyEvent.VK_DOWN:
               y += MOVE;
               break;
            case KeyEvent.VK_LEFT:
               x -= MOVE;
               break;
            case KeyEvent.VK_RIGHT:
               x += MOVE;
               break;
            case KeyEvent.VK_SPACE:
               if(doorFound)
               {
            	   numDoorFound++;
            	   
            	   setDoorPos();
            	   doorFound = false;
               }
               checkForDoor();
               break;
         }
         
  	     getDistance();
         background();
         repaint();
      }

      //--------------------------------------------------------------
      //  Provide empty definitions for unused event methods.
      //--------------------------------------------------------------
      public void keyTyped(KeyEvent event) {}
      public void keyReleased(KeyEvent event) {}
   }
   
   public int getNumDoorFound()
   {
	   return numDoorFound;
   }
}
