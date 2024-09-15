//  matrix multiplication
import java.util.Scanner;

public class arrays14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first matrix
        System.out.println("Enter the number of rows of the first matrix: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of columns of the first matrix: ");
        int c1 = sc.nextInt();
        int[][] matrix1 = new int[r1][c1];
        
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("Enter the number of rows of the second matrix: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of columns of the second matrix: ");
        int c2 = sc.nextInt();

        // Check if matrices are compatible for multiplication
        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible with these sizes.");
            return;
        }

        int[][] matrix2 = new int[r2][c2];
        
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }


        int[][] result = new int[r1][c2];

      
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < c1; k++) { // or r2 since c1 == r2
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display the result
        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

       
    }
}
