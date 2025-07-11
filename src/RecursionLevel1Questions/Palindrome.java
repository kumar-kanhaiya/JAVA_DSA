package RecursionLevel1Questions;

public class Palindrome {
    public static void main(String[] args) {
    isPalindrome(525);
    }
    // normal approach without recursion
    public static void isPalindrome(int number ){
        int real = number;
        int reverse = 0;
        while(number > 0){
            int rem = number%10;
            reverse = reverse*10 + rem;
            number/=10;
        }
        if(real == reverse){
            System.out.println("This is palindrome ");
        }
        else{
            System.out.println("this is not palindrome ");
        }
    }
}
