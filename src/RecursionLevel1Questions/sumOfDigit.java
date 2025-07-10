package RecursionLevel1Questions;

public class sumOfDigit {
    public static void main(String[] args) {
        System.out.println(sum(5820));
    }
    public static int sum(int number ){
        if(number < 1){
            return 0;
        }

        return (number%10) + sum(number/10);
    }
}
