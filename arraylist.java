
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        // wrapper classes
        Integer i = Integer.valueOf(1000);
        System.out.println(i);
        
        Float j = Float.valueOf(4.90f);
        System.out.println(j);
        
        ArrayList<Integer> l1 = new ArrayList<>();
        // add new elements
        l1.add(10);
        l1.add(11);
        l1.add(23);
        l1.add(34);
        
        // get an element
        System.out.println(l1.get(2));
        
        // print all elements using a for loop
        for (int k = 0; k < l1.size(); k++) {
            System.out.println(l1.get(k));
        }
    }
}
