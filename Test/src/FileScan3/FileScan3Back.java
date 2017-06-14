package FileScan3;
//This is program 2 of 2
//This shows the secondary class for looping through a file and adding to a label

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JLabel;

public class FileScan3Back 
{
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
			label.setText(label.getText() + output + " ");
			
			System.out.print(output + " ");
		}
		System.out.println("\nWord total: "+counter);
		
		return label;
		
		
	}

}
