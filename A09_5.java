package src;

/*
* James Park
* CIT 210 Section 1
* Program 9.5
* Oct 25, 2012
* 
*  public static void main(String[] args)
*     Call for a string and store it as a string
*     Make an int array by calling count(String inputString) method
*     Go through the int array and if array[i] is > 0 output that the number occurs i number of times
* public static int[] count(String inputString)
*     Set up an int array with 10 element spots
*     In a loop, go through the String char by char
*     Get the asciiVal of the char by using "(int)inputString.charAt(i)"
*     If the asciiVal is between 48(0) and 57(9) than it is a number
*        then the int array of the number will be incremented by one
*        to get the correct number incremented, take the asciiVal minus the asciiVal of 0
*     Return int array
*/

import java.util.Scanner;
public class A09_5 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String inputString = input.nextLine();
      int[] digits = count(inputString);
      for (int i = 0; i < digits.length; i++) {
         if (digits[i] > 0) {
            System.out.println("The digit " + i + " occurs " + digits[i] + " times");
         }
      }
   }
   
   public static int[] count(String s) {
      int[] digits = new int[10];
      for (int i = 0; i < s.length(); i++) {
         int asciiVal = (int)s.charAt(i);
         if (asciiVal >= 48 && asciiVal <= 57) {
            digits[(int)s.charAt(i) - (int)('0')]++;
         }
      }
      return digits;
   }
}
