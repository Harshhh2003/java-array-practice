
//  2d array matrix addition question:
import java.util.Scanner;

public class arrays13 {
    static void printarray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();

        }
    }

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("addition not possible wrong dimesnion");
            return;
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
  
            }
        }
        System.out.println("sum of matrix 1 and matrix 2  is :  ");
        printarray(sum);
   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        System.out.println("enter the number of rows  of mat 1 :      ");
        int r1 = sc.nextInt();
        System.out.println("enter the number of column of mat 2 :   ");
        int c1 = sc.nextInt();
        int [][] a = new int[r1][c1];
       
        System.out.print("elements are :  ");
        for(int i =0; i<r1; i++){
            for(int j=0; j<c1;j ++){
                a[i][j] = sc.nextInt();
            }
        }
       System.out.println("enter the row 2 : ");
        int r2 = sc.nextInt();
        System.out.println("enter the column 2 ");
        int c2 = sc.nextInt();
        int [][] b = new int [r2][c2];
        System.out.println("elemts are  :  ");
        for(int i =0; i<r2; i++){
            for(int j=0; j<c2;j ++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix 1");
        System.out.println(a);
        System.out.println("amtrix b"); System.out.println(b);
        add(a, r1, c1, b, r2, c2);
        

    }
}