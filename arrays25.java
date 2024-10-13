public class arrays25{
    static void printarray(int [] array){
        for(int value   :   array){
            System.out.println(value  +  "      ");
        }
    }
    
    static void mergesort(int [] array , int l , int r){
        if(l>=r) return;

        
        int mid = ( l+ r)/2;
        mergesort(array, l, mid);
        mergesort(array, mid +1, r);
        merge( array , l , mid , r);

        
    }
    static void merge( int [] array , int l , int mid , int r){
        int n1 =  mid - l+1;
        int n2 = r- mid;
        int  [] left = new int[n1];
        int [] right = new int [n2];
        for(int i=0; i<n1 ; i ++){
            left[i] =  array[l+i];

        } for(int j=0; j<n2; j++){
            right[j] = array[mid+1+j];

        }  int i=0;  int j=0; int  k=l;
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                array[k] = left[i];
                i++; k++;
            }
            else{
                array[k] = right[j];
                j++; k++;
            }
            while (i < n1) {
                array[k] = left[i];
                i++;
                k++;
            }
    
            while (j < n2) {
                array[k] = right[j];
                j++;
                k++;
            }

        }
    }
    public static void main(String[] args) {
        int [] array =   {   3 , 6 , 1 , 67 , 32};
        int n = array.length;
        System.out.println("before sorting   :    ");
        printarray(array);
      mergesort(array , 0 , n-1);
      System.out.println("after sorting sorting   :   ");
      printarray(array);

    }
}