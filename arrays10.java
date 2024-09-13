import java.util.Scanner;

public class arrays10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Check if the size of the array is less than 1
        
        // Input the elements of the array
        System.out.println("Enter the elements in the array: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Print the original array
        System.out.println("Original array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        // Reverse the array
        System.out.println("Reversed array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
