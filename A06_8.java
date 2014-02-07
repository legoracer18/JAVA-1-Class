package src;

/*
James Park
CIT 210 Section 1
Program 6.8
10/10/12

public static int average(int[] array)
public static double average(double[] array)
	//Both methods do the same thing
	Find the length of the array
	add the individual components of the array together
	divide total by the length
	return the answer of the division
Prompt user for ten numbers
call the appropriate method
display the returned value
*/

import java.util.Scanner;
public class A06_8 
{
	public static void main(String[] args) 
	{
		double[] doubleArray = new double[10];
		int[] intArray = new int[10];
		int i = 0;
		double average;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter ten numbers: ");
		while (i < 10)
		{
			doubleArray[i] = input.nextDouble();
			//intArray[i] = input.nextInt();
			i++;
		}
		average = average(doubleArray);
		System.out.println("The average number is: " + average);
		
		input.close();
	}
	
	private static int average(int[] array) {
		int total = 0;
		int length = array.length;
		int average;
		
		for(int i = 0; i < length; i++)
		{
			total += array[i];
		}
		average = total / length;
		
		return average;
	}

	private static double average(double[] array) {
		double total = 0;
		double length = array.length;
		double average;
		
		for(int i = 0; i < length; i++)
		{
			total += array[i];
		}
		average = total / length;
		
		return average;
	}
}
