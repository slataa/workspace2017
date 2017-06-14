package Keys;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener{
	char c;

    public void keyTyped(KeyEvent e) {
        System.out.println("Key typed: " + e.getKeyChar());
        c = e.getKeyChar();
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed: " + e.getKeyChar());
        c = e.getKeyChar();
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("Key released: " + e.getKeyChar());
        c = e.getKeyChar();
    }
    
    public char getKey()
    {
    	return c;
    }
}