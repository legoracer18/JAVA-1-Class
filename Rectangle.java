package src;

/*
* James Park
* CIT 210 Section 1
* Rectangle Class
* Oct 24, 2012
* 
* Set to private doubles width =1.0 , height = 1.0, area, perimeter.
* Default empty constructor, and a Constructor that will accept both width and height
* Getter and Setter for width
* Getter and Setter for height
* calcArea() will take width * height
* Getter for area will call calcArea() and return area
* calcPerimeter will take (width * 2) + (height * 2)
* Getter for perimeter will call calcPerimter() and return area
*/

public class Rectangle {
   private double width = 1.0;
   private double height = 1.0;
   private double area;
   private double perimeter;
   
   public Rectangle() {
      //Empty Constructor
   }
   
   public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
   }
   
   public double getWidth() {
      return width;
   }

   public void setWidth(double width) {
      this.width = width;
   }
   
   public double getHeight() {
      return height;
   }

   public void setHeight(double height) {
      this.height = height;
   }
   
   private void calcArea() {
      area = width * height;
   }
   
   public double getArea() {
      calcArea();
      return area;
   }
   
   private void calcPerimeter() {
      perimeter = (width * 2) + (height * 2);
   }
   
   public double getPerimeter() {
      calcPerimeter();
      return perimeter;
   }
}