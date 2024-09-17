
import java.util.Scanner;

public class arrays16 {
    // Method to print 2D array (matrix)
    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "   ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Method to rotate matrix 90 degrees clockwise
    static void rotateMatrix90DegreesClockwise(int[][] matrix, int row, int column) {
        int[][] rotated = new int[column][row]; // Create a new matrix to 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                rotated[j][row - 1 - i] = matrix[i][j];
            }
        }
        System.out.println("Matrix after 90 degrees clockwise rotation:       ");
        printArray(rotated); 
    }

    // Method to reverse each row of a 2D array (matrix)
    static void reverseEachRow(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int start = 0;
            int end = array[i].length - 1;
            while (start < end) {
                // Swap elements
                int temp = array[i][start];
                array[i][start] = array[i][end];
                array[i][end] = temp;

                // Move towards the center
                start++;
                end--;
            }
        }
        System.out.println("Matrix after reversing each row:");
        printArray(array); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Original Matrix:");
        printArray(a); // Print the original matrix

    
        rotateMatrix90DegreesClockwise(a, r1, c1);

        reverseEachRow(a);
    }
}
