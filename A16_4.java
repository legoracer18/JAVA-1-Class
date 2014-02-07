package src;

/*
 * James Park
 * CIT 210 Section 1
 * Program 16.4
 * Dec 3, 2012
 * 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class A16_4 extends JFrame {
  // Create text fields for interest rate, years, loan amount, monthly payment, and total payment

  private JTextField number1 = new JTextField();
  private JTextField number2 = new JTextField();
  private JTextField result = new JTextField();
  // Create a compute payment button
  private JButton add = new JButton("Add");
  private JButton subtract = new JButton("Subtract");
  private JButton multiply = new JButton("Multiply");
  private JButton divide = new JButton("Divide");

  public A16_4() {
    // Panel p1 to hold labels and text fields
    JPanel p1 = new JPanel(new GridLayout(1, 6));
    p1.add(new JLabel("Number 1"));
    p1.add(number1);
    p1.add(new JLabel("Number 2"));
    p1.add(number2);
    p1.add(new JLabel("Result"));
    p1.add(result);

    // Panel p2 to hold the button
    JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    p2.add(add);
    p2.add(subtract);
    p2.add(multiply);
    p2.add(divide);

    // Add panels to the frame
    add(p1, BorderLayout.CENTER);
    add(p2, BorderLayout.SOUTH);

    // Register listener
    add.addActionListener(new A16_4.addListener());
    subtract.addActionListener(new A16_4.subtractListener());
    multiply.addActionListener(new A16_4.multiplyListener());
    divide.addActionListener(new A16_4.divideListener());
  }

  // Handle the Add button
  private class addListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      // Get values from text fields
      double num1 = Double.parseDouble(number1.getText());
      double num2 = Integer.parseInt(number2.getText());
      // Do the calculation
      double calculation = num1 + num2;
      // Display the sum
      result.setText(String.format("%.2f", calculation));
    }
  }

  // Handle the subtract button
  private class subtractListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      //Get values from text fields
      double num1 = Double.parseDouble(number1.getText());
      double num2 = Integer.parseInt(number2.getText());
      // Do the calculation
      double calculation = num1 - num2;
      // Display the difference
      result.setText(String.format("%.2f", calculation));
    }
  }

  // Handle the multiply button
  private class multiplyListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      // Get values from text fields
      double num1 = Double.parseDouble(number1.getText());
      double num2 = Integer.parseInt(number2.getText());
      // Do the calculation
      double calculation = num1 * num2;
      // Display the product
      result.setText(String.format("%.2f", calculation));
    }
  }

  // Handle the divide button
  private class divideListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      // Get values from text fields
      double num1 = Double.parseDouble(number1.getText());
      double num2 = Integer.parseInt(number2.getText());
      // Do the calculation
      double calculation = num1 / num2;
      // Display the qoutiant
      result.setText(String.format("%.2f", calculation));
    }
  }

  public static void main(String[] args) {
    A16_4 frame = new A16_4();
    frame.pack();
    frame.setTitle("Program 16.4");
    frame.setLocationRelativeTo(null); // center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
