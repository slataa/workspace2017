import javax.swing.JFrame;

public class Spongebob
{
	public static void main(String args[])
	{
	
		JFrame picture = new JFrame("Frist Drawing");

		picture.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Squarepants mine = new Squarepants();

		picture.add(mine);

		picture.setSize(418, 507);

		picture.setVisible(true);

	}
}