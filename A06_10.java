package src;

/*
James Park
CIT 210 Section 1
Program 6.10
10/15/12

public static int indexOfSmallestElement(double[] array)
	set min value to the first value in the array
	count through the array
	if the new array value is less then min value, reset the min value
Prompt user for ten numbers
call the appropriate method
display the returned value
*/
import java.util.Scanner;
public class A06_10 
{
	public static void main(String[] args) 
	{
		double[] doubleArray = new double[10];
		double min;
		int i = 0;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter ten numbers: ");
		while (i < 10)
		{
			doubleArray[i] = input.nextDouble();
			i++;
		}
		min = indexOfSmallestElement(doubleArray);
		System.out.println("The minimum number index is: " + min);
		
		input.close();
	}

	private static double indexOfSmallestElement(double[] array) 
	{
		double minValue = array[0];
		double minIndex = 0;
		  for (int i = 1; i < array.length; i++)
		  {
		    if (array[i] < minValue)
		    {
		      minValue = array[i];
		      minIndex = i;
		    }
		  }
		  return minIndex;
	}
}
