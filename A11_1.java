package src;

/*
* James Park
* CIT 210 Section 1
* Program 11.1
* Nov 8, 2012
* 
* Get the input for color, side1, side2, side3, and filled
* Create new triangle object with side1, side2, and side3
* set the color and filled
* Output area, perimeter, color, and filled
*/

import java.util.Scanner;
public class A11_1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a color: ");
      String color = input.nextLine();
      System.out.print("Enter side1: ");
      double side1 = input.nextDouble();
      System.out.print("Enter side2: ");
      double side2 = input.nextDouble();
      System.out.print("Enter side3: ");
      double side3 = input.nextDouble();
      System.out.print("Is the triangle filled(TRUE or FALSE): ");
      boolean filled = input.nextBoolean();
      
      Triangle triangle = new Triangle(side1, side2, side3);
      triangle.setColor(color);
      triangle.setFilled(filled);
      
      System.out.println("The area is:\t\t" + triangle.getArea());
      System.out.println("The perimeter is:\t" + triangle.getPerimeter());
      System.out.println("The color is:\t\t" + triangle.getColor());
      System.out.println("Is it filled?\t\t" + triangle.isFilled());
   }
}
