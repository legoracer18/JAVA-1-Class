package src;

/*
 * James Park
 * CIT 210 Section 1
 * GeometricObject Object 
 * Nov 8, 2012
 * 
 * Default constructor sets dateCreated and sets color to white
 * Constructor that takes in color and filled values, also sets datecreated
 * Accessors for color, filled and dateCreated variables
 * toString output string for a default output value
 *    "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
 */

public class GeometricObject {

   private String color;
   private boolean filled;
   private java.util.Date dateCreated;

   public GeometricObject() {
      color = "white";
      dateCreated = new java.util.Date();
   }

   public GeometricObject(String color, boolean filled) {
      dateCreated = new java.util.Date();
      this.color = color;
      this.filled = filled;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public boolean isFilled() {
      return filled;
   }
   
   public void setFilled(boolean filled) {
      this.filled = filled;
   }

   public java.util.Date getDateCreated() {
      return dateCreated;
   }

   public String toString() {
      return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
   }
}
