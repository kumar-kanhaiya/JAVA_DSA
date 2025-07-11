package RecursionLevel1Questions;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPali(525));
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

    // second approach using recursion
    static int rev(int number ){
        int digit = (int) (Math.log10(number))+ 1 ;
        return target(number , digit);
    }

    private static int target(int number, int digit) {
        if(number%10 == number){
            return number;
        }
        int rem = number%10;
        return rem * (int) Math.pow(10,digit-1) + target(number/10 , digit -1);
    }
    static boolean isPali(int number ){
        return (number == rev(number));
    }
}
