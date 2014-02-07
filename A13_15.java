package src;

/*
 * James Park
 * CIT 210 Section 1
 * Program 13.15
 * Nov 14, 2012
 * 
 * Create a frame
 *  Set Title of the frame
 * In main()
 *  Create new object named window
 *  define the size
 *  Set default close operation as EXIT_ON_CLOSE
 * In ArcsPanel class
 *  figure out the center for the pie chart by getting
 *    the x and y centers by getting width/height divided in half
 *    get the radius
 *    the x and y values are the x and y centers subtracted by the radius
 *  Add the arcs with the right color and sizes
 *  Add the text labels for the sections of the pie chart
 */

import javax.swing.*;
import java.awt.*;

public class A13_15 extends JFrame {

  public A13_15() {
    setTitle("Assignment 13.15");
    add(new ArcsPanel());
  }

  public static void main(String[] args) {
    A13_15 frame = new A13_15();
    frame.setSize(400, 400);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  class ArcsPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      //Figure out center for the pie chart
      int xCenter = getWidth() / 2;
      int yCenter = getHeight() / 2;
      int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);
      int x = xCenter - radius;
      int y = yCenter - radius;

      // Project 20% Red
      g.setColor(Color.red);
      g.fillArc(x, y, 300, 300, 0, 72);

      //Quizzes 10% Blue
      g.setColor(Color.blue);
      g.fillArc(x, y, 300, 300, 72, 36);

      //Midterms 30% Green
      g.setColor(Color.green);
      g.fillArc(x, y, 300, 300, 108, 108);

      //Final 40% Orange
      g.setColor(Color.orange);
      g.fillArc(x, y, 300, 300, 216, 144);

      //Add Text to label the chart
      g.setColor(Color.black);
      g.drawString("Projects -- 20%", 260, 160);
      g.drawString("Quizzes -- 10%", 170, 80);
      g.drawString("Midterms -- 30%", 80, 200);
      g.drawString("Final -- 40%", 240, 300);
    }
  }
}
