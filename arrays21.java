public class arrays21{
    static void selectionsorting(int [] a){
        int n = a.length; 
        for(int i=0; i<n-1; i++){
            int min =i;
            for(int j=i+1; j<n; j++){
                if(a[j]<a[min]){
                    min = j;
                }

            }if(min!=i){
                swap(a , min , i);
            }
        } 
    }
    static void swap(int [] a , int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        int [] array = { 10 , 2 , 3, 89 , 34};
        selectionsorting(array);
        for( int i  :  array){
            System.out.println(i  +   "    ");
        }
        
    }
}