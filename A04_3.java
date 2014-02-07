package src;

/*
James Park
CIT 210 Section 1
Program 4.3
10/3/12

Start Kilograms at 1 and increase by 2
Each value of kg gets converted to pounds
	(1kg == 2.2 pounds)
Round of pounds value to make sure it only has one decimal
Output the values in correct format.
*/
public class A04_3
{
	public static void main(String[] args)
	{
		System.out.println("Kilograms\tPounds");
		double kilogram = 1;
		double pound;
		
		while (kilogram <= 199)
		{
			pound = kilogram * 2.2;
			pound = (int)(pound *  10) / 10.0;
			System.out.print((int)kilogram + "\t\t");
			System.out.printf("%5.1f\n", pound);
			kilogram++;
		}
	}
}
