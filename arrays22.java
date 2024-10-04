public class arrays22{ 
    //  insertion sorting
    static void insertionsort(int [] array){
        int n = array.length;
        for(int i=1; i<n ; i++){ 
            
            
            int temp = array[i];
            int j = i-1;

            while(j>=0 && array[j] > temp){
                array[j+1]=array[j]; j--;
            } array[j+1] = temp;


        } 
    }
    

    
    
    public static void main(String[] args) {
        int [] array = { 23, 1, 87 ,34, 50};
        insertionsort(array);
        for(int i : array){
            System.out.println(i +  "   ");
        }

    
    
}
 
}