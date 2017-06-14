//SelectionSort.java
package VisualSort;

import javax.swing.*;
public class SelectionSort {
public static void main (String[] args) {
JFrame frame = new JFrame("Selection Sort");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(new SelectionPanel());
frame.pack();
frame.setVisible(true);
}
}