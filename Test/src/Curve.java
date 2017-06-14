import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;
//from ww  w.  jav a  2  s  . com
public class Curve extends Frame {
  public static void main(String[] args) {
    (new Curve()).setVisible(true);
  }

  public Curve() {
    super("Shape Sampler");
    setSize(400, 550);
  }

  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;

    QuadCurve2D quadcurve = new QuadCurve2D.Double(50, 300, 320, 300, 350, 400);
    g2d.draw(quadcurve);

  }
}