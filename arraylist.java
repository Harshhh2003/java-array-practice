
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
        // for (int k = 0; k < l1.size(); k++) {
        //     System.out.println(l1.get(k));
        //     System.out.println(l1);
            //   adding new element at index1 
         l1.add(1, 2000);
         System.out.println(l1);
        //    modify the  value oof index 1
        l1.set(1, 21);
        System.out.println(l1);
        //  to remove any elemnt 
        l1.remove(4);
        System.out.println(l1);
        // removing an elemnt without using its index
        l1.remove(Integer.valueOf(11));
        System.out.println(l1);
        // checking if the element is present or not
        boolean ans  = l1.contains(Integer.valueOf(45));
        System.out.println(ans);
        }
    }

