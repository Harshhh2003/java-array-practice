
import java.util.Scanner;

public class arrays7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Check if the size of the array is less than 2

        // Input the elements of the array
        System.out.print("Enter the elements in the array: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Input the value of x
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();

        // Find pairs with sum equal to x
        int count = 0;
        for (int i = 0; i < array.length; i++) { // Start i from 0
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] + array[j] == x) {
                    count++;

                } // Corrected loop condition

            }
        }

        // Print the total number of pairs with sum equal to x
        System.out.println("Total number of triplet with sum " + x + " is: " + count);
    }
}
