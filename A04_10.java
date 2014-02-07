package src;

/*
James Park
CIT 210 Section 1
Program 4.10
10/3/12

Start counting from 100 up to 1000
Check to see if each number is divisible by 5 and 6
Add to the line of numbers
At ten numbers on a line, make a new line
*/
public class A04_10 
{
	public static void main(String[] args) 
	{
		int count = 100;
		int i = 1;
		
		while (count <= 1000)
		{
			if (((count % 5) == 0) && ((count % 6) == 0))
			{
				if (i < 10)
				{
					System.out.print(count + " ");
					i++;
				}
				else
				{
					System.out.println(count);
					i = 1;
				}
			}
			count++;
		}
	}
}
