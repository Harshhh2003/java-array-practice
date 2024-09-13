import java.util.Scanner;

public class arrys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array :  ");
        int size = sc.nextInt();

        System.out.print("enter the elements in the array :   ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("enter the value of x  in the array :   ");
        int x = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("element is present in the array " + "at index " + i);
                found = true;
                break;
            }

        }
        if (!found) {

            System.out.println(-1);
        }
    }
}
