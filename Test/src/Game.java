import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Game extends JFrame
{
	int x,y,prevX,prevY;
	private Image dbImage;
	private Graphics dbGraphics;
	

	public class AL extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			int keyCode = e.getKeyCode();
			if(keyCode == e.VK_LEFT)
			{
				if(x<=0)
				{
					x = 0;
				}
				else
					x-=4;
			}
			
			if(keyCode == e.VK_RIGHT)
			{
				if(x >= 230)
				{
					x = 230;
				}
				else
					x+=4;
			}
			
			if(keyCode == e.VK_UP)
			{
				if(y <= 20)
				{
					y = 20;
				}
				else
					y-=4;
			}
			
			if(keyCode == e.VK_DOWN)
			{
				if(y >= 230)
				{
					y = 230;
				}
				else
					y+=4;
			}
		}
		
		public void keyReleased(KeyEvent e)
		{
			
		}
	}
	
	
	
	public Game()
	{
		x = 150;
		y = 150;
		addKeyListener(new AL());
		setTitle("Java Game");
		setLocation(400,400);
		setSize(250,250);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g)//used for double buffering
	{
		dbImage = createImage(getWidth(), getHeight());//image of current screen
		dbGraphics = dbImage.getGraphics();//stored in dbgraphics
		paintComponent(dbGraphics);//add to paint component
		g.drawImage(dbImage, 0, 0, this);//draw image
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(new Color(40,255,100));
		g.fillRect(0, 0, 250, 250);
		g.setColor(new Color(20,100,5));
		g.fillRect(x,y,20,20);
		repaint();
	}
	
	
	
	public static void main(String args[])
	{
		new Game();
	}
}
