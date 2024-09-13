import java.util.Scanner;
public class arrays4{
    public static void main (String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the size of the arrays :    ");
        int n = sc.nextInt();
System.out.println("enter the elements in the array:    ");
int [] arr = new int [n];
for(int i =0; i<n; i++){
    arr[i] = sc.nextInt();

}  System.out.println("enter the value of x  :    ");
int x = sc.nextInt(); int count =0;
for(int i =1; i<n; i++){
   if(arr[i] > x){
    count ++;

   }

} System.out.println(" number of elements greater than  "  + x  +  "are" + count);
        
     
        
    }

}


  
        