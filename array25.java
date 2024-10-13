
public class array25 {
    static void quicksort(int[] array, int low, int high) {
        if (low >= high) return; 

        int mid = (low + high) / 2;
        int pivot = array[mid];  // Choosing middle element as pivot

        int i = low, j = high;
        
        // Partitioning the array
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                // Swap the elements
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

      
        if (low < j) quicksort(array, low, j);
        if (i < high) quicksort(array, i, high);
    }

    public static void main(String[] args) {
        int[] array = {34, 7, 23, 32, 5, 62};
        quicksort(array, 0, array.length - 1);

     
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
