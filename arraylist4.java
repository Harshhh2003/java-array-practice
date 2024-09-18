//  sorting in descending order
import java.util.ArrayList;
import java.util.Collections;
public class arraylist4{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(29);
        list.add(3);
        list.add(67);
        list.add(100);
        list.add(456);
        System.out.println("Original list: " + list);
Collections.sort(list , Collections.reverseOrder());
System.out.println(  " descending order list is   "   +  list);
        
    }
    
}
