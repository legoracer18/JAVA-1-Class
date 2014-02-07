package src;

/*
James Park
CIT 210 Section 1
Program 5.7
10/3/12

Get investment amount and interest rate from user
Use the following equation to find out future value:
	futureInvestmentValue = 
				investmentAmount x (1 + monthlyInterstRate)^(numberOfYears * 12)
				(^ means raised to the power of)
Print out the year and the value at that year

use the following header for the method that does the calculation:
public static double futureInvestmentValue(double investmentAmount,
		double monthlyInterestRate, int years)
*/
import java.util.Scanner;
public class A05_7 
{
	public static void main(String[] args) 
	{
		double investmentAmount;
		double monthlyInterestRate;
		double annualInterestRate;
		double futureValue;
		int totalYears = 30;
		int i = 1;
		
		//Get input
		Scanner input = new Scanner (System.in);
		System.out.print("The amount invested: ");
		investmentAmount = input.nextDouble();
		System.out.print("Annual interest rate: ");
		annualInterestRate = input.nextDouble();
		//Calculations
		annualInterestRate = annualInterestRate / 100;
		monthlyInterestRate = annualInterestRate / 12;
		System.out.println("Years \t\tFutureValue");
		while (i <= totalYears)
		{
			futureValue = futureInvestmentValue(investmentAmount, 
					monthlyInterestRate, i);
			futureValue = (int)(futureValue *  100) / 100.0;
			System.out.print(i + "\t\t");
			System.out.printf("%10.2f\n", futureValue);
			i++;
		}
		input.close();
	}

	private static double futureInvestmentValue(double investmentAmount,
			double monthlyInterestRate, int year) 
	{
		double total;
		
		total = investmentAmount * (java.lang.Math.pow((1 + monthlyInterestRate), (year * 12)));
		
		return total;
	}
}
