import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DirectionalPanel 
{
	private final int WIDTH = 300, HEIGHT = 200;
	private final int JUMP = 10;
	
	private final int IMAGE_SIZE = 31;
	
	private ImageIcon up, down, left, right, currentImage;
	private int x, y;
	
	public DirectionalPanel()
	{
		addKeyListener(new DirectionalListener());
		
		x = WIDTH/2;
		y = HEIGHT/2;
		
		up = new ImageIcon("up.png");
		down = new ImageIcon("down.png");
		left = new ImageIcon("left.png");
		right = new ImageIcon("right.png");
		
		currentImage = right;
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setFocusable(true);
		
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		currentImage.paintIcon(this, page, x, y);
	}
	
	private class DirectionalListener implements KeyListener
	{
		public void keyPressed(KeyEvent e)
		{
			switch(e.getKeyCode())
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
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

}
