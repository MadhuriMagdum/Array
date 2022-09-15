package arrray;
import java.util.Scanner;
public class ArrayMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int a[][] = new int[3][3];// Declaring 2d array
		int b[][] = new int[3][3];
		   for (i = 0; i <= 2; i++)// storing the value of array
		   			{for (j = 0; j <= 2; j++) {
		   			System.out.print("\t enter any value for a : ");
		   			a[i][j] = sc.nextInt();
		   			}}
		   System.out.println("\n\t*******display the value of array ******* ");
		   for (i = 0; i <= 2; i++)// Display the value of array
		   			{System.out.print("\n\n\t");
		   			for (j = 0; j <= 2; j++) {
		   				System.out.print("  " + a[i][j]);
		   			}}
		
		   for (i = 0; i <= 2; i++)// storing the value of array
		   		{for (j = 0; j <= 2; j++) {
		   				System.out.print("\t enter any value for b : ");
		   				b[i][j] = sc.nextInt();
		   		}}
		System.out.println("\n\t*******display the value of array ******* ");
			for (i = 0; i <= 2; i++)// Display the value of array
			{ System.out.print("\n\n\t");
				for (j = 0; j <= 2; j++) {
				System.out.print("  " + b[i][j]);
				}}
        System.out.println("\n\t*******display the value of multiplication array ******* ");
			for (i = 0; i <= 2; i++)// Display the value of array
					{System.out.print("\n\n\t");
						for (j = 0; j <= 2; j++) {
							System.out.print("  " + a[i][j] * b[i][j]);
		}
		}
	}
}
