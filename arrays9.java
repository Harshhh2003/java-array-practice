import java.util.Scanner;

public class arrays9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the size of the array
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        // Initialize the array and take input
        int[] array = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Find the first repeating value
        int repeatingValue = -1; // Initialize with -1, which means no repeating value found

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    repeatingValue = array[i]; // If repetition found, set the value
                    break; // Break inner loop as we found the first repeating value
                }
            }

        }

        // Output the result
        System.out.println("The first repeating value is: " + repeatingValue);
    }
}
