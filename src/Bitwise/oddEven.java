package Bitwise;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number ;
        System.out.print("Enter the number : ");
        number = input.nextInt();
        System.out.println(isOdd(number));
    }
    static  boolean isOdd(int number ){
        return (number&1) == 1;
    }
}
