package com.noSite.rain;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class DefaultGameSetup extends Canvas implements Runnable
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
	
	public DefaultGameSetup()
	{
		Dimension size = new Dimension(width*scale, height*scale);
		setPreferredSize(size);
		
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
	
	
	
	public void run() //code executes the game loop
	{
		while(running)
		{
			System.out.println("Running...");
		}
	}
	
	public static void main(String args[])
	{
		DefaultGameSetup game = new DefaultGameSetup();
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

