public class secondlargestarray{
    public static void main(String[] args) {
        int [] arr = {  4 ,  20 , 50 , 21 , 23};
        int max = arr[0]; // 1st element ko maximum assume kr rhe
        int n = arr.length;
        for(int i=1; i<n ; i++){
            if(arr[i] > max){
                max = arr[i]; // agar 1st idx se last take me koii max se bada mila tho usko max bana denge
            }
        } int secondmax = -1;
        for (int i = 0; i < arr.length; i++) {
    if (arr[i] != max && arr[i] > secondmax) {
        secondmax = arr[i];  // max ke alawa jo sabse bada ho, use secondMax bana do
    }
}
System.out.println("second largest element in the gioven arr is  "  +   secondmax);
        
    }
}