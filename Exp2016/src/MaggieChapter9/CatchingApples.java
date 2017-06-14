package MaggieChapter9;


import java.awt.Color;
import javax.swing.*;

public class CatchingApples
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Catch the Apples!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.green);
		frame.setSize(1000, 600);
		frame.setVisible(true);
		
		Paint paint = new Paint();
		frame.add(paint);
		frame.setResizable(false);
		frame.pack();
	}
}
