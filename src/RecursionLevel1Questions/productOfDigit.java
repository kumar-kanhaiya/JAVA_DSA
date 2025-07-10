package RecursionLevel1Questions;

public class productOfDigit {
    public static void main(String[] args) {
        System.out.println(ProductOfDigit(505));
    }
    public static int ProductOfDigit(int n ){
        if(n < 1 ){
            return 1;
        }
        return (n%10) * ProductOfDigit(n/10);
    }
}
