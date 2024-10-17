public class arrays29 {
    static int findMaxIndex(int[] array) {
        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (array[mid] < array[high]) {
                high = mid - 1;  
            } else {
                low = mid; 
            }
        }

        return low; // Yeh max element ka index hoga
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 1, 2, 3};
        int result = findMaxIndex(array);
        System.out.println("Maximum element found at index: " + result);
        System.out.println("Maximum element is: " + array[result]);
    }
}
