// triplet sum 
import java.util.Scanner;
public class arrays8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array :  ");
        int size = sc.nextInt();
        System.out.println("enter the elments in the array :    ");
        int [] array = new int[size];
        for(int i =0; i<size; i++){
            array[i]  = sc.nextInt();
        } int count  =0;
        System.out.println("enter the value  of x :    ");
        int x = sc.nextInt();
        for(int i =1; i<array.length-2; i++){
            for(int j = i+1; j<array.length-1; j++){
                for(int k = j+1; k<array.length; k++){
                    if( array[i] + array[j]  + array[k]==x){
count++;
                    }

                }
            }
            
        }        System.out.println("The total number of triplets that sum to " + x + " is: " + count);
    }
}