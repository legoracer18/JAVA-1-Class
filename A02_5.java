package src;

/*
James Park
CIT 210 Section 1
Program 2.5
9/25/12
*/
import java.util.Scanner;
public class A02_5
{
   //Gets the necessary inputs, does calculations, then shows result.
   public static void main(String[] args)
   {
      double subtotal;
	  double gratuityRate;
	  double gratuity;
	  double total;
   
      Scanner input = new Scanner(System.in);
	  //Get input
      System.out.print("Please enter subtotal and a gratuity rate: ");
	  subtotal = input.nextDouble();
	  gratuityRate = input.nextDouble();
	  //Calculations
	  gratuity = subtotal * (gratuityRate / 100.0);
	  total = subtotal + gratuity;
	  //Display Output
	  System.out.println("The gratuity is $" + gratuity + 
			  " and total is $" + total);
	  input.close();
   }
}