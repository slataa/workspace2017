package gameSlatawithAppleClass;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Apple extends JPanel
{	
	ImageIcon apple;
	
	public Apple()
	{
		apple = new ImageIcon("src/apple.png");
		Image image = apple.getImage();
		Image newImage = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
		apple = new ImageIcon(newImage);
	}
	
	public ImageIcon getIcon()
	{
		return apple;
	}
}
