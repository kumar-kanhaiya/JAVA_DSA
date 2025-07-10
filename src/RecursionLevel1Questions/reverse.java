package RecursionLevel1Questions;

public class reverse {
    public static void main(String[] args) {
    reverseNumber(123);
        System.out.println(sum);

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
}
