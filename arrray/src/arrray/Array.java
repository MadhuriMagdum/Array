package arrray;//3*3 matrix

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int a[][] = new int[3][3];// Declaring 2d array

		for (i = 0; i <= 2; i++)// storing the value of array
		{
			for (j = 0; j <= 2; j++) {
				System.out.print("\n\t enter any value : ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("\n\t*******display the value of array ******* ");

		for (i = 0; i <= 2; i++)// Display the value of array
		{    System.out.print("\n\n\t");
			
		for (j = 0; j <= 2; j++) {
				System.out.print("  " + a[i][j]);
			}
			
		}
	}
}
