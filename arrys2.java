import java.util.Scanner;
public class arrys2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array :  ");
        int size = sc.nextInt();
     
      
System.out.print("enter the elements in the array :   ");
        int [] array = new int [size];
        for(int i =0; i<size; i++){
            array[i]= sc.nextInt();

        }
   
   
         int max = array[0];
         for(int i =1; i<array.length; i++){
            if(array[i]>max){
               max = array[i];
            }
         }
            System.out.println("the max value  in this array is :   " +  max);
        }

        
    }
