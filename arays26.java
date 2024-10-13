public class arays26{
    static int  binarysearch(int [] array, int target){
        int low =0; int high = array.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(array[mid]== target){
                return mid;
            }
            else if(array[mid]>target){
                high= mid-1;
            } else{
                low = mid+1;
            }
        } return -1;


    }
    public static void main(String[] args) {
        int [] array = { 4, 6, 23 , 78 , 143,221};
        int target = 78;
        int result=  binarysearch(array, target);
        if(result != -1){
            System.out.println("element found at index   :   "   + result);
        } else{
            System.out.println("not found ");
        }

    }
}