package Recursion;

public class Basics {
    public static void main(String[] args) {
//        print(1);
        System.out.println(fibonacciSeries(3));


    }
    public static void print(int n ){
        // if we not using this base condition the loop run infinite time .
        // it run again and again and every call will take some memory
        // one time memory of computer will excead the limit -> stack overflow error
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // recursive call
        // if you are calling a function again and again , you can treat it as a separate call in the stack
        print(n + 1);
    }
    public static int fibonacciSeries(int n){
        if(n == 0){
            return  0 ;
        }
        if(n == 1){
            return 1;
        }
        return (n + fibonacciSeries(n-1));
    }

}
