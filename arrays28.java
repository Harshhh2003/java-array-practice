public class arrays28 {
    static int findMinIndex(int[] array) {
        int low = 0;  
        int high = array.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (array[mid] > array[high]) {
                low = mid + 1; 
            } else {
                high = mid; 
            }
        }

        return low; 
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 1, 2, 3};
        int result = findMinIndex(array);
        System.out.println("Minimum element found at index: " + result);
        System.out.println("Minimum element is: " + array[result]);
    }
}
