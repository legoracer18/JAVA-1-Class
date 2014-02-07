package src;

/*
James Park
CIT 210 Section 1
Program 6.11
10/15/12


*/
import java.util.Scanner;
public class A06_11
{
	public static void main(String[] args)
	{
		double[] doubleArray = new double[10];
		double mean;
		double deviation;
		int i = 0;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter ten numbers: ");
		while (i < 10)
		{
			doubleArray[i] = input.nextDouble();
			i++;
		}
		mean = mean(doubleArray);
		System.out.print("The mean is ");
		System.out.printf("%2.2f\n", mean);
		deviation = deviation(doubleArray);
		System.out.print("The standard deviation is ");
		System.out.printf("%2.5f\n", deviation);
		
		input.close();
	}

	private static double deviation(double[] x)
	{
		double sum = 0;
        double average = mean(x);
        double dev;
         
        for (int i = 0; i < x.length; i++)
        { 
        sum += Math.pow((x[i] - average),2);
 
        }
 
        dev = Math.sqrt(sum / (10-1));
		return dev;
	}

	private static double mean(double[] x)
	{
		double sum = 0;
		
		for (int i = 0; i < x.length; i++)
		{
			sum += x[i];
		}
		
	    double mean = sum / x.length;
	    
	    return mean;
	}
}
