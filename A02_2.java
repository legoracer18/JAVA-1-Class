package src;

/*
James Park
CIT 210 Section 1
Program 2.2
9/25/12
*/
import java.util.Scanner;
public class A02_2
{
   //Gets the necessary inputs, does calculations, then shows result.
   public static void main(String[] args)
   {
      double radius;
	  double length;
	  double area;
	  double volume;
   
      Scanner input = new Scanner(System.in);
	  //Get input
      System.out.print("Please enter the radius and length of a cylinder: ");
	  radius = input.nextDouble();
	  length = input.nextDouble();
	  //Calculations
	  area = radius * radius * Math.PI;
	  volume = area * length;
	  //Format to keep desired number of digits after decimal point
	  area = (int)(area *  10000) / 10000.0;
	  volume = (int)(volume * 10) / 10.0;
	  //Display output
	  System.out.println("The area is " + area);
	  System.out.println("The volume is: " + volume);
	  input.close();
   }
}