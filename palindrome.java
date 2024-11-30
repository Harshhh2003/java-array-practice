public class palindrome {
    public static void checkpalindome(int n) {
        int original = n; 
        int rev = 0; 

        if (n < 0) {
            System.out.println("Palindrome is not possible for non-positive number: " + n);
            return; 
        }

      
        while (n > 0) {
            int d = n % 10; 
            rev = rev * 10 + d; 
            n /= 10;
        }

   
        if (rev == original) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        int num1 = 121; 
        int num2 = 125; 


        checkpalindome(num1);
        checkpalindome(num2);
    }
}
