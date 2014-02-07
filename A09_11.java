package src;

/*
* James Park
* CIT 210 Section 1
* Program 9.11
* Oct 25, 2012
* 
*  public static void main(String[] args)
*     Call for a string input
*     Create a sorted string by calling the sort(String s) method
*  public static String sort(String s)
*     convert String s to a char[]
*     use java.util.Arrays.sort(content) to automatically sort it
*     store the char[] into a new String
*     return the sorted String
*/

import java.util.Scanner;
public class A09_11 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String inputString = input.nextLine();
      String sorted = sort(inputString);
      System.out.println("The sorted string with no spaces is: " + sorted);
   }
   
   public static String sort(String s) {
      char[] content = s.toCharArray();
      java.util.Arrays.sort(content);
      String sorted = new String(content);
      return sorted;
   }
}
