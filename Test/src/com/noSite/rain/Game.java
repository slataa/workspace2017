package com.noSite.rain;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static int width = 300;
	public static int height = width / 16 * 9;
	public static int scale = 3;

	private Thread thread;
	private boolean running = false;
	private JFrame frame;
	
	private Screen screen;
	
	private BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);//create the image
	private int[] pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();//access the image
	//ctrl + shift + o auto imports
	
	public Game()
	{
		Dimension size = new Dimension(width*scale, height*scale);
		setPreferredSize(size);
		
		screen = new Screen(width, height);
		frame = new JFrame();
		
	}
	
	public synchronized void start() //prevents thread interference
	{
		running = true;
		thread = new Thread(this, "Display");//thread is attached to current game object
		thread.start();
	}
	
	
	
	public synchronized void stop() //stops threads and rejoins
	{
		running = false;
		
		try{
			thread.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	public void run() //code executes the game loop auto executes because of implements Runnable when thread starts
	{
		while(running)
		{
			update();//handles logic at 60 fps
			render();//displays images at unlimited fps
		}
	}
	
	
	public void update()
	{
		
		
	}
	
	public void render()
	{
		//create a buffer strategy
		BufferStrategy bs = getBufferStrategy();
		if(bs == null)
		{
			createBufferStrategy(3);//triple buffer is best
			return;
		}
		
		Graphics g = bs.getDrawGraphics(); //drawgraphics creates a link between graphics and bufferstrategy
		//graphics must be displayed here
		g.setColor(new Color(80,130,240));
		g.fillRect(0, 0, getWidth(), getHeight());
		//graphics end here
		g.dispose();//removes current buffer
		bs.show();//shows next available buffer
		
	}
	
	
	
	public static void main(String args[])
	{
		Game game = new Game();
		game.frame.setResizable(false);//stops graphical errors
		game.frame.setTitle("Rain");
		game.frame.add(game);
		game.frame.pack();
		game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.frame.setLocationRelativeTo(null); //centers window
		game.frame.setVisible(true);
		
		game.start();
		
	}
	
	
	
	
	
	
	
	
}

