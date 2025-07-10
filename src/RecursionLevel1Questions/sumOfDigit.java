package RecursionLevel1Questions;

public class sumOfDigit {
    public static void main(String[] args) {
        System.out.println(sum(5820));
    }
    public static int sum(int number ){
        if(number < 1){
            return 0;
        }
        int rem = number %10;
        return rem + sum(number/10);
    }
}
