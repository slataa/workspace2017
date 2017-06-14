import javax.swing.JFrame;

public class KeysMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Direction");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(frame, new DirectionalPanel());
		frame.pack();
		frame.setVisible(true);

	}

}
