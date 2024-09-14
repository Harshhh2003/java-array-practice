//   how to write 2d array code
import java.util.Scanner;
public class arrays12{
    static void printarray(int [][] array){
        for(int i =0; i<array.length; i++){
            for(int j =0; j<array[i].length; j++){
System.out.print(array[i][j]  +   "   ");
            } System.out.println(); 
        
        
        }
        } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows  :      ");
        int r = sc.nextInt();
        System.out.println("enter the number of column :   ");
        int c = sc.nextInt();
        int [][] array = new int[r][c];
        System.out.println("enter "   + r*c  +  "elements :   "
        );
        for(int i =0; i<r; i++){
            for(int j=0; j<c;j ++){
                array[i][j] = sc.nextInt();
            }
        }
        
        
        
        
        printarray(array);
        
            
    }
}