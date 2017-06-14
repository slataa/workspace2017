import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import java.applet.Applet;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

//g.setColor(new Color(0, 0, 0));
//int xpoints[] = {25, 50, 75, 50, 25};
//int ypoints[] = {50, 25, 50, 75, 50};
//int npoints = 5;
//g.fillPolygon(xpoints, ypoints, npoints);


public class Squarepants extends JPanel
{
	public void paintComponent( Graphics g)
	{

		
      		Graphics2D g2d = (Graphics2D) g;

		super.paintComponent(g);

		this.setBackground(Color.WHITE);
		
		g.setColor(new Color(99, 128, 24));
		g.fillRoundRect(47, 47, 310, 380, 20, 20);

		g.setColor(new Color(255, 255, 51));
		g.fillRoundRect(50, 50, 304, 374, 20, 20);

		g.setColor(new Color(0, 0, 0));
		g.fillArc (102, 145, 215, 125, 180, 180);
		
		g.setColor(new Color(255, 255, 51));
		g.fillArc (106, 145, 208, 121, 180, 180);

		g.setColor(new Color(249, 155, 204));
		g.fillOval(170, 290, 39, 22);
		g.fillOval(190, 300, 52, 12);
		g.fillOval(210, 290, 35, 19);

		g.setColor(new Color(255, 255, 51));
		g.fillOval(170, 285, 36, 24);
		g.fillOval(190, 308, 40, 12);
		g.fillOval(211, 290, 35, 18);
		g.fillOval(197, 293, 30, 12);

		g.setColor(new Color(0, 0, 0));
		g.fillOval(110, 125, 105, 100);
	
		g.setColor(new Color(255, 255, 255));
		g.fillOval(114, 129, 97, 92);

		g.setColor(new Color(0, 0, 0));
		g.fillOval(205, 125, 105, 100);
	
		g.setColor(new Color(255, 255, 255));
		g.fillOval(209, 129, 97, 92);

		g.setColor(new Color(0, 0, 0));
		g.fillOval(230, 155, 40, 38);
	
		g.setColor(new Color(0, 160, 198));
		g.fillOval(235, 160, 30, 28);

		g.setColor(new Color(0, 0, 0));
		g.fillOval(243, 167, 13, 13);

		g.setColor(new Color(0, 0, 0));
		g.fillOval(155, 155, 40, 38);
	
		g.setColor(new Color(0, 160, 198));
		g.fillOval(160, 160, 30, 28);

		g.setColor(new Color(0, 0, 0));
		g.fillOval(169, 167, 13, 13);

		g.setColor(new Color(113, 133, 12));
		g.fillOval(196, 179, 27, 45);

		g.setColor(new Color(255, 255, 51));
		g.fillOval(199, 182, 21, 42);

		g.setColor(new Color(0, 0, 0));
		int xpoints[] = {170, 168, 199, 202, 168};
    		int ypoints[] = {264, 286, 289, 266, 264};
    		int npoints = 5;
    
   		g.fillPolygon(xpoints, ypoints, npoints);

		g.setColor(new Color(255, 255, 255));
		int apoints[] = {173, 171, 196, 199, 173};
    		int bpoints[] = {266, 283, 286, 269, 266};
    		int zpoints = 5;
    
   		g.fillPolygon(apoints, bpoints, zpoints);

		g.setColor(new Color(0, 0, 0));
		int qpoints[] = {220, 218, 249, 247, 220};
    		int wpoints[] = {266, 288, 286, 264, 266};
    		int epoints = 5;
    
   		g.fillPolygon(qpoints, wpoints, epoints);
	
		g.setColor(new Color(255, 255, 255));
		int jpoints[] = {223, 221, 246, 244, 223};
    		int kpoints[] = {269, 285, 283, 267, 269};
    		int lpoints = 5;
    
   		g.fillPolygon(jpoints, kpoints, lpoints);

		g.setColor(new Color(99, 128, 24));
		g.fillOval(62, 37, 30, 20);

		g.setColor(new Color(255, 255, 255));
		g.fillOval(62, 37, 30, 16);
		
		g.setColor(new Color(99, 128, 24));
		g.fillOval(130, 37, 45, 20);

		g.setColor(new Color(255, 255, 255));
		g.fillOval(130, 37, 45, 16);

		g.setColor(new Color(99, 128, 24));
		g.fillOval(219, 37, 45, 20);

		g.setColor(new Color(255, 255, 255));
		g.fillOval(219, 37, 45, 16);
		
		g.setColor(new Color(99, 128, 24));
		g.fillOval(292, 37, 40, 20);

		g.setColor(new Color(255, 255, 255));
		g.fillOval(292, 37, 40, 16);
		
		g.setColor(new Color(99, 128, 24));
		g.fillOval(175, 39, 44, 20);

		g.setColor(new Color(255, 255, 51));
		g.fillOval(175, 42, 44, 20);

		g.setColor(new Color(99, 128, 24));
		g.fillOval(92, 38, 40, 25);

		g.setColor(new Color(255, 255, 51));
		g.fillOval(92, 41, 40, 25);

		g.setColor(new Color(99, 128, 24));
		g.fillOval(263, 39, 30, 25);

		g.setColor(new Color(255, 255, 51));
		g.fillOval(263, 42, 30, 25);

		g.setColor(new Color(99, 128, 24));
		g.fillOval(30, 70, 30, 40);

		g.setColor(new Color(255, 255, 255));
		g.fillOval(30, 70, 26, 40);

		g.setColor(new Color(255, 255, 255));
		int wwpoints[] = {44, 44, 80};
    		int kkpoints[] = {44, 340, 340};

   		g.fillPolygon(wwpoints, kkpoints, 3);
		
		g.setColor(new Color(255, 255, 255));
		int mmpoints[] = {360, 360, 320};
    		int nnpoints[] = {44, 340, 340};

   		g.fillPolygon(mmpoints, nnpoints, 3);
		
		g.setColor(new Color(99, 128, 24));
		g.fillOval(346, 65, 25, 30);

		g.setColor(new Color(255, 255, 255));
		g.fillOval(349, 65, 25, 30);

        	g2d.translate(170, 10);
		g2d.setColor(new Color(161, 179, 13));
       	 	g2d.rotate(((Math.PI)*2)/3);
        	g2d.fillOval(80, 0, 42, 22);

		g2d.translate(60, 0);
		g2d.setColor(new Color(161, 179, 13));
        	g2d.fillOval(80, 0, 25, 12);

		g2d.translate(10, -250);
		g2d.setColor(new Color(161, 179, 13));
        	g2d.fillOval(80, 0, 42, 22);

		g2d.translate(50, -15);
		g2d.setColor(new Color(161, 179, 13));
        	g2d.fillOval(80, 0, 25, 12);

		g2d.translate(-200, 90);
		g2d.setColor(new Color(161, 179, 13));
        	g2d.fillOval(80, 0, 25, 12);

		g2d.translate(260, 60);
		g2d.setColor(new Color(161, 179, 13));
        	g2d.fillOval(80, 0, 42, 22);

		g2d.translate(-15, 35);
		g2d.setColor(new Color(161, 179, 13));
        	g2d.fillOval(80, 0, 25, 12);

		g2d.rotate(((Math.PI)*4)/3);
		g2d.translate(-157, -193);
		g.setColor(new Color(255, 255, 255));
		g.fillRect(45, 340, 315, 90);

	}
}