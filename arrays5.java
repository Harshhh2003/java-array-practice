//  sorted or not question 
import java.util.Scanner;

public class arrays5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input the elements of the array
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Check if the array is sorted
        boolean isSorted = true;  // Assume the array is sorted initially

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {  // If an element is smaller than the previous one
                isSorted = false;  // The array is not sorted
                break;  // No need to check further, exit the loop
            }
        }

        // Output the result
        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
