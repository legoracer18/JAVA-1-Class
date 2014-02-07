package src;

/*
James Park
CIT 210 Section 1
Program 7.2
10/16/12

public static void main(String[] args)
	use getInput() to get the matrix
	call function sumMajorDiagonal()
	Display result as "Sum of the elements in the major diagonal is " + sum
private static double[][] getInput()
	Prompt: "Enter a 4-by-4 matrix row by row: "
	Read matrix into an array.
public static double sumMajorDiagonal(double[][] m)
	add the elements of the major diagonal
	To add them, m[0][0] + m[1][1] + m[2][2]....
	return sum
*/

import java.util.Scanner;
public class A07_2 {
	public static void main(String[] args) {
		double[][] matrix = getInput();
		double sum = 0;
		
		sum = sumMajorDiagonal(matrix);
		System.out.println("Sum of the elements in the major diagonal is " + sum);
	}

	private static double[][] getInput() {
		Scanner input = new Scanner (System.in);
		double[][] temp = new double[4][4];
		System.out.println("Enter a 4-by-4 matrix row by row:");
		for (int row = 0; row < temp.length; row++) {
			for (int col = 0; col < temp[row].length; col++) {
				temp[row][col] = input.nextDouble();
			}
		}
		input.close();
		return temp;
	}

	private static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		int length = m.length;
		
		for (int i = 0; i < length; i++) {
			if (i != length) {
				sum += m[i][i];
			}
		}
		
		return sum;
	}
}
