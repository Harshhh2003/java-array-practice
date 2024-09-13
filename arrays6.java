import java.util.Scanner;
public class arrays6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);System.out.println("enter the size of the array :    ");
        int n = sc.nextInt();
        System.out.println("enter the number of arrys :     ");
        int array [] = new int [n];
        for(int i =0; i<n; i++){
            array[i] = sc.nextInt();

        
    }  int temp;
for(int  i =0; i<array.length; i++){
    for(int j = i+1; j<array.length; j++){
if(array[i] >array[j]){
    temp = array[i];
    array[i]= array[j];
    array[j] = temp;

}
    } 
}System.out.println("second minimum elemnts is :    "   +  array[1]);
}



}
