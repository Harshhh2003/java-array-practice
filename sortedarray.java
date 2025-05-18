import java.util.*;
public class sortedarray{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of array :  "  );
    int n = sc.nextInt();
    int [] arr = new int[n];
    System.out.println(" add elemnts in the array :  ");
    for(int i=0; i<arr.length; i++){
       arr[i] = sc.nextInt();
    }
    boolean isSorted = true;
// assuming the given array is alreadyy sorted
for(int i=1; i<n; i++){
    if(arr[i] < arr[i-1]){
        isSorted = false; // sorted nahi hai
        break;

    }
    
  }
  if(isSorted){
    System.out.println("given array is sorted");
  } else{
    System.out.println("not");
  }

}
}