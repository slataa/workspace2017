
import java.awt.*;

import javax.swing.*;

public class AnimationPanel extends JPanel
{
   private final int WIDTH = 900, HEIGHT = 800;
   
   int frameCount=0;
   int downCount= 15;
   
   String imageName = "src/frame" +frameCount + ".png";
   private ImageIcon image;
   private int x, y;

   //-----------------------------------------------------------------
   //  Sets up the panel, including the timer for the animation.
   //-----------------------------------------------------------------
   public AnimationPanel()
   {
   
      image = new ImageIcon(imageName);

      setPreferredSize(new Dimension(WIDTH, HEIGHT));
      setBackground(Color.black);
    
   }

   //-----------------------------------------------------------------
   //  Draws the image in the current location.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics page)
   {
      super.paintComponent(page);

      	frameCount++;    	  
      	if(frameCount == 15)
    		  frameCount = 0;
      	System.out.println(frameCount);
    	  try 
    	  {
			Thread.sleep(50);
    	  } catch (InterruptedException e) 
    	  {
			// TODO Auto-generated catch block
			e.printStackTrace();
    	  }
    	  imageName = "src/frame" +frameCount + ".png";
    	  image = new ImageIcon(imageName);
    	  image.paintIcon(this, page, x, y);
    	  repaint();

    	  
      
   }

}
