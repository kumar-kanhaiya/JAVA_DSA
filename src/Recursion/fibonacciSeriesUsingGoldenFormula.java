package Recursion;
// finding fibonacci series by using golden formula
// also known as golden ratio
//formula
// 1+ root 5 by 2 == time complexibility bego( 1.6180)^n
public class fibonacciSeriesUsingGoldenFormula {
    public static void main(String[] args) {

    }
    static int fiboFormula(int n){
       return (int)Math.pow(((1+ Math.sqrt(5)) / 2) , n) ;
    }

    // normal way
    static int fibo(int n){
        if(n <2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
