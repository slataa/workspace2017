package FileScan3;
//This program is 1 of 2 
//This further shows how to split up a single class into two separate classes

import java.awt.Color;
import java.awt.*;
import java.io.FileNotFoundException;

import javax.swing.*;
import javax.swing.JPanel;

public class FileScan3Main 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		JFrame frame = new JFrame("Reader");
		JPanel back = new JPanel();
		FileScan3Back pane = new FileScan3Back();

		frame.setSize(new Dimension(400,400));
		back.setBackground(new Color(255,255,255));
		back.setVisible(true);
		back.setSize(new Dimension(400,400));
		frame.setVisible(true);
		
		// TODO Auto-generated method stub
		//Part 1
		//Part 2
		
		
		back.add(pane.readIt("test.txt"));
		frame.add(back);
		frame.setLocation(400, 100);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	

	}
}