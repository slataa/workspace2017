package alecDraw;

import java.awt.Component;

import javax.swing.JFrame;



public class RunStewie 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Peter by Mac");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		Stewie picture = new Stewie();
		
		Component Stewie = frame.add(picture);
		
		
		frame.setSize(499, 325);
		frame.setVisible(true);
		
		
		
		
	}

}
