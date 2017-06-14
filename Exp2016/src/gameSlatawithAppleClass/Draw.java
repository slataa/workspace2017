package gameSlatawithAppleClass;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Draw extends JPanel
{
	final int WIDTH;
	final int HEIGHT;
	final int BASKETMOVE = 5;
	int score = 0;
	int lives = 4;
	boolean end = false;
	int x, y, moveX, moveY, bx, by;
	final int IMAGE_SIZE = 40;
	
	ImageIcon icon;
	ImageIcon orchard;
	ImageIcon basket;
	
	Random r;
	
	Apple apple;
	ArrayList<Apple> tree;
	
	public Draw(int w, int h)
	{
		/////////Keyboard Control for Basket PT 1////////////////
		//addKeyListener(new DirectionListener());
		icon = new ImageIcon("src/apple.png");
		basket = new ImageIcon("src/basket.jpg");
		orchard = new ImageIcon("src/orchard1.jpg");
		r = new Random();
		
		WIDTH = w;
		HEIGHT = h;
		x = r.nextInt(WIDTH-40)+40;
		y = 40;
		moveX = moveY = 2;
		bx = WIDTH/2;
		by = HEIGHT - 50;
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(new Color(40, 200, 130));
		setFocusable(true);
		
		////////Scale down images////////////
		//Put this in constructors to keep paintComponent smooth
		Image image = icon.getImage();
		Image newImage = image.getScaledInstance(IMAGE_SIZE, IMAGE_SIZE, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newImage);
		
		Image image2 = basket.getImage();
		Image newImage2 = image2.getScaledInstance(IMAGE_SIZE+10, IMAGE_SIZE+10, java.awt.Image.SCALE_SMOOTH);
		basket = new ImageIcon(newImage2);
		
		Image image3 = orchard.getImage();
		Image newImage3 = image3.getScaledInstance(WIDTH, HEIGHT, java.awt.Image.SCALE_SMOOTH);
		orchard = new ImageIcon(newImage3);
		///////////////////////////////////
		
		/////Trying the Apple Class//////////
		tree = new ArrayList<Apple>();
		tree.add(new Apple());
		
		
		
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		moveIt();
		orchard.paintIcon(this, g, 0, 0);
		
		//Adds apple from the ArrayList from the Apple Class
		tree.get(0).getIcon().paintIcon(this,g,50,50);
		
		if(end == false)
		{
			/////////Move Basket with mouse////////////////////
			Point a = MouseInfo.getPointerInfo().getLocation();
			bx = (int) a.getX()-125;
			//by = (int) a.getY();
			///////////////////////////////////////////////////
			
			icon.paintIcon(this, g, x, y);
			basket.paintIcon(this, g, bx, by);
		
			g.setColor(Color.green);
			g.setFont(new Font("Times New Roman",Font.BOLD, 32));
			g.drawString("Score: "+score, 20, 35);
			g.drawString("Lives: "+lives, 20, 70);
		}
		if(score == 10)
		{
			g.setColor(Color.green);
			g.setFont(new Font("Times New Roman", Font.BOLD, 50));
			g.drawString("YOU WIN!", 75, HEIGHT/2);
			
		}
		if(end == true && score != 10)
		{
			g.setColor(Color.green);
			g.setFont(new Font("Times New Roman", Font.BOLD, 50));
			g.drawString("GAME OVER!", 55, HEIGHT/2);
					
		}
		
		
		
	}
	
	public void addApple()
	{
		/*
		 * If score is a multiple of 5
		 * add an apple object to arraylist
		 * use a for-loop in paintcomponent to paint it according to attributes
		 */
	}
	

	
//////////////////////KEYBOARD CONTROL for Mouse PT 2//////////////////////////////
	/*
	private class DirectionListener implements KeyListener
	{

		@Override
		public void keyTyped(KeyEvent e) {}

		@Override
		public void keyPressed(KeyEvent e) 
		{
			// TODO Auto-generated method stub
			switch(e.getKeyCode())
			{
			case KeyEvent.VK_DOWN:
				System.out.println("up");
				by += 5;
				break;
			case KeyEvent.VK_UP:
				by -= 5;
				break;
			case KeyEvent.VK_RIGHT:
				bx += 5;
				break;
			case KeyEvent.VK_LEFT:
				bx -= 5;
				break;
			}
			repaint();
			
		}

		@Override
		public void keyReleased(KeyEvent e) {}
		
	}
	*/
	
	public void moveIt()
	{
		if(end == false)
		{
			y+= moveY;
			//System.out.println(y);
			if(y <=0 || y >= HEIGHT - 40)
			{
				y = 1;
				x = r.nextInt(WIDTH - 40);
				lives--;
			}
			if(lives == 0 || score == 10)
			{
				end = true;
			}
			try {
				Thread.sleep(7);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//update score
			if((y + 25 >= by && y - 25 <= by)&&(x - 20 <= bx && x + 20 >= bx))
			{
				score++;
				System.out.println("Score: "+score);
				y = 1;
				x = r.nextInt(WIDTH - 40) + 40;
			}
		}
		

		repaint();
	}
	
	

}

