package src;

/*
James Park
CIT 210 Section 1
Program 2.1
9/25/12
*/
import java.util.Scanner;
public class A02_1
{
   /*This method gets the input from the user, then does the calculation
     that is needed, and then it shows the result in desired format.*/
   public static void main(String[] args)
   {
      double celsius;
	  double fahrenheit;
	  
      Scanner input = new Scanner(System.in);
	  
      System.out.print("Enter a Celsius degree: ");
	  celsius = input.nextDouble();
	  fahrenheit = (9.0 / 5) * celsius + 32;
	  System.out.println((int)(celsius) + " Celsius = " + fahrenheit + " Fahrenheit");
	  input.close();
   }
}