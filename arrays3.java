import java.util.Scanner;
public class arrays3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array :  ");
    int n = sc.nextInt();
    int [] arr = new int [n];
    System.out.println("enetr the number  of elemnts in the array :   ");
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();

    } int min = arr[0];

    for(int i =1; i<n; i++){
        if(arr[i] <min){
           min = arr[i];
        }


    } 
    System.out.println("min value is found at :    " );
        
    }
}