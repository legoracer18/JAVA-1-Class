package src;

/*
James Park
CIT 210 Section 1
Program 6.9
10/10/12

public static double min(double[] array)
	find the minimum by counting through the array with i
	j = i + 1
	if array[i] > array[j] set counter to j
	if the counter is j after comparison, swap array[i] with array[j]
	return the lowest number by returning array[0]
Prompt user for ten numbers
call the appropriate method
display the returned value
*/

import java.util.Scanner;
public class A06_9 
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
		min = min(doubleArray);
		System.out.println("The minimum number is: " + min);
		
		input.close();
	}

	private static double min(double[] array) 
	{
		double minValue = array[0];
		
		  for (int i = 1; i < array.length; i++)
		  {
		    if (array[i] < minValue)
		    {
		      minValue = array[i];
		    }
		  }
		  return minValue;
	}
}
