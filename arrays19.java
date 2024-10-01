public class arrays19 {
    public static void main(String[] args) {
        int[] array = {10, 20, 21, 12, 67};
        
        // Print original array
        System.out.println("Original array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }

        System.out.println();
        
        // Sorting the array
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {  // Fixed the condition here
                if (array[i] > array[j]) {
                    // Swap the elements
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }
    }
}
