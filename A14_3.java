package src;

/*
 * James Park
 * CIT 210 Section 1
 * Program 14.3
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
 *  Create an array, a boolean set to true, index number, and an output number
 *  Create a Random object to use to create a random number
 *  Loop through the length of the array setting each a value that is the random int
 *  In a do-while loop
 *    Set the index number to what the user inputs using getInput()
 *    Set the output value to the value that is in the array at the index number specified
 *    If the index number that is selected is not out of bounds reset continueOutput to false
 *    to get out of the loop
 *    If it is out of bounds, it throws an exception
 *    Catch the exception and tell the user that the selected number is out of bounds
 *  Dispay the output
 */

import java.util.*;

public class A14_3 {

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

  public static void main(String[] args) {
    //Create an array to hold the random numbers
    int[] array;
    array = new int[100];
    boolean continueOutput = true;
    int indexNum = 0;
    int output = 0;

    //Generate random numbers using one Random object over and over again
    Random randomGenerator = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = randomGenerator.nextInt(100);
    }

    do {
      try {
        // Get the index number from the user and use it to set the output from the
        // randomly generated array.  If not out of bounds, set continueOutput to false
        // to get out of the loop.
        indexNum = getInput();
        output = array[indexNum];
        continueOutput = false;
      } catch (ArrayIndexOutOfBoundsException ex) {
        // If the index number selected is out of bounds, then display the error.
        // Note, no need to clear the buffer because no input is taken here, that
        // is handled in the getInput() method.
        System.out.println("Try again. (Incorrect input: Out of Bounds)");
      }
    } while (continueOutput);
    System.out.println("The random number selected is: " + output);
  }
}
