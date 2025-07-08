package BasicsMath;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
        System.out.println(isprime(number));
    }
    static boolean isprime(int number){
        boolean ans = true;
        for (int i = 2; i*i < number ; i++) {
            if(number%i == 0 ){
                ans = false;
                break;
            }
        }
        return ans;
    }
}
