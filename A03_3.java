package src;

/*
James Park
CIT 210 Section 1
Program 3.3
9/28/12

GET 'a, b, c, d, e, and f'
IF ad-bc == 0 "The equation has no solution."
ELSE x = (ed-bf)/(ad-bc)
     y = (af-ec)/(ad-bc)
OUTPUT x and y result.
*/
import java.util.Scanner;
public class A03_3
{
	public static void main(String[] args)
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a, b, c, d, e, f: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		double temp = (a * d) - (b * c);
		if (temp == 0)
		{
			System.out.println("The equation has no solution");
		}
		else
		{
			double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
			double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
			System.out.println("x is " + x + " and y is " + y);
		}
		input.close();
	}
}