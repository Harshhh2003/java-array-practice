import java.util.Scanner;
public class arrays17{
    static void printmatrix(int [][] array){
        for(int i =0; i<array.length; i++){
            for(int j =0; j<array.length; j++){
                System.out.println(array[i][j]   +  "   ");
            } System.out.println();
        }

    } static void transposematrix(int [][] matrix , int row , int column){
        int [][] tranpose = new int [column][row];
        for(int i =0; i<row; i++){
            for(int j=0; j<column; j++){
                tranpose[j][i] = matrix[i][j];
            }
        }System.out.println("transpose of this matrix is   :  ");
        printmatrix(tranpose);

    }
    static void swappingmatrix(int [][] matrix, int i , int j){
        int temp =  matrix[i][j];
        matrix [i][j] = matrix[j][i];
        matrix[j][i]= temp;
       
 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows   :  ");
        int r = sc.nextInt();
        System.out.println("enter the column  :     "); int c = sc.nextInt();
        int a [][] = new int[r][c];
        System.out.print("enter the elments   :  ");
        for(int i =0; i<r; i++){
            for(int j=0; j<c; j++){
                a [i][j] = sc.nextInt();
            }
        } System.out.println("matrix  1 :  ");
        printmatrix(a);
        swappingmatrix(a, r, c);
        transposematrix(a, r, c);
    }
}