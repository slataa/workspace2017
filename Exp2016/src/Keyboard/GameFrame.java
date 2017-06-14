package Keyboard;

import javax.swing.JFrame;

public class GameFrame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Keyboard is Listening");
		Keys k = new Keys();
		frame.add(k);
		frame.setSize(500, 500);
		frame.setLocation(100,300);
		//frame.pack();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);

	}

}
