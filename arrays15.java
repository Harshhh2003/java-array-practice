
import java.util.Scanner;
public class  arrays15{
    static void printarray(int [][] array){
        for(int i =0; i<array.length; i++){
            for(int j =0; j<array[i].length; j++){
                System.out.print(array[i][j] +   "   ");
            }System.out.println();

        }
    }
    
    static void transpaosematrix(int [][] matrix  , int row, int column ){
//  dimensions r swapped for transpose method
        int [][] transpose = new int[column][row];  

        for(int i =0; i<row; i++){
    for( int j =0; j<column; j++){
  transpose[j][i] = matrix[i][j];

    }
}
System.out.println("Transpose of the matrix is:   ");
        printarray(transpose);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter the size of row 1 :  ");
int r1 = sc.nextInt();
System.out.println("enter the column  1  :  ");
int c1 = sc.nextInt();
int [][] a = new int [r1][c1];
System.out.print(" enter the elemnts in row 1 and column 1   :  ");
for(int i=0; i<r1; i++){
    for(int j=0; j<c1; j++){

        a [i][j] = sc.nextInt();
        
    }
} System.out.println(" matrix 1   : "); printarray(a);

transpaosematrix(a, r1, c1);


    }
}