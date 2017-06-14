package Game1;

import javax.swing.JFrame;

public class MainGame1 {

	public static void main(String[] args) 
	{
		final int WIDTH, HEIGHT;
		WIDTH = 500;
		HEIGHT = 500;
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Game1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH,HEIGHT);
		frame.getContentPane().add(new Game1Back());
		frame.pack();
		frame.setVisible(true);
		

	}

}
