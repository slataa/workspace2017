package jbuttonSlata;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Game extends JPanel
{
	int w;
	int h;
	JButton button1 = new JButton("Button 1");
	boolean tf;
	
	public Game(int w, int h)
	{
		this.w = w;
		this.h = h;
		//button1.setText("Button 1!");
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.add(button1);
	}
	
	public boolean pressed()
	{
		
		return tf;
	}

}
