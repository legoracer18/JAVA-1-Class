package src;

/*
James Park
CIT 210 Section 1
Program 3.3
9/28/12

GET month and year
IF month is 2, Determine if year is a leap year
Assign proper days of the month determined by month.
DISPLAY number of days in month for the year
*/

import java.util.Scanner;
public class A03_11 
{
	public static void main(String[] args) 
	{
		int month;
		int year;
		int leapYear = 0;
		String[] monthName = {" ", "January", "March", "April", "May",
				"June", "July", "August", "September", "October", 
				"November", "December"};
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter in month and year: ");
		month = input.nextInt();
		year = input.nextInt();
		
		if (month == 2)
		{
			if (year % 400 == 0)
				leapYear = 1;
			else if (year % 100 == 0)
				leapYear = 0;
			else if (year % 4 == 0)
				leapYear = 1;
			else
				leapYear = 0;
			int days = 28 + leapYear;
			System.out.println("February " + year + " had " + days + ".");
		}
		else
		{
			switch (month)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: System.out.println(monthName[(month - 1)] + " " + year + " had 31 days.");
						break;
				default: System.out.println(monthName[(month - 1)] + " " + year + " had 30 days.");
			}
		}
		input.close();
	}

}
