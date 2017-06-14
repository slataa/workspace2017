import java.io.File;
import java.io.FileNotFoundException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.io.*;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//This is an example of how to split a single class into two methods

public class FileScan2 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		JFrame frame = new JFrame("Reader");
		JPanel back = new JPanel();

		
		frame.setSize(new Dimension(400,400));
		back.setBackground(new Color(255,255,255));
		back.setVisible(true);
		back.setSize(new Dimension(400,400));
		frame.setVisible(true);
		
		
		// TODO Auto-generated method stub
		//Part 1

		
		//Part 2
		
		
		back.add(readIt("test.txt"));
		frame.add(back);
		frame.setLocation(400, 100);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	

	}
	
	public static JLabel readIt(String file) throws FileNotFoundException
	{
		//Part 1
		Scanner fileScan = new Scanner(new File("test.txt"));
		Scanner reScan;
		String output;
		int counter = 0;
		JLabel label = new JLabel();
		
		//Part 2
		while(fileScan.hasNext())
		{
			counter++;
			output = fileScan.next().toUpperCase();
			label.setText(label.getText() +output + " ");
			
			System.out.print(output + " ");
		}
		System.out.println("\nWord total: "+counter);
		
		return label;
		
		
	}
	

}
