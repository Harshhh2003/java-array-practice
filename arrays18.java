// import java.util.Scanner;

// public class arrays18 {
//     static void printmatrix(int[][] array) {
//         for (int i = 0; i < array.length; i++) {
//             for (int j = 0; j < array[0].length; j++) {
//                 System.out.print(array[i][j] + "   ");
//             }
//             System.out.println();
//         }
//     }

//     static void transposematrix(int[][] matrix, int row, int column) {
//         int[][] transpose = new int[column][row];
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < column; j++) {
//                 transpose[j][i] = matrix[i][j];
//             }
//         }
//         System.out.println("Transpose of this matrix is:");
//         printmatrix(transpose);
        
//     }

//     static void swapping(int [][] matrix){
//         for(int i=0; i<matrix.length; i++){
//             int start =0;
            
//              int end = matrix[i].length-1;
//              while (start< end){
//              int temp = matrix[i][start];
//              matrix[i][start] = matrix[i][end];
//              matrix[i][end] = temp;
//             }
//         } 
// System.out.println("tranpose matrix is    :      ");
// printmatrix(matrix);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows:");
//         int r = sc.nextInt();
//         System.out.println("Enter the number of columns:");
//         int c = sc.nextInt();

//         int[][] a = new int[r][c];
//         System.out.println("Enter the elements:");
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 a [i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Matrix 1:");
//         printmatrix(a);

//         // Transpose matrix
//         transposematrix(a, r, c);
//     }
// }
import java.util.Scanner;

public class arrays18 {

    static void printmatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
    }

    static void transposematrix(int[][] matrix, int row, int column) {
        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose of the matrix:");
        printmatrix(transpose);
        // Reverse each row of the transposed matrix to achieve 90 degrees rotation
        reverseRows(transpose);
    }

    static void reverseRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[i].length - 1;
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
        System.out.println("Matrix after 90 degrees clockwise rotation:");
        printmatrix(matrix);
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        System.out.println("Enter the elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printmatrix(a);

        // Transpose and rotate the matrix
        transposematrix(a, r, c);
    }
}
