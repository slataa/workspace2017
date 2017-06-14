package Keyboard;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Keys extends JPanel
{
	Color c;
	Random r;
	ImageIcon mario, ground;
	final int groundWidth, groundHeight;
	final int GRAVITY = 10;
	final int TERMINAL = 200;
	ImageIcon[] GROUND = new ImageIcon[6];
	int gxMOVE;
	
	public Keys()
	{
		addKeyListener(new TypeListener());
		setFocusable(true);
		mario = new ImageIcon("src/mario.gif");
		ground = new ImageIcon("src/ground.png");
		gxMOVE = 100;
		
		groundWidth = groundHeight = 100;
		
		Image image = ground.getImage();
		Image newImage = image.getScaledInstance(groundWidth, groundHeight, java.awt.Image.SCALE_SMOOTH);
		ground = new ImageIcon(newImage);
		
		for(int i = 0; i < GROUND.length; i++)
		{
			GROUND[i] = ground;
			
		} 
		
		
		r = new Random();
		c = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(c);

		mario.paintIcon(this, g, 50, 500 - ground.getIconHeight() - mario.getIconHeight());
		
		for(int i = 0; i < GROUND.length; i++)
		{
			GROUND[i].paintIcon(this, g, 100*i-gxMOVE, 500 - GROUND[i].getIconHeight());
			if(100*i-gxMOVE <= 0)
				GROUND[i].paintIcon(this, g, 500-100*i, 500 - GROUND[i].getIconHeight());
		}
		
	}
	
	public void jump()
	{
		
	}
	
	public void right()
	{
		gxMOVE += 10;
	}
	
	private class TypeListener implements KeyListener
	{

		@Override
		public void keyTyped(KeyEvent e) 
		{
			// TODO Auto-generated method stub
			
			
		}

		@Override
		public void keyPressed(KeyEvent e) 
		{
			// TODO Auto-generated method stub
			if(e.getKeyCode() == (KeyEvent.VK_C))
				c = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
			switch(e.getKeyCode())
			{
			case KeyEvent.VK_UP:
				System.out.println("UP");
				jump();
				break;
			case KeyEvent.VK_DOWN:
				System.out.println("DOWN");
				break;
			case KeyEvent.VK_LEFT:
				System.out.println("LEFT");
				break;
			case KeyEvent.VK_RIGHT:
				System.out.println("RIGHT");
				right();
				break;
			}
			
			
			
			System.out.print(" " +e.getKeyChar());
					
			repaint();
			
		}

		@Override
		public void keyReleased(KeyEvent e) 
		{
			// TODO Auto-generated method stub
			
		}
		
	}

}
