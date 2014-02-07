package src;

/*
 * James Park
 * CIT 210 Section 1
 * Program 12.3
 * Nov 8, 2012
 * 
 * Create 6 JButtons
 * In the constructor
 *  Set the grid layout for 2 rows and 3 collumns
 *  Create 6 buttons that have a corresponding label
 *  Add the 6 buttons to the frame
 * In main()
 *  Create new object named window
 *  Set default close operation as EXIT_ON_CLOSE
 *  Set the packet title if desired
 */

import java.awt.*;
import javax.swing.*;

public class A12_3 extends JFrame {

  JButton button1, button2, button3, button4, button5, button6;

  public A12_3() {
    setLayout(new GridLayout(2, 3));

    // Create Buttons
    button1 = new JButton("Button 1");
    button2 = new JButton("Button 2");
    button3 = new JButton("Button 3");
    button4 = new JButton("Button 4");
    button5 = new JButton("Button 5");
    button6 = new JButton("Button 6");

    // Add Buttons
    add(button1);
    add(button2);
    add(button3);
    add(button4);
    add(button5);
    add(button6);
  }

  public static void main(String args[]) {
    A12_3 window = new A12_3();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    window.pack();
    window.setTitle("12.3 Program");
  }
}
