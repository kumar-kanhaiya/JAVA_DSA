package inputeAndOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world ");
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int num1 = input.nextInt();
//        System.out.println("Enter second integer ");
//        int num2 = input.nextInt();
//        System.out.println("Enter third integer ");
//        int num3 = input.nextInt();
//        if(num1>num2 && num1>num3){
//            System.out.println(num1 + " is greatest ");
//        } else if (num2>num1 && num2 > num3) {
//            System.out.println(num2 + " is greatest");
//        }
//        else{
//            System.out.println(num3 + " is greatest ");
//        }
        // first problem
        int max = Math.max(5,Math.max(15,30));
        System.out.println(max);

        //second problem
//        char character = input.next().trim().charAt(0);
//        if(character>='a' && character<='z'){
//            System.out.println("lower case character ");
//        }
//        else{
//            System.out.println("upper case character ");
//        }
//        fibonacci();
        // occurence of 4 in this number
//        int n = 6465446;
//        int count = 0;
//        while(n>=1){
//            int rem = n%10;
//            if(rem == 4){
//                count++;
//            }
//            n = n/10;
//        }
//        System.out.println("occurence of 4 in this integer is " + count);

        //reverse the number
        System.out.print("Please Enter your number : ");
        int number = input.nextInt();
        System.out.print("\nBefore Reverse : " + number);
        int reverse  = 0;
        while(number>0){
            int rem = number%10;
            reverse = reverse*10 + rem;
            number /=10;
        }
        System.out.print("\nAfter Reverse "  + reverse);


    }
    public static void fibonacci(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your last digit ");
        int number = input.nextInt();
        int first = 0 ;
        int second = 1 ;
        System.out.print(first + " ");
        System.out.print(second + " ");
        while(first+second <number){
            int third = first + second;
            System.out.print(third + " ");
            first = second ;
            second = third;
        }
    }
}
