import java.awt.Color;
import javax.swing.JFrame;

public class RunWilt 
{

	public static void main(String args[])
	{
		JFrame frame = new JFrame("Wilt");
        //change the line below
		Wilt draw = new Wilt();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //change the line below
		draw.setBackground(Color.WHITE);
		frame.add(draw);
		frame.setSize(208, 283);
		frame.setVisible(true);
		
	}

}
