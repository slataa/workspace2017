package jbuttonSlata;

import javax.swing.JFrame;

import gameSlata.Draw;

public class ButtonFrame 
{

	public static void main(String[] args) 
	{
		int w = 500;
		int h = 500;
		JFrame frame = new JFrame("Buttons!");
		Game draw = new Game(w, h);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(100, 50);
		frame.add(draw);
		frame.setSize(w, h);
		//frame.setResizable(false);
		//frame.pack();
		frame.setVisible(true);

	}

}
