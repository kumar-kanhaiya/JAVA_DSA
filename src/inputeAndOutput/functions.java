package inputeAndOutput;

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        isprime();
        isArmStrong();

    }
    static void isprime(){

    Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number : ");
    int number = input.nextInt();

    boolean check = true;
    if(number<=1){
        check = false;
    }
    for(int i = 2 ; i*i < number ; i++){
        if(number%i == 0){
            check = false;
            break;
        }
    }
    if(check){
        System.out.println("This is a prime number ");
    }
    else{
        System.out.println("this is not a prime number ");
    }

    }
     static void isArmStrong(){
        Scanner input = new Scanner(System.in);
         System.out.print("Please enter your number :");
         int number = input.nextInt();
         int real  = number;
         int check = 0;
         while(number>0){
             int rem = number%10;
             check += (int)Math.pow(rem,3);
             number /= 10;
         }
         if(check == real){
             System.out.println("This is a armstrong number ");
         }
         else{
             System.out.println("this is not a armstrong number ");
         }
     }
}
