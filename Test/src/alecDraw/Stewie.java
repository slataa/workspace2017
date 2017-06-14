package alecDraw;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Stewie extends JPanel
{
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		//Full Head
		g.setColor(Color.BLACK);
		g.fillOval(64, 30, 410, 270);
		g.setColor(new Color(250, 215,187) );
		g.fillOval(69, 35, 400, 260);
		
		//ear(Left)
		g.setColor(Color.BLACK);
		g.fillOval(47, 135, 22, 39);
		g.setColor(new Color(250,215,187));
		g.fillOval(53, 140, 12, 30);
		g.setColor(Color.BLACK);
		
		int x[] = {57,57, 62, 61};
		int y[] = {150,152, 154, 157};
		g.fillPolygon(x, y, 4);
		
		//ear(right)
		g.setColor(Color.BLACK);
		g.fillOval(460,156 ,30 ,40 );
		g.setColor(new Color(250,215,187));
		g.fillOval(463,160 ,25 ,33 );
		g.setColor(Color.BLACK);
		
		//Right eye
		g.setColor(Color.BLACK);
		g.fillOval(308, 117, 94, 99);
		g.setColor(Color.WHITE);
		g.fillOval(310, 118, 90, 90);
		g.setColor(Color.BLACK);
		g.fillOval(326,140, 17, 18);
		g.setColor(Color.BLACK);
		
		int x1[] = {319, 321, 389, 392};
		int y1[] = {134,131, 131, 136};
		g.fillPolygon(x1, y1, 4);
		
		g.setColor(new Color(250,215,187));
		int x2[] = {328,329,331, 333,335,337,339,341,344,347,351,354,358,362,366,369,372,375,378,380,383,384,381,378,375,372,369,331};
		int y2[] = {131,120, 119,118,117,116,115,114,113,113,113,113,113,117,121,121,123,125,127,128,129,130,136,135,134,132,133,131};
		g.fillPolygon(x2, y2, 28);
		
		//Left Eye
		g.setColor(Color.BLACK);
		g.fillOval(115, 107, 84, 85);
		g.setColor(Color.WHITE);
		g.fillOval(117, 110, 80, 80);
		g.setColor(Color.BLACK);
		g.fillOval(130, 132,19,19);
		
		g.setColor(Color.BLACK);
		int x3[] = {125,120,192,189 };
		int y3[] = {118,122,125, 122 };
		g.fillPolygon(x3, y3, 4);
		
		g.setColor(Color.BLUE);
		int x4[] = {132,135,137,140,144,146,148,149,148,150,152,153,156,158,160,162,165,168,171,173,175,178,180,186};
		int y4[] = {118,116,115,113,111,112,113,110,110,111,111,111,109,109,109,111,111,112,113,114,114,117,119,123};
		g.fillPolygon(x4, y4, 24);
		
		//Hair
		g.setColor(Color.BLACK);
		int x5[] = {467,464,460,459,454,455,459,464,467,466,468,467};
		int y5[] = {145,142,140,140,140,136,136,137,139,139,142,145};
		g.fillPolygon(x5, y5, 12);
		
		
	}
	
	
	
}


