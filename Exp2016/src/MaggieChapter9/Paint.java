package MaggieChapter9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Paint extends JPanel
{
	ImageIcon apple, basket, rotten, golden, background;
	Random gen = new Random();
	int x = gen.nextInt(950), Rx = gen.nextInt(950), Gx = gen.nextInt(950);
	private int y = 5, score = 0, basketX = 500, Ry = 5, lives = 9, Gy = 5, direction = 0;
	private boolean endGame = false;
	private double speed = 3;

	public Paint()
	{
		addKeyListener(new TypeListener());
		setFocusable(true);
		setPreferredSize(new Dimension(1000, 600));
		
		
		apple();
		Image i = apple.getImage();
		Image scaleA = i.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
		apple = new ImageIcon(scaleA);
		
		basket();
		Image j = basket.getImage();
		Image scaleB = j.getScaledInstance(80, 60, java.awt.Image.SCALE_SMOOTH);
		basket = new ImageIcon(scaleB);
		
		rotten();
		Image k = rotten.getImage();
		Image scaleR = k.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
		rotten = new ImageIcon(scaleR);
		
		golden();
		Image g = golden.getImage();
		Image scaleG = g.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
		golden = new ImageIcon(scaleG);
		
		background();
		Image h = background.getImage();
		Image scaleBG = h.getScaledInstance(1050, 650, java.awt.Image.SCALE_SMOOTH);
		background = new ImageIcon(scaleBG);
	}
	
	public void paintComponent(Graphics page)
	{
		if(endGame == false)
		{
			super.paintComponent(page);
			background.paintIcon(this, page, 0, 0);
			apple.paintIcon(this, page, x, y);
			if(score >= 15)
			{
				rotten.paintIcon(this, page, Rx, Ry);
				fallRotten();
			}
			basket.paintIcon(this, page, basketX, 550);
			setBackground(Color.green);
			fallApple();
			dragBasket();
			scoring();
			ending(page);
			if(lives <= 4)
			{
				golden.paintIcon(this, page, Gx, Gy);
				fallGolden();
			}
			page.setColor(Color.white);
			Font scores = new Font("Arial", Font.BOLD, 24);
			page.setFont(scores);
			page.drawString("Score: "+ score, 10, 20);
			page.drawString("Lives: "+ lives, 10, 40);
		}
	}
	public void background()
	{
		background = new ImageIcon("src/background.jpg");
	}
	
	//basket methods
	public void basket()
	{
		basket = new ImageIcon("src/basket.png");
	}
	public void dragBasket()
	{
		Point b = MouseInfo.getPointerInfo().getLocation();
		basketX = (int) b.getX() - 46;
		repaint();
	}
	
	//apple methods
	public void apple()
	{
		apple = new ImageIcon("src/apple (1).png");
		
	}
	public void fallApple()
	{
		y += speed;
		try
		{
			Thread.sleep(5);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		if(y >= 600)
		{
			y = 5;
			x = gen.nextInt(950);
		}
		repaint();
	}
	
	//rotten apple methods
	public void rotten()
	{
		rotten = new ImageIcon("src/rotten.png");
	}
	public void fallRotten()
	{
		Ry += speed;
	
		if(Ry >= 600)
		{
			Ry = 5;
			Rx = gen.nextInt(950);
		}
		repaint();
	}
	
	//golden apple method
	public void golden()
	{
		golden = new ImageIcon("src/golden.png");
	}
	public void fallGolden()
	{
		if(lives > 4)
		{
			Gy = 5;
			Gx = gen.nextInt(950);
		}
		if(Gx >= 1000)
			direction = 1;
		if(Gx <= 0)
			direction = 0;
		if(direction == 0)
			Gx += (speed + 1);
		if(direction == 1)
			Gx -= (speed + 1);
		Gy += (speed + 1);
		if(Gy >= 600)
		{
			Gy = 5;
			Gx = gen.nextInt(950);
		}
		repaint();
	}
	
	//general methods
	public void ending(Graphics page)
	{
		if(lives == 0)
		{
			endGame = true;
			Font gameOver = new Font("Arial", Font.BOLD, 100);
			page.setFont(gameOver);
			page.drawString("GAME OVER", 200, 300);
		}
	}
	public void speedUp()
	{
		if(score %10 == 0 && score != 0)
		{
			speed += .5;
		}
		repaint();
	}
	public void scoring()
	{
		//catch normal apple
		if((y > 550 && y < 600) 
				&& (x > basketX - 40 && x < basketX + 40) )
		{
			score++;
			y = 5;
			x = gen.nextInt(950);
			Gy = 5;
			Gx = gen.nextInt(950);

			speedUp();
		}
		//drop normal apple
		else if((y > 590)
				&&(x < basketX - 40 || x > basketX + 40))
		{
			lives--;
			y = 5;
			x = gen.nextInt(950);
		}
		//catch rotten apple
		if((Ry > 550 && Ry < 600)
				&& (Rx > basketX - 40 && Rx < basketX + 40))
		{
			lives--;
			Ry = 5;
			Rx = gen.nextInt(950);
		}
		//catch golden apple
		if((Gy > 550 && Gy < 600)
				&& (Gx > basketX - 40 && Gx < basketX + 40))
		{
			lives = 9;
			//score++;
			Gy = 5;
			Gx = gen.nextInt(950);
			//x = gen.nextInt(950);
			//y = 5;
		}
		repaint();
	}

	private class TypeListener implements KeyListener
	{
		public void keyPressed(KeyEvent e)
		{
			
			switch(e.getKeyCode())
			{
				case KeyEvent.VK_Z: 
				System.out.println("Switched!");
				break;
			}
			repaint();
		}
		public void keyReleased(KeyEvent args)
		{
			
		}
		public void keyTyped(KeyEvent args)
		{
			
		}	
		
	}
}


