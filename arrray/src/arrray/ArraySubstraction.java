package arrray;

import java.util.Scanner;

public class ArraySubstraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j = 0 ;
		int a[][] = new int[3][3];// Declaring 2d array
		int b[][] = new int[3][3];
		for (i = 0; i <= 2; i++)// storing the value of array
		{
			for (j = 0; j <= 2; j++) {
				System.out.print("\t enter any value for a : ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("\n\n\n\t*******display the value of array a= ******* ");
		for (i = 0; i <= 2; i++)// Display the value of array
		{
			System.out.print("\n\n\t");
			for (j = 0; j <= 2; j++) {
				System.out.print("  " + a[i][j]);
			}
		}
		System.out.println("\n\n");
		for (i = 0; i <= 2; i++)// storing the value of array
		{
			for (j = 0; j <= 2; j++) {
				
				System.out.print("\t enter any value for b : ");
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\n\n\n\t*******display the value of array b= ******* \n\n\t");
		for (i = 0; i <= 2; i++)// Display the value of array
		{
			System.out.print("\n\n\t");
			for (j = 0; j <= 2; j++) {
				System.out.print("  " + b[i][j]);
			}
		}
		System.out.println("\n\t*******display the value of multiplication array ******* ");
		
		int diff [][]=new int [i][j];
		for (i = 0; i <= 2; i++)// store the value of array
		{
			System.out.print("\t");
			for (j = 0; j <= 2; j++) {
				
				diff [i][j]= a[i][j] - b[i][j];
		}}
		System.out.println("display substraction\n\n\t");
		for (i = 0; i <= 2; i++)// Display the value of array
		{
			System.out.print("\n\n\t");
			for (j = 0; j <= 2; j++) {
				System.out.print("  " + diff[i][j]);
			}
		}
	}
}
