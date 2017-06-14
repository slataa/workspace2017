import java.awt.Color;
import javax.swing.JFrame;

public class RunDraw {

	public static void main(String args[])
	{
		JFrame frame = new JFrame("Shapes!");
		Draw draw = new Draw();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		draw.setBackground(Color.WHITE);
		frame.add(draw);
		frame.setSize(400, 210);
		frame.setVisible(true);
		
	}

}
