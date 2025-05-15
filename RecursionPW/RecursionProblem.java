package RecursionPW;

import java.util.Scanner;

public class RecursionProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number ;
        System.out.print("Enter your number : ");
        number = input.nextInt();
        System.out.println("Factorial of " + number + " is : " + factorial(number));
        System.out.println(fibonacciNumber(6));
    }
    public static int factorial(int number ){
        if(number == 1){
            return 1;
        }
        return number*factorial(number - 1 );
    }
    public static int fibonacciNumber(int number ){
        if(number == 0){
            return 0 ;
        }
        if(number == 1){
            return 1 ;
        }
        return fibonacciNumber(number-1) + fibonacciNumber(number-2);
    }
}
