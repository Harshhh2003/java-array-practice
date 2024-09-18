//  reverse  arraylist
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist2{
    static void reversearraylist(ArrayList<Integer> List){
        int i =0; 
        int  j= List.size() -1;
        while(i<j){
            Integer temp = Integer.valueOf(List.get(i));
            List.set(i, List.get(j));
            List.set(j, temp); 
            i++; 
            j--;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(20); list.add(29);
        list.add(34); list.add(67);
        list.add(100);
        System.out.println("original list   "   +   list);

        
     reversearraylist(list);
     System.out.println("reverse list is   "    +   list);

    }
}