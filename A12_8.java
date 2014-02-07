package src;

/*
 * James Park
 * CIT 210 Section 1
 * Program 
 * Nov 8, 2012
 * 
 * Create 6 JLabels
 * In the consrtuctor
 *  Set the grid layout to be 2 rows and 3 collumns
 *  Create 6 labels with labels of black, blue, cyan, green, magenta, orange
 *  Set the opaque to true to be able to have a background
 *  Set the background color to white
 *  Set the foreground color to the color of the label name
 *  Set the line border to the color yellow with a 1 pixel thickness
 *  Set the tool tip text to the color of the label name
 *  add the six labels
 * In main()
 *  Create new object named window
 *  Set default close operation as EXIT_ON_CLOSE
 *  Set the packet title if desired
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class A12_8 extends JFrame {

  JLabel label1, label2, label3, label4, label5, label6;

  public A12_8() {
    setLayout(new GridLayout(2, 3));

    // Create Labels
    label1 = new JLabel("black");
    label2 = new JLabel("blue");
    label3 = new JLabel("cyan");
    label4 = new JLabel("green");
    label5 = new JLabel("magenta");
    label6 = new JLabel("orange");
    
    // Set Opaque to true to paint background
    label1.setOpaque(true);
    label2.setOpaque(true);
    label3.setOpaque(true);
    label4.setOpaque(true);
    label5.setOpaque(true);
    label6.setOpaque(true);

    // Set Background
    label1.setBackground(Color.white);
    label2.setBackground(Color.white);
    label3.setBackground(Color.white);
    label4.setBackground(Color.white);
    label5.setBackground(Color.white);
    label6.setBackground(Color.white);

    // Set Foreground
    label1.setForeground(Color.black);
    label2.setForeground(Color.blue);
    label3.setForeground(Color.cyan);
    label4.setForeground(Color.green);
    label5.setForeground(Color.magenta);
    label6.setForeground(Color.orange);

    // Set Line border with yellow color
    Border lineBorder = new LineBorder(Color.yellow, 1);
    label1.setBorder(lineBorder);
    label2.setBorder(lineBorder);
    label3.setBorder(lineBorder);
    label4.setBorder(lineBorder);
    label5.setBorder(lineBorder);
    label6.setBorder(lineBorder);

    // Set Font
    Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
    label1.setFont(largeFont);
    label2.setFont(largeFont);
    label3.setFont(largeFont);
    label4.setFont(largeFont);
    label5.setFont(largeFont);
    label6.setFont(largeFont);

    // Set Tool Tip
    label1.setToolTipText("black");
    label2.setToolTipText("blue");
    label3.setToolTipText("cyan");
    label4.setToolTipText("green");
    label5.setToolTipText("magenta");
    label6.setToolTipText("orange");

    // Add Labels
    add(label1);
    add(label2);
    add(label3);
    add(label4);
    add(label5);
    add(label6);
  }

  public static void main(String[] args) {
    A12_8 window = new A12_8();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    window.pack();
    window.setTitle("12.8 Program");
  }
}
