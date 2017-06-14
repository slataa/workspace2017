package Drawing2017;

import java.awt.Color;
import javax.swing.JFrame;

public class RunDraw 
{

	public static void main(String args[])
	{
		JFrame frame = new JFrame("Shapes!");
		//change the line below
		Draw draw = new Draw();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//change the line below
		draw.setBackground(Color.WHITE);
		frame.add(draw);
		//change the size to match your picture
		frame.setSize(322, 320);
		frame.setVisible(true);
		
	}

}
