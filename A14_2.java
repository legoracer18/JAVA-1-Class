package src;

/*
 * James Park
 * CIT 210 Section 1
 * Program 14.2
 * Nov 28, 2012
 * 
 * In getInput()
 *  In a do-while loop
 *    Prompt the user for an integer
 *    If the entered value is an integer reset continueInput to false to get out of loop
 *    If the entered value is not an integer, it throws an exception
 *    Catch the exception and tell the user an invalid value was entered
 *    Clear the buffer
 *  Return the input integer
 * In main()
 *  Set two numbers by the return value of the getInput() method
 *  Set sum to the sum of the two numbers
 *  Display the equation and sum of the two numbers entered
 */

import java.util.*;

public class A14_2 {

  public static int getInput() {
    Scanner input = new Scanner(System.in);
    boolean continueInput = true;
    int number = 0;

    do {
      try {
        //get the input and if valid set continueInput to false to get out of the loop
        System.out.print("Enter an integer: ");
        number = input.nextInt();
        continueInput = false;
      } catch (InputMismatchException ex) {
        //If an invalid input the exception is caught here
        System.out.println("Try again. (Incorrect input: an integer is required)");
        input.nextLine(); //Discard the buffer
      }
    } while (continueInput);
    return number;
  }

  public static void main(String[] argv) {
    int number1 = getInput();
    int number2 = getInput();
    int sum = number1 + number2;

    System.out.println(number1 + " + " + number2 + " = " + sum);
  }
}
