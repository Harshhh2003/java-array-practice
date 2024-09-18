import java.util.ArrayList;
import java.util.Collections;

public class arraylist3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(29);
        list.add(3);
        list.add(67);
        list.add(100);
        System.out.println("Original list: " + list);

        // Reverse the list
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);

        // Sort the list
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }
}
