package src;

import java.util.Scanner;

/*
James Park
CIT 210 Section 1
Program 7.5
10/18/12

public static void main(String[] args)
	Use getInput to get matrices
	call method addMatrix()
	call output()
private static double[][] getInput()
	Prompt for input
	Read matrix into an array.
public static double[][] addMatrix(double[][] a, double[][]b)
	add the two matrices together using this format:
		a[0][0] + b[0][0] = c[0][0]
		a[0][1] + b[0][1] = c[0][1]
		...
		a[3][2] + b[3][2] = c[3][2]
		a[3][3] + b[3][3] = c[3][3]
	return result as c matrix
*/
public class A07_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double count = 1;
		//double[][] matrixA = getInput(count);
		double[][] matrixA = new double[3][3];
		System.out.print("Enter Matrix" + (int)count + ": ");
		for (int row = 0; row < matrixA.length; row++) {
			for (int col = 0; col < matrixA[row].length; col++) {
				matrixA[row][col] = input.nextDouble();
			}
		}
		count++;
		//double[][] matrixB = getInput(count);
		double[][] matrixB = new double[3][3];
		System.out.print("Enter Matrix" + (int)count + ": ");
		for (int row = 0; row < matrixB.length; row++) {
			for (int col = 0; col < matrixB[row].length; col++) {
				matrixB[row][col] = input.nextDouble();
			}
		}
		double[][] matrixC;
		
		matrixC = addMatrix(matrixA, matrixB);

		output(matrixA, matrixB, matrixC);
		
		input.close();
	}
	
	private static void output(double[][] matrixA, double[][] matrixB,
			double[][] matrixC) {
		int row = 0;
		int col = 0;
		int count;
		
		System.out.println("The matrices are added as follows");
		while (row < matrixA.length) {
			System.out.print(" ");
			if (row == 1) {
				count = matrixA[row].length;
				col = 0;
				while (col < count) {
					System.out.print(matrixA[row][col] + " ");
					col++;
				}
				System.out.print(" +   ");
				count = matrixB[row].length;
				col = 0;
				while (col < count) {
					System.out.print(matrixB[row][col] + " ");
					col++;
				}
				System.out.print(" =    ");
				count = matrixC[row].length;
				col = 0;
				while (col < count) {
					System.out.print(matrixC[row][col] + " ");
					col++;
				}
				System.out.println("");
				row++;
			}
			else {
				count = matrixA[row].length;
				col = 0;
				while (col < count) {
					System.out.print(matrixA[row][col] + " ");
					col++;
				}
				System.out.print("     ");
				count = matrixB[row].length;
				col = 0;
				while (col < count) {
					System.out.print(matrixB[row][col] + " ");
					col++;
				}
				System.out.print("      ");
				count = matrixC[row].length;
				col = 0;
				while (col < count) {
					System.out.print(matrixC[row][col] + " ");
					col++;
				}
				System.out.println("");
				row++;
			}
		}
	}

	private static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] temp = new double[3][3];
		
		for (int row = 0; row < temp.length; row++) {
			for (int col = 0; col < temp[row].length; col++) {
				temp[row][col] = a[row][col] + b[row][col];
			}
		}
		
		return temp;
	}
}
