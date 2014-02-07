package src;

/*
James Park
CIT 210 Section 1
Program 5.8
10/3/12

Display table that has Celsius to Fahrenheit on one side
	and Fahrenheit to Celsius on the other
The C to F side will count down one degree at a time from 40.0C 
	to 31.0C (9 degrees)
The F to C side will count down ten degrees at a time from 120.0F
	to 30.0F
	
Use method to convert Celsius to Fahrenheit
	F = (9.0 / 5) * C + 32
Use method to convert Fahrenheit to Celsius
	C = (5.0 / 9) * (F - 32)
*/
public class A05_8 
{
	public static void main(String[] args) 
	{
		double celsius = 41.0;
		double fahrenheit = 130.0;
		double celsiusToFahren;
		double fahrenToCelsius;
		int i = 10;
		
		System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\t\tCelsius");
		System.out.println("-----------------------------------------------------------------------");
		while (i > 0)
		{
			celsius -= 1;
			fahrenheit -= 10;
			celsiusToFahren = celsiusToFahrenheit(celsius);
			fahrenToCelsius = fahrenheitToCelsius(fahrenheit);
			System.out.printf("%2.1f\t\t %5.1f\t\t", celsius, celsiusToFahren);
			System.out.print("|\t");
			System.out.printf("%8.1f\t\t %5.2f\n", fahrenheit, fahrenToCelsius);
			i--;
		}
	}

	private static double fahrenheitToCelsius(double fahrenheit) 
	{
		double celsius;
		
		celsius = (5.0 / 9) * (fahrenheit - 32);
		
		return celsius;
	}

	private static double celsiusToFahrenheit(double celsius) 
	{
		double fahrenheit;
		
		fahrenheit = (9.0 / 5) * celsius + 32;
		
		return fahrenheit;
	}
}
