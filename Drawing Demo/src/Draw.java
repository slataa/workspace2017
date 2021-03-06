import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Draw extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.RED);
		g.drawLine(5, 30, 380, 30);
	
		g.setColor(Color.BLUE);
		g.drawRect(5, 40, 90, 55);
		g.fillRect(100, 40, 90, 55);
		
		g.setColor(new Color(10,40,200));
		g.fillRoundRect(195, 40, 90, 55, 50, 50);
		g.drawRoundRect(290, 40, 90, 55, 20, 20);
		
		g.setColor(Color.MAGENTA);
		g.drawOval(195, 100, 90, 55);
		g.fillOval(290, 100, 90, 55);
		
		g.setColor(Color.ORANGE);
		int x[] = {20,40,50,30,20,15};
		int y[] = {50,50,60,80,80,60};
		g.drawPolygon(x,y,6);
	}
	

}
