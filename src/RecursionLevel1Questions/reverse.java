package RecursionLevel1Questions;

public class reverse {
    public static void main(String[] args) {
    reverseNumber(123);
    }
    public static void reverseNumber(int number ){
        if(number < 1 ){
            return ;
        }
//        return (number%10) * 10 + reverseNumber(number/10);
        int rem = (number%10);
        int ans = 0;
        ans = ans*10 +  rem ;
        reverseNumber(number/10);
        System.out.print(ans);

    }
}
