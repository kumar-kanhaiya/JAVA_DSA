package Recursion;
// finding fibonacci series by using golden formula
// also known as golden ratio
//formula
// 1+ root 5 by 2 == time complexibility bego( 1.6180)^n
public class fibonacciSeriesUsingGoldenFormula {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(fiboFormula(i));
        }

    }
    static int fiboFormula(int n){
        // just for demo use long as int

        return (int)((Math.pow(((1+ Math.sqrt(5)) / 2) , n)  / Math.sqrt(5)));
//        Math.pow(((1 - Math.sqrt(5)) / 2) , n)) you can remove this because it is less dominating term
    }

    // normal way
    static int fibo(int n){
        if(n <2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
