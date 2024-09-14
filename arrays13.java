//  2d array matrix addition question:
import java.util.Scanner;
public class arrays13{
    static void printarray(int [][] array){
        for(int i =0; i<array.length; i++){
            for(int j =0; j<array[i].length; j++){
System.out.print(array[i][j]  +   "   ");
            } System.out.println(); 
        
        
        } 
        } 
      

    
    static void add(int [][] a ,  int r1,  int c1 , int [][] b , int r2 , int c2 ){
        if(r1!=r2 || c1!=c2){
            System.out.println("addition not possible wrong dimesnion");
        return; } int [][] sum = new int[r1][c1];
        for(int i =0; i<r1; i++){
            for(int j=0; j<c1; j ++){
                sum [i][j] =   a[i][j]  + b[i][j];
            }
        } printarray(sum);
        } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows:    ");
        int r1 

    }
}