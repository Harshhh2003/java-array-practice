public class arrays27 { 
    static int searchelement(int[] array, int key) {
        int low = 0; 
        int high = array.length - 1;
 
        while (low <= high) {
            int mid = (low + high) / 2;
 
            if (array[mid] == key) {
                return mid;
            }
 
            if (array[low] <= array[mid]) {
                if (key >= array[low] && key < array[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (key > array[mid] && key <= array[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
 
    public static void main(String[] args) {
        int[] array = {20, 30, 40, 50, 60, 5, 10};
        int key = 5;
        int ans = searchelement(array, key);
        System.out.println(ans);
    }
 }
 