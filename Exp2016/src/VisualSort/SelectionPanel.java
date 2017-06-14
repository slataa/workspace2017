package VisualSort;

//SelectionPanel.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class SelectionPanel extends JPanel {
private final int WIDTH = 5, DELAY = 80;
private Timer timer;
private Random rand;
private int x=0, min, i = 0, temp;
private int[] list;
public SelectionPanel() {
timer = new Timer(DELAY, new SelectionListener());
list = new int[100];
rand = new Random();
for (int i = 0; i < list.length; i++) {
list[i] = rand.nextInt(100)+1;
}
setPreferredSize(new Dimension(500, 250));
setBackground(Color.black);
timer.start();
}
public void paintComponent(Graphics page) {
super.paintComponent(page);
page.setColor(Color.white);
for (int j = 0; j < list.length; j++) {
if (j != 0) {
if (j == min) page.setColor(Color.cyan);
if (j == i-1) page.setColor(Color.red);
}
page.fillRect(x, 250-list[j]*2, 5, 250);
x+=5;
page.setColor(Color.white);
}
x=0;
}
private class SelectionListener implements ActionListener {
public void actionPerformed(ActionEvent event) {
min = i;
for (int j = i+1; j < list.length; j++) {
if (list[j]<list[min]) min = j;
}
temp = list[min];
list[min] = list[i];
list[i] = temp;
i++;
repaint();
}
}
}
