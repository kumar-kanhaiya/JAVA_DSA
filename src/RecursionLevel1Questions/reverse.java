package RecursionLevel1Questions;

public class reverse {
    public static void main(String[] args) {
        System.out.println(rev2(54321));

    }
    // first approach
    static int sum = 0 ;
    static void reverseNumber(int number ){
        if(number < 1 ){
            return;
        }
        int rem = number%10;
        sum = sum*10 +rem;
        reverseNumber(number/10);
    }
    // second approach
    static int rev2(int n){
        int digit = (int)(Math.log10(n)) + 1;
        return helper(n , digit);

    }

    private static int helper(int n, int digit) {
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int) Math.pow(10,digit-1) + helper(n/10 , digit-1);
    }


}
