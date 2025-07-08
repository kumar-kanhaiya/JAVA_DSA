package BasicsMath;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
//        System.out.println(isprime(number));
        for (int i = 0; i <= number ; i++) {
            System.out.println(i + " " + isprime(i));
        }
    }
    static boolean isprime(int number){
        if(number <= 1){
            return false;
        }
//        boolean ans = true;
        for (int i = 2; i*i <= number ; i++) {
            if(number%i == 0 ){
                return false;
            }
        }
        return true;
    }
}
