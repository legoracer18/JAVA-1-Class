package src;

/*
* James Park
* CIT 210 Section 1
* MyPoint Object
* Nov 1, 2012
* 
* Default constructor sets the x and y points to 0
* Constructor that will take in the x and y points
* Setters and Getters for the x and y variables
* distance method that calculates and returns the distance
*    calculate using Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y)) formula
* one distance method will use x and y values that are passed to it
* one distance method will use getters to get the x and y from the MyPoint variable that is passed to it
* setter to set the output string so that it will be (x, y) format
* output method will use the setter for output and return the output string
*/

public class MyPoint {
   private double x;
   private double y;
   private double distance;
   private String output;
   
   public MyPoint() {
      x = 0;
      y = 0;
   }
   
   public MyPoint(double x, double y) {
      this.x = x;
      this.y = y;
   }
   
   public void setX(double x) {
      this.x = x;
   }
   
   public void setY(double y) {
      this.y = y;
   }
   
   public double getX() {
      return x;
   }
   
   public double getY() {
      return y;
   }
   
   public double distance(double x1, double y1) {
      distance = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
      return distance;
   }
   
   public double distance(MyPoint point) {
      double x1 = point.getX();
      double y1 = point.getY();
      distance = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
      return distance;
   }
   
   private void setOutput() {
      output = "(" + x + ", " + y + ")";
   }
   
   public String output() {
      setOutput();
      return output;
   }
}
