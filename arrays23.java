//  removing all the  0's and keep it at the end rest element will remain  same code .
public class arrays23{
    static void buublesort2(int [] array){
        int n = array.length;
        for(int i =0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(array[j]==0  && array[j+1]!=0){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        int [] array = { 4 , 0 , 0 , 2 ,1 , 79};
        buublesort2(array);
        for( int i : array){
            System.out.println(i  +   "    ");
        }
        
    }
}