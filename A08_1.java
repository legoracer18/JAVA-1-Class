package src;

/*
* James Park
* CIT 210 Section 1
* Program 8.1
* Oct 21, 2012
* 
* Make two Rectangles using personally created class Rectangle
* Rectangle1 with width = 4 and height = 40
* Rectangle2 with width = 3.5 and height = 35.9
* Using Getters, output the width, height, area, and perimeter of each rectangle
*/

public class A08_1 {
   public static void main(String[] args) {
      Rectangle rec1 = new Rectangle(4, 40);
      Rectangle rec2 = new Rectangle(3.5, 35.9);
      //Rectangle 1 Info
      System.out.println("For Rectangle1:");
      System.out.print("Width:\t      ");
      System.out.printf("%3.1f\n", rec1.getWidth());
      System.out.print("Height:\t     ");
      System.out.printf("%3.1f\n", rec1.getHeight());
      System.out.print("Area:\t    ");
      System.out.printf("%3.1f\n", rec1.getArea());
      System.out.print("Perimeter:   ");
      System.out.printf("%3.1f\n", rec1.getPerimeter());
      //Rectangle 2 Info
      System.out.println("\nFor Rectangle2:");
      System.out.print("Width:\t      ");
      System.out.printf("%3.1f\n", rec2.getWidth());
      System.out.print("Height:\t     ");
      System.out.printf("%3.1f\n", rec2.getHeight());
      System.out.print("Area:\t    ");
      System.out.printf("%3.1f\n", rec2.getArea());
      System.out.print("Perimeter:   ");
      System.out.printf("%3.1f\n", rec2.getPerimeter());
   }
}
