package gameSlata;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class RunGame {

	public static void main(String args[])
	{
		int w = 500;
		int h = 500;
		JFrame frame = new JFrame("Get the Apple!");
		Draw draw = new Draw(w, h);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(100, 50);
		frame.add(draw);
		frame.setSize(w, h);
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
		
	}

}
