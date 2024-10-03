// bubble sorting
public class array20{
    static void buublesorting(int[] a){
        int n = a.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    int  temp = a[j]; 
                    a[j] = a[j+1]; 
                    
                    
                    
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] array = { 3 , 6 ,1 ,9, 4, 5};
       buublesorting(array);
       for( int i :  array){
        System.out.print(i  +  "   ");

       }
        
    }
}