package Game1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Game1Back extends JPanel
{
	private final int WIDTH = 320, HEIGHT = 700;
	private final int r = 100, g = 100, b = 100;
	private int x = 0, x2 = 0;
	private int y = 85, y2 = 85;
	private ImageIcon img1, img2, img3, img4;
	private Random rand;
	
	public Game1Back()
	{
		img1 = new ImageIcon("src/RainBrandt.gif");
		img2 = new ImageIcon("src/dollar.gif");
		img3 = new ImageIcon("src/dollar.gif");
		img4 = new ImageIcon("src/piggy.jpg");
		rand = new Random();
		setBackground(new Color(r,g,b));
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setVisible(true);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		moveDollars();
		x = rando();
		x2 = rando();
		img1.paintIcon(this, g, 0, 0);
		img2.paintIcon(this, g, x, y - 100);
		img3.paintIcon(this, g, x2, y2);
		img4.paintIcon(this, g, 0, HEIGHT - img4.getIconHeight());
		System.out.println(img2.getIconHeight());
	}
	
	public void moveDollars()
	{
	
		
		if(y <= HEIGHT)
		{
			y += 1;
			y2 += 2;
		}
		else
		{
			y = img1.getIconHeight();
			y2 = img1.getIconHeight();
		}
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		repaint();
	}
	
	public int rando()
	{
		x = rand.nextInt(WIDTH - img2.getIconWidth());
		return x;
	}
}
