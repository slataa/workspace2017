//********************************************************************
//  StyleOptionsPanel2.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.16
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel2 extends JPanel
{
   private int DEFAULT_FONT_SIZE = 36;
   private JLabel saying;
   private JCheckBox bold, italic;
   private JTextField fontSizeField;

   //-----------------------------------------------------------------
   //  Sets up a panel with a label and some check boxes that
   //  control the style of the label's font.
   //-----------------------------------------------------------------
   public StyleOptionsPanel2()
   {
      saying = new JLabel("Say it with style!");
      saying.setFont (new Font("Helvetica", Font.PLAIN, DEFAULT_FONT_SIZE));

      bold = new JCheckBox("Bold");
      bold.setBackground(Color.cyan);
      italic = new JCheckBox("Italic");
      italic.setBackground(Color.cyan);

      JLabel fontSizeLabel = new JLabel("Font Size");
      fontSizeField = new JTextField(5);
      fontSizeField.setText(String.valueOf(DEFAULT_FONT_SIZE));

      StyleListener listener = new StyleListener();
      bold.addItemListener(listener);
      italic.addItemListener(listener);

      fontSizeField.addActionListener(new FieldListener());

      add(saying);
      add(bold);
      add(italic);
      add(fontSizeLabel);
      add(fontSizeField);

      setBackground(Color.cyan);
      setPreferredSize(new Dimension(300, 100));
   }

   //--------------------------------------------------------------
   //  Updates the style and font size of the label font style.
   //--------------------------------------------------------------
   private void updateLabel()
   {
      int style = Font.PLAIN;

      if (bold.isSelected())
         style = Font.BOLD;

      if (italic.isSelected())
         style += Font.ITALIC;

      int fontSize = Integer.parseInt(fontSizeField.getText());

      saying.setFont(new Font("Helvetica", style, fontSize));
   }

   //*****************************************************************
   //  Represents the listener for both check boxes.
   //*****************************************************************
   private class StyleListener implements ItemListener
   {
      //--------------------------------------------------------------
      //  Updates the style of the label font style.
      //--------------------------------------------------------------
      public void itemStateChanged(ItemEvent event)
      {
         updateLabel();
      }
   }

   //*****************************************************************
   //  Represents the listener for the font size field.
   //*****************************************************************
   private class FieldListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         updateLabel();
      }
   }
}
