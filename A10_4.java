package src;

/*
* James Park
* CIT 210 Section 1
* Program 
* Nov 1, 2012
* 
* public static void main(String[] args)
*    Create two MyPoint variables
*    Output what the two points are
*    Output the distance between the two points
*/

public class A10_4 {
   public static void main(String[] args) {
      MyPoint point1 = new MyPoint(0, 0);
      MyPoint point2 = new MyPoint(10, 30.5);
      
      System.out.println("Point one is: " + point1.output());
      System.out.println("Point two is: " + point2.output());
      System.out.print("The distance between them is: ");
      System.out.printf("%3.2f\n", point1.distance(point2));
   }
}
