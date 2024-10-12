//  merge sorting
public class arrays24 {
    static void displayarray(int[] array) {
        for (int val : array) {
            System.out.print(val + "    ");
        }
        System.out.println();
    }

    static void mergesort(int[] array, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;

        mergesort(array, l, mid);
        mergesort(array, mid + 1, r);
        merge(array, l, mid, r);
    }

    static void merge(int[] array, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = array[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 7, 8, 3};
        int n = array.length;

        System.out.println("before sorting array:");
        displayarray(array);

        mergesort(array, 0, n - 1);

        System.out.println("after sorting array:");
        displayarray(array);
    }
}
